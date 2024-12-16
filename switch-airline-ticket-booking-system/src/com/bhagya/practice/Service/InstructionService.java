package com.bhagya.practice.Service;

import com.bhagya.practice.model.Instruction;

import java.util.Scanner;

public class InstructionService {

    static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        InstructionService instructionService = new InstructionService();
        Instruction instruction = instructionService.Instructionservice();
    int option = 0;

        System.out.println("Welcome To AirLine ");

        do{
        System.out.println("....pls choose your option....");
        System.out.println("1. Passenger Registration");
        System.out.println("2. information About Flight");
        System.out.println("3. book your Ticket here");
        System.out.println("4. instructions");
        System.out.println("6. Billing Details And Ticket Cancellation Details");
        System.out.println("0. Exit ");

        System.out.println("Pls Enter Your option");
        option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    System.out.println("Passenger Details:"  );
                    break;
                case 2:
                    System.out.println("Flight Information" );
                    break;
                case 3:
                    System.out.println("Book Your Ticket");
                    break;
                case 4:
                    System.out.println("Read Instruction Carefully" +   instruction );
                    break;
                case 5:
                    System.out.println("Billing And Ticket Cancellation Details");
                    break;
                case 0:
                    System.out.println("Exit");
                    break;

            }

        }while( option != 0 );
    }

 public Instruction Instructionservice(){
        int option = 0;
     System.out.println("Welcome To AirLine ");
     System.out.println("Pls Enter Your option");
     option = Integer.parseInt(scanner.nextLine());

    System.out.println("Instructions: 1) ");
    String instructions = scanner.nextLine();
    System.out.println("Terms And Conditions" + " I read Carefully All Instructions ");
    String TermsAndCondition = scanner.nextLine();
    System.out.println("Please Select the box [ ]" + "Agree And Continue" );
    String AgreeAndContinue = scanner.nextLine();

    Instruction instruction = new Instruction();
    instruction.setInstruction(instructions);
    instruction.setTermsAndCondition(TermsAndCondition);
    instruction.setAgreeAndContinue(AgreeAndContinue);

    return instruction;


}

}
