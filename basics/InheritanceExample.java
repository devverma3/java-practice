class Animal{
    protected String name;
    public void eat(){
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println(name + " is barking.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog Mydog = new Dog();
        Mydog.name = "Buddy";
        Mydog.eat(); // Inherited method
        Mydog.bark(); // Dog's own method
    }
}