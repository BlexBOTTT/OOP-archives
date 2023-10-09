// Animal20 class is an abstract class representing generic properties and behaviors of animals
package main_20;

public abstract class Animal20 {

    String name;

    // Abstract methods to be implemented by subclasses
    abstract void makeSound();
    abstract void walk();

    // Concrete method to display the name of the animal
    void showName() {
        System.out.println("Name: " + name);
    }

    // Method to set the name of the animal
    void setName(String name) {
        this.name = name;
    }
}