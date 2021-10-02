package edu.nwmissouri.zoo04lab;

import java.util.Scanner;

/**
 *
 * @author Nithin Reddy Kumbham
 */

public class ZooApp {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Welcome to Nithin Reddy 542 Zoo!");
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to see an animal");
        boolean choice = scan.nextBoolean();
        while (choice == true) {
            System.out.println("What type of animal would you like to see:");
            String userChoice = scan.next();
            switch (userChoice) {
                case "1":
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Enter Aadvark name");
                        String name = scan.next();
                        Aardvark pinto = new Aardvark(name);
                        pinto.typeofAnimal(name);
                        pinto.age();
                        pinto.height();
                        pinto.weight();
                        pinto.isDisabled();
                        pinto.sound();
                        pinto.sleep();
                        pinto.gender();
                        System.out.println("");
                    }
                    choice = false;
                    break;

                case "2":
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Enter Squireel name");
                        String name = scan.next();
                        Squirrel pinto = new Squirrel(name);
                        pinto.typeofAnimal(name);
                        pinto.age();
                        pinto.height();
                        pinto.weight();
                        pinto.isDisabled();
                        pinto.sound();
                        pinto.sleep();
                        pinto.gender();
                        System.out.println("");
                    }
                    choice = false;
                    break;
                case "Q":
                    choice = false;
                    break;
                case "q":
                    choice = false;
                    break;
                default:
                    System.out.println("Could not understand input");
                    System.out.println("Would you like to see an animal prompt");
                    boolean choice1 = scan.nextBoolean();
                    choice = choice1;
            }
        }
        if (choice == false) {
            System.out.println("Thank you for coming.");
        }
    }

}
