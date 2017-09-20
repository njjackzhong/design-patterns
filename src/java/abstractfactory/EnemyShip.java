package abstractfactory;

public abstract class EnemyShip {

    ESWeapon weapon;

    // Newly defined objects that represent weapon & engine
    // These can be changed easily by assigning new parts
    // in UFOEnemyShipFactory or UFOBossEnemyShipFactory
    ESEngine engine;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void makeShip();

    public void followHeroShip() {

        System.out.println(getName() + " is following the hero at " + engine);

    }

    public void displayEnemyShip() {

        System.out.println(getName() + " is on the screen");

    }

    public void enemyShipShoots() {

        System.out.println(getName() + " attacks and does " + weapon);

    }

    @Override
    public String toString() {
        return "The " + name + " has a speed of " + engine + " and  an attack power of " + weapon;
    }
}

