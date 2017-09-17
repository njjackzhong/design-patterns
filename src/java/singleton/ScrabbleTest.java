package singleton;

import java.util.LinkedList;

public class ScrabbleTest {

    public static void main(String[] args) {

        Singleton newInstance = Singleton.getInstance();

        System.out.println("Instance ID: " + System.identityHashCode(newInstance));

        System.out.println("Get letter list: " + newInstance.getLetterList());

        LinkedList<String> playerOneTiles = newInstance.getTiles(2);

        System.out.println("Player 1: " + playerOneTiles);

        System.out.println("Get letter list: " + newInstance.getLetterList());

        Singleton instanceTwo = Singleton.getInstance();

        System.out.println("Instance ID: " + System.identityHashCode(instanceTwo));


        LinkedList<String> playerTwoTiles = instanceTwo.getTiles(2);

        System.out.println("Player 2: " + playerTwoTiles);


    }
}
