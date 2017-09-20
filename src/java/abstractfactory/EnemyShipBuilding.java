package abstractfactory;

import java.util.Objects;

public abstract class EnemyShipBuilding {

    // This acts as an ordering mechanism for creating
    // EnemyShips that have a weapon, engine & name
    // & nothing else
    // The specific parts used for engine & weapon depend
    // upon the String that is passed to this method
    protected abstract EnemyShip makeEnemyShip(String typeOfShip);

    public EnemyShip orderTheShip(String typeOfShip) {

        EnemyShip enemyShip = makeEnemyShip(typeOfShip);

        if (Objects.nonNull(enemyShip)) {
            enemyShip.makeShip();
            enemyShip.displayEnemyShip();
            enemyShip.followHeroShip();
            enemyShip.enemyShipShoots();
        }

        return enemyShip;
    }

}
