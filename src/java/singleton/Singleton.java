package singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {

    private static boolean firstThread = true;
    private static Singleton firstInstance = null;
    private String[] scrabbleLetters = {"a", "a", "a", "a", "b", "b", "c", "c", "d", "d", "e", "e", "f", "g", "h", "k"};
    private LinkedList<String> letterList = new LinkedList<>(Arrays.asList(scrabbleLetters));

    private Singleton() {
    }

    public static Singleton getInstance() {

        if (firstInstance == null) {

            if (firstThread) {

                firstThread = false;

                Thread.currentThread();
                try {
                    Thread.sleep(1);
                } catch (Exception ignored) {

                }

            }

//            synchronized (Singleton.class) {
            {
                if (firstInstance == null) {

                    firstInstance = new Singleton();

                    Collections.shuffle(firstInstance.letterList);

                }

            }
        }
        return firstInstance;

    }


    public LinkedList<String> getLetterList() {

        return firstInstance.letterList;


    }

    public LinkedList<String> getTiles(int howManyTiles) {

        LinkedList<String> tilesToSend = new LinkedList<>();

        for (int i = 0; i <= howManyTiles; i++) {

            tilesToSend.add(firstInstance.letterList.remove(0));


        }

        return tilesToSend;

    }

}
