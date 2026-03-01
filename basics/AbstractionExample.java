// 1. Abstract Class: A partial blueprint (can have some finished parts)
abstract class Vehicle {
    abstract void start(); // Must be finished by the child class

    void stop() { // Already finished
        System.out.println("Vehicle stopped safely.");
    }
}

// 2. Interface: A strict contract (100% abstract by nature)
interface Drivable {
    void drive(); // No body allowed here
}

// 3. Concrete Class: Must fulfill ALL promises made by Vehicle and Drivable
class Car extends Vehicle implements Drivable {
    @Override
    void start() {
        System.out.println("Car engine cranking... Vroom!");
    }

    @Override
    public void drive() { // Interfaces methods must be marked 'public'
        System.out.println("Car is cruising down the highway.");
    }
}

// 4. Public Main Class (Matches Filename: Main.java)
public class AbstractionExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.start();  // From Abstract Class
        myCar.drive();  // From Interface
        myCar.stop();   // From Abstract Class (Concrete method)
    }
} 