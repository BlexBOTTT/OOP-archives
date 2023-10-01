package main_13;

public class Main13 {

    public static void main(String[] args) {

        // Create the first person object
        Person13 person1 = new Person13();
        person1.firstName = "Davider";
        person1.lastName = "Sdptel";
        person1.sex = 'M';
        person1.age = 19;

        // Create the second person object
        Person13 person2 = new Person13();
        person2.firstName = "Alenerena";
        person2.lastName = "blexbot";
        person2.sex = 'M';
        person2.age = 21;

        // Print information about the first person
        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.sex);

        // Print information about the second person
        System.out.println(person2.firstName + " " + person2.lastName);

    }
}
