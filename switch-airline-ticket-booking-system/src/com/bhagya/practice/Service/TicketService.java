package com.bhagya.practice.Service;

import com.bhagya.practice.model.Passenger;
import com.bhagya.practice.model.Ticket;

import java.util.Scanner;
import java.util.prefs.Preferences;

public class TicketService {
static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int option = 0;
        TicketService ticketService = new TicketService();
        Ticket ticketbooking = ticketService.TicketBooking();

        do {
            System.out.println("Welcome to Airline booking System");
            System.out.println("1. Passenger Registration");
            System.out.println("2. information About Flight");
            System.out.println("3. book your Ticket here");
            System.out.println("4. instructions");
            System.out.println("5. Billing And Ticket Cancellation Details");
            System.out.println("0. Exit ");
            System.out.println("Enter your option");

            option = Integer.parseInt(scanner.nextLine());

            // if (option == 1) {
            //  PassengerRegistration passenger = PassengerRegistrationDemo.createPassenger();
            //  System.out.println("Passenger Registration:" + passenger);
            //  System.out.println("Your Registration Successfull. pls Check your Mo And Emalid for username and passwrd");
            //  }

            switch (option) {
                case 1:
                    System.out.println("Passenger Details:"  );
                    break;
                case 2:
                    System.out.println("Flight Information" + ticketbooking);
                    break;
                case 3:
                    System.out.println("Book Your Ticket");
                    break;
                case 4:
                    System.out.println("Read Instruction Carefully");
                    break;
                case 5:
                    System.out.println("Billing And Ticket Cancellation Details");
                    break;
                case 0:
                    System.out.println("Exit");
                    break;

            }

        }while (option != 0) ;

    }

    private Ticket TicketBooking(){
        int option =0;
        System.out.println("Welcome to Airline booking System");
        System.out.println("Enter your option");
        option = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Your Seat Preference");
        String Preference = scanner.nextLine();
        System.out.println("Enter Your Destionation");
        String Destination = scanner.nextLine();
        System.out.println("Do you Wnat Add meal");
        String meal = scanner.nextLine();
        System.out.println("Your Total Amount");
        System.out.println("Your Ticket Amount Is : 5000Rs." + "Meal Charge = 1000rs"  + "CGST = 400rs"  + "Total amount is:6400rs");

        Ticket ticketbooking = new Ticket();
        ticketbooking.setSeatPreference(Preference);
        ticketbooking.setDestination(Destination);
        ticketbooking.setAddMeal(meal);
        return ticketbooking;

    }
}
