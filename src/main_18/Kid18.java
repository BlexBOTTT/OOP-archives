// Kid18 class extends Toddler18 and adds a grade level property
package main_18;

public class Kid18 extends Toddler18 {
    int gradeLevel;

    // Kid18 constructor with additional grade level parameter
    Kid18(String name, String sex, int age, String favoriteGame, int gradeLevel) {

        // Call the constructor of the superclass (Toddler18)
        super(name, sex, age, favoriteGame);

        // Set the grade level property
        this.gradeLevel = gradeLevel;
    }

    // Override the toString method to provide a custom string representation
    @Override
    public String toString() {
        return super.toString() + ", Grade Level: " + gradeLevel;
    }
}