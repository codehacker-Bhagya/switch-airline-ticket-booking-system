package com.bhagya.practice.Service;

import com.bhagya.practice.model.BillingAndCancellation;

import java.util.Scanner;

public class BillingAndCancellationService {
static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        BillingAndCancellationService billingAndCancellationService = new BillingAndCancellationService();
        BillingAndCancellation billingAndCancellation= billingAndCancellationService.BillingService();



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
                    System.out.println("Book Your Ticket" );
                    break;
                case 4:
                    System.out.println("Read Instruction Carefully");
                    break;
                case 5:
                    System.out.println("Billing And Ticket Cancellation Details" + billingAndCancellation);
                    break;
                case 0:
                    System.out.println("Exit");
                    break;

            }

        }while (option != 0) ;

    }

    public BillingAndCancellation BillingService(){

        int option =0;
        System.out.println("Welcome to Airline booking System");
        System.out.println("Enter your option");
        option = Integer.parseInt(scanner.nextLine());

        System.out.println("Pls Select Your Payment Method");
        String method = scanner.nextLine();
        System.out.println("Enter Your UPI ID");
        int upiid = Integer.parseInt(scanner.nextLine());

        BillingAndCancellation billingAndCancellation = new BillingAndCancellation();
        billingAndCancellation.setPaymentMethod(method);
        billingAndCancellation.setUpiid(upiid);

        return billingAndCancellation;

    }
}
