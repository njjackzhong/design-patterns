package strategy;

public class Dog extends Animal {

    public Dog() {
        super();

        setSound("Bark");

        setFlyType(new CantFly());
    }

    public void digHole() {
        System.out.println("Dug a hole");
    }
}
