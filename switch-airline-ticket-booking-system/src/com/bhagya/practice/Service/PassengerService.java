package com.bhagya.practice.Service;

import com.bhagya.practice.model.Passenger;

import java.util.Scanner;

public class PassengerService {
    static Scanner scanner = new Scanner(System.in);
    // public static int option = 0;

    public static void PassengerData() {


        int option = 0;
        PassengerService passengerService = new PassengerService();
        Passenger passenger = passengerService.acceptPassenger();

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
                    System.out.println("Passenger Details:" + passenger);
                    break;
                case 2:
                    System.out.println("Flight Information");
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

        } while (option != 0);
    }


    public Passenger acceptPassenger() {

        int option = 0;



        System.out.println("Welcome to Airline booking System");
        System.out.println("....pls choose your option....");
        option = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Your Full Name");
        String name = scanner.nextLine();
        System.out.println("Enter Your Mo No");
        long MoNo = scanner.nextLong();
        System.out.println("Enter Your UID no");
        long uid = scanner.nextLong();

        Passenger passenger = new Passenger();
        passenger.setFullName(name);
        passenger.setMoNo(MoNo);
        passenger.setUIDno(uid);
        return passenger;


    }
}
