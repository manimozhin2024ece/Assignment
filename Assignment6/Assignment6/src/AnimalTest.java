// Abstract Class Animal Example

abstract class Animal {
    abstract void sound(); // abstract method
}

class Lion extends Animal {
    @Override
    void sound() {
        System.out.println("Lion roars: Roarrr!");
    }
}

class Tiger extends Animal {
    @Override
    void sound() {
        System.out.println("Tiger growls: Grrr!");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();

        lion.sound();  // Calls Lion's version
        tiger.sound(); // Calls Tiger's version
    }
}
