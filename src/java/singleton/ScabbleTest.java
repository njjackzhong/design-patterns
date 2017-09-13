package singleton;

import java.util.LinkedList;

public class ScabbleTest {

    public static void main(String[] args) {

        Singleton newInstance = Singleton.getInstance();

        System.out.println("Instance ID: " + System.identityHashCode(newInstance));

        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerOneTiles = newInstance.getTiles(2);

        System.out.println("Player 1: " + playerOneTiles);

        System.out.println(newInstance.getLetterList());

        Singleton instanceTwo = Singleton.getInstance();

        System.out.println("Instance ID: " + System.identityHashCode(instanceTwo));


        LinkedList<String> playerTwoTiles = instanceTwo.getTiles(2);

        System.out.println("Player 2: " + playerTwoTiles);



    }
}
