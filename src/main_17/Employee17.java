// Employee17 class represents an employee with various attributes
package main_17;

public class Employee17 {
    String firstName, lastName, title, address, sex;
    int age;

    // Default constructor initializes attributes with default values
    Employee17() {
        firstName = "N/A";
        lastName = "N/A";
        title = "N/A";
        address = "N/A";
        sex = "N/A";
        age = 0;
    }

    // Constructor with all parameters to set employee attributes
    Employee17(String firstName, String lastName, String title, String address, String sex, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.address = address;
        this.sex = sex;
        this.age = age;
    }

    // Constructor with minimal parameters, using default values for the rest
    Employee17(String firstName, String lastName, String title) {
        this(firstName, lastName, title, "N/A", "N/A", 0);
    }
}