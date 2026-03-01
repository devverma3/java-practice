// --- Method Overloading (Compile-time) ---
class Calculator {
    // Same name, different parameters
    public int add(int a, int b) { 
        return a + b; 
    }
    
    public double add(double a, double b) { 
        return a + b; 
    }
}

// --- Method Overriding (Runtime) ---
class Animal {
    public void sound() { 
        System.out.println("Animal makes a sound"); 
    }
}

class Dog extends Animal {
    @Override // Good practice: tells compiler we are overriding
    public void sound() { 
        System.out.println("Bark"); 
    }
}

// --- The Main Public Class ---
// Filename must be Main.java
public class PolymorphismExample {
    public static void main(String[] args) {
        
        // 1. Testing Overloading
        Calculator calc = new Calculator();
        System.out.println("Int sum: " + calc.add(5, 10));      // Calls int version
        System.out.println("Double sum: " + calc.add(5.5, 4.5)); // Calls double version

        System.out.println("-------------------------");

        // 2. Testing Overriding
        Animal genericAnimal = new Animal();
        Animal myDog = new Dog(); // Polymorphism: Animal reference, Dog object

        genericAnimal.sound(); // Output: Animal makes a sound
        myDog.sound();         // Output: Bark (Runtime decides this)
    }
}