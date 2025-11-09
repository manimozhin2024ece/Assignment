// Vehicle, Car, and Bicycle Example

class Vehicle {
    int speed;

    Vehicle(int speed) {
        this.speed = speed;
    }

    void speedUp() {
        speed += 5; // default increase
        System.out.println("Vehicle speed increased to " + speed + " km/h");
    }
}

class Car extends Vehicle {
    Car(int speed) {
        super(speed);
    }

    @Override
    void speedUp() {
        speed += 20; // cars speed up faster
        System.out.println("Car speed increased to " + speed + " km/h");
    }
}

class Bicycle extends Vehicle {
    Bicycle(int speed) {
        super(speed);
    }

    @Override
    void speedUp() {
        speed += 2; // bicycles speed up slower
        System.out.println("Bicycle speed increased to " + speed + " km/h");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(50);
        Car c = new Car(60);
        Bicycle b = new Bicycle(10);

        v.speedUp(); // default
        c.speedUp(); // car-specific
        b.speedUp(); // bicycle-specific
    }
}
