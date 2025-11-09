// Vehicle Hierarchy Example

class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;

    Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    double calculateFuelEfficiency() {
        return 0.0; // base method, overridden in subclasses
    }

    double calculateDistanceTravelled(double fuelUsed) {
        return calculateFuelEfficiency() * fuelUsed;
    }

    double getMaxSpeed() {
        return 0.0; // base method, overridden in subclasses
    }

    void displayDetails() {
        System.out.println(year + " " + make + " " + model + " (" + fuelType + ")");
    }
}

class Truck extends Vehicle {
    Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double calculateFuelEfficiency() {
        return 6.0; // km per litre
    }

    @Override
    double getMaxSpeed() {
        return 120.0; // km/h
    }
}

class Car extends Vehicle {
    Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double calculateFuelEfficiency() {
        return 15.0; // km per litre
    }

    @Override
    double getMaxSpeed() {
        return 180.0; // km/h
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double calculateFuelEfficiency() {
        return 35.0; // km per litre
    }

    @Override
    double getMaxSpeed() {
        return 160.0; // km/h
    }
}

public class VehicleHierarchy {
    public static void main(String[] args) {
        Truck truck = new Truck("Volvo", "FH16", 2020, "Diesel");
        Car car = new Car("Toyota", "Camry", 2022, "Petrol");
        Motorcycle bike = new Motorcycle("Yamaha", "R15", 2023, "Petrol");

        truck.displayDetails();
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " km/l");
        System.out.println("Distance with 50L: " + truck.calculateDistanceTravelled(50) + " km");
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " km/h\n");

        car.displayDetails();
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " km/l");
        System.out.println("Distance with 50L: " + car.calculateDistanceTravelled(50) + " km");
        System.out.println("Max Speed: " + car.getMaxSpeed() + " km/h\n");

        bike.displayDetails();
        System.out.println("Fuel Efficiency: " + bike.calculateFuelEfficiency() + " km/l");
        System.out.println("Distance with 50L: " + bike.calculateDistanceTravelled(50) + " km");
        System.out.println("Max Speed: " + bike.getMaxSpeed() + " km/h");
    }
}
