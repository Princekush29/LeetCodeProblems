package programs.String;

class Animal {
    void makeNoise() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeNoise() {
        System.out.println("Woof! Woof!");
    }

    void wagTail() {
        System.out.println("Tail is wagging");
    }
}

public class Upcasting {
    public static void main(String[] args) {
        // Normal instantiation
        Dog myDog = new Dog();

        // UPCASTING: Casting a Dog to an Animal
        // This happens implicitly (automatically)
        Animal myAnimal = myDog; 

        // This works because a Dog is an Animal
        myAnimal.makeNoise(); 

        // ERROR: This would fail! 
        // Even though the object is a Dog, the reference is 'Animal'.
        // Animals don't necessarily have a 'wagTail' method.
        // myAnimal.wagTail(); 
    }
}