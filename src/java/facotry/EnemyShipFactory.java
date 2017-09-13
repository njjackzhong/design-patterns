package facotry;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String shipType) {

        EnemyShip enemyShip = null;

        switch (shipType) {
            case "U":
                enemyShip = new UFOEnemyShip();
                break;
            case "R":
                enemyShip = new RocketEnemyShip();
                break;
            case "B":
                enemyShip = new BigUFOEnemyShip();
                break;
            default:
                ;
        }

        return enemyShip;


    }
}
