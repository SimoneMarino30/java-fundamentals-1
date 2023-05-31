package org.lerssons.java;

// Import
import java.util.Scanner;

public class TrainTicketPrice {
    public static void main(String[] args) {

        // Variables
        int km;
        int age;
        double pricePerKm = 0.21;
        double discount;
        double reducedTicket;

        // Discount's Variables
        double under18 = 20.00;
        double over65 = 40.00;

        // Percentage Variable
        double per100 = 100.00;

        // Scanner
        Scanner ask = new Scanner(System.in);

        // Km request
        System.out.println("How many kilometers do you wanna do? ");
        km = ask.nextInt();

        // Age request
        System.out.println("How old are you? ");
        age = ask.nextInt();

        System.out.println("You wanna do " + km + " Kilometers and you're " + age + " years old");

        double FullPrice = km * pricePerKm;
        // conditional percentage
        if(age < 18) {
            discount = ((FullPrice * under18) / per100);
            System.out.println("Your discount will be: " + discount + "€");
            reducedTicket = (FullPrice - discount);
            System.out.println("Your ticket will cost: " + reducedTicket + "€");
        }
        else if(age >= 65) {
            discount = ((FullPrice * over65) / per100);
            System.out.println("Your discount will be: " + discount + "€");
            reducedTicket = (FullPrice - discount);
            System.out.println("Your ticket will cost: " + reducedTicket + "€");
        }
        else {
            System.out.println("Your ticket will cost: " + FullPrice + "€");
        }
    }
}
