package org.lerssons.java;

import java.util.Scanner;

public class TrainTicketPrice {
    public static void main(String[] args) {

        // Variables
        int Km;
        int Age;
        double PricePerKm = 0.21;
        double Discount;
        double ReducedTicket;

        // Discount's Variables
        double Under18 = 20.00;
        double Over65 = 40.00;

        // Percentage Variable
        double Per100 = 100.00;

        // Scanner
        Scanner Ask = new Scanner(System.in);

        // Km request
        System.out.println("How many kilometers do you wanna do? ");
        Km = Ask.nextInt();

        // Age request
        System.out.println("How old are you? ");
        Age = Ask.nextInt();

        System.out.println("You wanna do " + Km + " Kilometers and you're " + Age + " years old");

        double FullPrice = Km * PricePerKm;
        // conditional percentage
        if(Age < 18) {
            Discount = ((FullPrice * Under18) / Per100);
            System.out.println("Your discount will be: " + Discount + "€");
            ReducedTicket = (FullPrice - Discount);
            System.out.println("Your ticket will cost: " + ReducedTicket + "€");
        }
        else if(Age >= 65) {
            Discount = ((FullPrice * Over65) / Per100);
            System.out.println("Your discount will be: " + Discount + "€");
            ReducedTicket = (FullPrice - Discount);
            System.out.println("Your ticket will cost: " + ReducedTicket + "€");
        }
        else {
            System.out.println("Your ticket will cost: " + FullPrice + "€");
        }
    }
}
