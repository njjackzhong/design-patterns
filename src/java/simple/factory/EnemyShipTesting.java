package simple.factory;

import java.util.Scanner;

public class EnemyShipTesting {

    public static void main(String[] args) {

        EnemyShip enemyShip = null;

        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();

        Scanner userInput = new Scanner(System.in);


        System.out.print("What type of Ship?(U ? R ? B)");

        if (userInput.hasNextLine()) {

            String enemyShipOption = userInput.nextLine();

            enemyShip = enemyShipFactory.makeEnemyShip(enemyShipOption);
        }


        if (enemyShip != null)
            doAction(enemyShip);
        else
            System.out.println("Enter U / R /B");
    }

    public static void doAction(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
