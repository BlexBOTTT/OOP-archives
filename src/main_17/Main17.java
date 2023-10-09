// Main17 class contains the main method for testing the Employee17 class
package main_17;

public class Main17 {
    public static void main(String[] args) {
        // Creating an Employee17 object with specific attributes
        Employee17 e = new Employee17("David", "Sdpt", "Programmer", "Mars", "Male", 21);

        // Creating an Employee17 object with only basic attributes
        Employee17 e1 = new Employee17("Alenere", "Sdpt", "Programmer");

        // Creating an Employee17 object with default values for all attributes
        Employee17 e2 = new Employee17();

        // Printing the age of the first employee
        System.out.println(e.age);

        // Printing the first name of the second employee
        System.out.println(e1.firstName);

        // Printing the age of the third employee (should be 0, the default value)
        System.out.println(e2.age);
    }
}