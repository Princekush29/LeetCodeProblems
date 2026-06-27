package programs.String;

class Animal1 {
    void eat() {
        System.out.println("This animal is eating.");
    }
}

class Dog1 extends Animal1 {
    void wagTail() {
        System.out.println("The dog is wagging its tail!");
    }
}

public class Downcasting {
    public static void main(String[] args) {
        // 1. We start with an Upcast
        Animal1 myAnimal = new Dog1(); 
        
        // 2. We want to call wagTail(), but myAnimal.wagTail() 
        // will cause a compile error because 'Animal' doesn't have that method.

        // 3. DOWNCASTING: Explicitly telling Java "Trust me, this is a Dog."
        Dog1 myDog = (Dog1) myAnimal; 

        // Now we can access Dog-specific methods
        myDog.wagTail();
    }
}