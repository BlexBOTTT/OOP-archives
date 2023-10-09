// Person18 class represents a person with basic properties
package main_18;

public class Person18 {
    String name, sex;
    int age;

    // Person18 constructor with name, sex, and age parameters
    Person18(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    // Method to check and print the status of the person
    void checkStatus() {
        System.out.println("Name: " + name);
        System.out.println("Sex: " + sex);
        System.out.println("Age: " + age);
    }
}