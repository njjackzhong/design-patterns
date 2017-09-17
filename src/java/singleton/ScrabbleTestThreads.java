package singleton;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ScrabbleTestThreads {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(ScrabbleTestThreads::process);
        executorService.submit(ScrabbleTestThreads::process);
        executorService.submit(ScrabbleTestThreads::process);
        executorService.submit(ScrabbleTestThreads::process);
        executorService.submit(ScrabbleTestThreads::process);
        executorService.submit(ScrabbleTestThreads::process);
        executorService.submit(ScrabbleTestThreads::process);
        executorService.submit(ScrabbleTestThreads::process);
        executorService.submit(ScrabbleTestThreads::process);
        executorService.submit(ScrabbleTestThreads::process);

        executorService.shutdown();

    }


    private static void process(){
        Singleton newInstance = Singleton.getInstance();

        System.out.println("Instance ID: " + System.identityHashCode(newInstance));

        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerOneTiles = newInstance.getTiles(2);

        System.out.println("Player : " + playerOneTiles);

    }
}
