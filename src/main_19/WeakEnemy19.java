// WeakEnemy19 class extends Enemy19 and provides a weak enemy with a custom dialog
package main_19;

public class WeakEnemy19 extends Enemy19 {
    // Constructor with default values
    WeakEnemy19() {
        name = "Weak Enemy";
        hp = 10;
    }

    // Override the dialog method to provide a custom message
    void dialog() {
        System.out.println(name + ": I am Weak.");
    }
}