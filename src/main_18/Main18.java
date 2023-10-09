// Main18 class contains the main method for testing the Person18, Toddler18, and Kid18 classes
package main_18;

public class Main18 {

    public static void main(String[] args) {

        // Create a Person18 object named "David" with gender "Male" and age 18
        Person18 p = new Person18("David", "Male", 18);

        // Create a Toddler18 object named "Alenara" with gender "Female", age 5, and favorite game "Peek-a-Boo"
        Person18 t = new Toddler18("Alenara", "Female", 5, "Peek-a-Boo");

        // Create a Kid18 object named "Jaymart" with gender "Female", age 12, favorite game "Tumba Lata", and grade level 4
        Person18 k = new Kid18("Jaymart", "Female", 12, "Tumba Lata", 4);

        // Create a Kid18 object named "Jaymar" with gender "Male", age 7, favorite game "Tumbang Preso", and grade level 4
        Toddler18 t1 = new Kid18("Jaymar", "Male", 7, "Tumbang Preso", 4);

        // Print the details of the Kid18 object t1 using its overridden toString method
        System.out.println(t1.toString());

    }
}