package abstractfactory;

public class EnemyShipTesting {

    public static void main(String[] args) {
        // EnemyShipBuilding handles orders for new EnemyShips
        // You send it a code using the orderTheShip method &
        // it sends the order to the right factory for creation

        EnemyShipBuilding enemyShipBuilding = new UFOEnemyShipBuilding();

        EnemyShip theGrunt = enemyShipBuilding.orderTheShip("UFO");
        System.out.println(theGrunt + "\n");

        EnemyShip theBoss = enemyShipBuilding.orderTheShip("UFO BOSS");
        System.out.println(theBoss + "\n");


    }

}
