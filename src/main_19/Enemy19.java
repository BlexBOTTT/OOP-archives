// Enemy19 class represents a generic enemy with name and hit points (hp) properties
package main_19;

public class Enemy19 {
    String name;
    int hp;

    // Method to be overridden by subclasses
    void dialog() {
        System.out.println("Please Override Me.");
    }

    // Method to display the enemy's name and hit points
    void showStats() {
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
    }
}