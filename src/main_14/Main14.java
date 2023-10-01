package main_14;

import java.util.Scanner;

public class Main14 {

    public static void main(String[] args) {

        Person14 person1 = new Person14("Davider", "Sdptel", 'M', 19);
        System.out.println(person1.firstName + person1.lastName + person1.sex + person1.age);

        Scanner s = new Scanner(System.in);

        System.out.println("Name :");
        String name = s.nextLine();

        System.out.println("Price : ");
        float price = s.nextFloat();

        Product14 p = new Product14(name, price);

    }
}