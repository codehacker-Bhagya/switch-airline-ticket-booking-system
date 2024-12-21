package com.bhagya.practice.Service;

import com.bhagya.practice.model.*;

import java.util.Scanner;

public class AirlineTicketReservationServiceDemo {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        PassengerService passengerService = new PassengerService();
        Passenger passenger = passengerService.acceptPassenger();

        FlightService flightService = new FlightService();
        Flight flight = flightService.FlightInformation();

        TicketService ticketService = new TicketService();
        Ticket ticketbooking = ticketService.TicketBooking();

        InstructionService instructionService = new InstructionService();
        Instruction instruction = instructionService.Instructionservice();

        BillingAndCancellationService billingAndCancellationService = new BillingAndCancellationService();
        BillingAndCancellation billingAndCancellation = billingAndCancellationService.BillingService();


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
                    System.out.println("Passenger Details:" + passenger);
                    break;
                case 2:
                    System.out.println("Flight Information" + flight);
                    break;
                case 3:
                    System.out.println("Book Your Ticket" + ticketbooking);
                    break;
                case 4:
                    System.out.println("Read Instruction Carefully" + instruction);
                    break;
                case 5:
                    System.out.println("Billing And Ticket Cancellation Details" + billingAndCancellation);
                    break;
                case 0:
                    System.out.println("Exit");
                    break;

            }

        } while (option != 0);

    }
}
