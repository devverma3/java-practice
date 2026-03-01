//Create a Vehicle abstract class with at least 2 concrete subclasses

abstract class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    // Abstract method: No body here, subclasses MUST implement this
    abstract void move();

    // Concrete method: All vehicles share this logic
    void displayStatus() {
        System.out.println(brand + " is currently traveling at " + speed + " km/h.");
    }
}

class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }

    @Override
    void move() {
        this.speed += 20; // Cars accelerate faster
        System.out.println("The car engine roars! Speeding up...");
    }
}

class Bicycle extends Vehicle {
    Bicycle(String brand) {
        super(brand);
    }

    @Override
    void move() {
        this.speed += 5; // Bicycles accelerate by pedaling
        System.out.println("Pedaling hard! Increasing speed slowly...");
    }
}

public class VehicleAbstract {
    public static void main(String[] args) {
        Vehicle myTesla = new Car("Tesla");
        Vehicle myTrek = new Bicycle("Trek");

        myTesla.move();
        myTesla.displayStatus();

        System.out.println("---");

        myTrek.move();
        myTrek.displayStatus();
    }
}

/*
Key Concepts Applied
Abstraction: We defined what a vehicle does (moves) without specifying how every single vehicle does it.

Inheritance: Car and Bicycle inherited the brand and displayStatus() features, saving us from writing redundant code.

Polymorphism: We can treat both objects as a Vehicle type while they still execute their specific move() behaviors.
 */