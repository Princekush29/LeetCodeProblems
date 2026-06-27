package programs.Basics;


class InstanceInitialize {
    int speed;
    String model;

    // This is the Instance Initializer Block
    {
        speed = 60; 
        System.out.println("Instance initializer block: Speed initialized to 60");
    }

    // Constructor 1: No-arg constructor
    InstanceInitialize() {
        System.out.println("No-arg constructor called");
    }

    // Constructor 2: Parameterized constructor
    InstanceInitialize(String model) {
        this.model = model;
        System.out.println("Parameterized constructor called for: " + model);
    }

    public static void main(String[] args) {
        System.out.println("--- Creating Object 1 ---");
        InstanceInitialize c1 = new InstanceInitialize();

        System.out.println("\n--- Creating Object 2 ---");
        InstanceInitialize c2 = new InstanceInitialize("Sedan");
    }
}
