// Main19 class contains the main method for testing the Enemy19, WeakEnemy19, and StrongEnemy19 classes
package main_19;

public class Main19 {
    public static void main(String[] args) {
        // Create a WeakEnemy19 object and a StrongEnemy19 object
        Enemy19 we = new WeakEnemy19();
        Enemy19 se = new StrongEnemy19("David");

        // Display the stats and dialog of the StrongEnemy19
        se.showStats();
        se.dialog();

        System.out.println();

        // Display the stats and dialog of the WeakEnemy19
        we.showStats();
        we.dialog();
    }
}