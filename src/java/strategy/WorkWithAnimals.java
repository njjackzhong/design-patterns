package strategy;

public class WorkWithAnimals {

    public static void main(String[] args) {


        Animal sparky = new Dog();

        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.tryToFly());
        System.out.println("Bird: " + tweety.tryToFly());


        sparky.setFlyType(new ItFly());


        System.out.println("Dog: " + sparky.tryToFly());

//
//        Dog dog = new Dog();
//
//        dog.setName("Apple");
//
//        dog.digHole();
//
//        dog.setWeight(-1);
//
//        Animal doggy = new Dog();
//        Animal kitty = new Cat();
//
//        System.out.println("Doggy says: " + doggy.getSound());
//        System.out.println("Kitty says: " + kitty.getSound());
//
//        Animal[] animals = new Animal[4];
//        animals[0] = doggy;
//        animals[1] = kitty;
//
//        System.out.println("Doggy says: " + animals[0].getSound());
//        System.out.println("Kitty says: " + animals[1].getSound());
//
//
//        ((Dog)doggy).digHole();
//

    }
}
