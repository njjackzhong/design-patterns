package strategy;

public class Cat extends Animal {
    public Cat() {
        super();

        setSound("Meow");

        setFlyType(new CantFly());
    }
}
