// Dog20 class extends Animal20 and provides specific implementations for makeSound and walk
package main_20;

public class Dog20 extends Animal20 {

    // Override makeSound to provide a dog-specific sound
    void makeSound() {
        System.out.println("Arf!");
    }

    // Override walk to provide a dog-specific walking behavior
    void walk() {
        System.out.println("Dog is walking");
    }
}