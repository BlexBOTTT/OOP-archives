// StrongEnemy19 class extends Enemy19 and provides a strong enemy with a custom dialog
package main_19;

public class StrongEnemy19 extends Enemy19 {
    // Constructor with default values
    StrongEnemy19() {
        name = "Strong Enemy";
        hp = 100;
    }

    // Constructor with a custom name
    StrongEnemy19(String name) {
        this.name = name;
        hp = 100;
    }

    // Override the dialog method to provide a custom message
    void dialog() {
        System.out.println(name + ": I am Strong.");
    }
}
