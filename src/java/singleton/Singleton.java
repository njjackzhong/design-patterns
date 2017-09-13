package singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {

    static boolean firstThread = true;
    private static Singleton Instance = null;
    String[] scrabbleLetters = {"a", "a", "a", "a", "b", "b", "c", "c", "d", "d", "e", "e", "f", "g", "h", "k"};
    private LinkedList<String> letterList = new LinkedList<>(Arrays.asList(scrabbleLetters));

    private Singleton() {
    }

    public static Singleton getInstance() {

        if (Instance == null) {

            if (firstThread) {

                firstThread = false;

                Thread.currentThread();
                try {
                    Thread.sleep(1);
                } catch (Exception ignored) {

                }

            }

            synchronized (Singleton.class) {

                if (Instance == null) {

                    Instance = new Singleton();

                    Collections.shuffle(Instance.letterList);

                }

            }
        }
        return Instance;

    }


    public LinkedList<String> getLetterList() {

        return Instance.letterList;


    }

    public LinkedList<String> getTiles(int howManyTiles) {

        LinkedList<String> tilesToSend = new LinkedList<>();

        for (int i = 0; i <= howManyTiles; i++) {

            tilesToSend.add(Instance.letterList.remove(0));


        }

        return tilesToSend;

    }

}
