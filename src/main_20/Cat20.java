// Cat20 class extends Animal20 and provides specific implementations for makeSound and walk
package main_20;

public class Cat20 extends Animal20 {

    // Override makeSound to provide a cat-specific sound
    void makeSound() {
        System.out.println("Meow!");
    }

    // Override walk to provide a cat-specific walking behavior
    void walk() {
        System.out.println("Cat is walking");
    }
}