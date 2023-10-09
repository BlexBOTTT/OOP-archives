// Main20 class contains the main method for testing the Animal20, Dog20, and Cat20 classes
package main_20;

public class Main20 {

    public static void main(String[] args) {

        // Create Dog20 and Cat20 objects through the Animal20 reference
        Animal20 d = new Dog20();
        Animal20 c = new Cat20();

        // Set names for the animals
        d.setName("Doggie");
        c.setName("Cat");

        // Display names of the animals
        d.showName();
        c.showName();
    }
}