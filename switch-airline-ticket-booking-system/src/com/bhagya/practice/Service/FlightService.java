package com.bhagya.practice.Service;

import com.bhagya.practice.model.Flight;
import com.bhagya.practice.model.Ticket;

import java.util.Scanner;

public class FlightService {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        FlightService flightService = new FlightService();
        Flight flight = flightService.FlightInformation();

        System.out.println("Welcome to Airline booking System");
        System.out.println("Enter your option");

        int option = 0;


        do {
            System.out.println("1. Passenger Registration");
            System.out.println("2. information About Flight");
            System.out.println("3. book your Ticket here");
            System.out.println("4. instructions");
            System.out.println("5. Billing And Ticket Cancellation Details");
            System.out.println("0. Exit ");

            option = Integer.parseInt(scanner.nextLine());



            switch (option) {
                case 1:
                    System.out.println("Passenger Details:"  );
                    break;
                case 2:
                    System.out.println("Flight Information" );
                    break;
                case 3:
                    System.out.println("Book Your Ticket" + flight);
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

    public Flight FlightInformation(){
        int option = 0;
        System.out.println("Welcome to Airline booking System");
        System.out.println("Enter your option");
        option = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Your Destination");
        String destination = scanner.nextLine();
        System.out.println("Enter Your Flight Name which flight ticket do you need");
        String flightName = scanner.nextLine();
        System.out.println("Your Flight No Is : 5231" );
        System.out.println("Flight Status: Ticket Is Available You Can book Your Ticket");

        Flight flight = new Flight();
        flight.setDestination(destination);
        flight.setFlightName(flightName);
        return flight;





    }
}
