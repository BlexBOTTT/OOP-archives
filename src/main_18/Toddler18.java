// Toddler18 class extends Person18 and adds a favorite game property
package main_18;

public class Toddler18 extends Person18 {
    String favoriteGame;

    // Toddler18 constructor with additional favorite game parameter
    Toddler18(String name, String sex, int age, String favoriteGame) {
        // Call the constructor of the superclass (Person18)
        super(name, sex, age);

        // Set the favorite game property
        this.favoriteGame = favoriteGame;
    }

    // Method to simulate the action of drinking milk
    void drink() {
        System.out.println(name + " is drinking milk.");
    }

    // Override the checkStatus method to include the favorite game
    @Override
    void checkStatus() {
        super.checkStatus();
        System.out.println("Favorite Game: " + favoriteGame);
    }
}