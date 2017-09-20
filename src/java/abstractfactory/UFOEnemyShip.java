package abstractfactory;

public class UFOEnemyShip extends EnemyShip {

    // We define the type of ship we want to create
    // by stating we want to use the factory that
    // makes enemy ships
    EnemyShipFactory shipFactory;

    public UFOEnemyShip(EnemyShipFactory shipFactory) {

        this.shipFactory = shipFactory;

    }


    @Override
    void makeShip() {

        System.out.println("Making enemy ship " + getName());

        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();

    }
}
