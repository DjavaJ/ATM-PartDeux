package com.theironyard.novauc;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by dangelojoyce on 2/9/17.
 */
public class ATMmachine {

    public static Scanner scanner = new Scanner(System.in);
    public static Scanner scannerDbl = new Scanner(System.in);
    public static HashMap<String, Double> Customs = new HashMap();

    public static void main(String[] args) {

        OS os = new OS(); //Make a new object and use this (the OS) constructor
        os.mainMenu();
    }
}












































//        Customs.put("John", new Customer("Acct", "John Adams", 20, 30, 40, 0));
//        Customs.put("Mike", new Customer("acct", "Mike Jordan", 25, 22, 34, 0));
//
//
//
//
//        //Double MikeBalance = Customs.get ("Mike").getBalance();
//        //boolean MikeBalance = Customs.containsKey("Mike");
//
//        System.out.println("please enter user name");
//        String userNameInput = scanner.nextLine(); //Whatever the next line is
//
//        if (userNameInput.equalsIgnoreCase("John") || userNameInput.equalsIgnoreCase("Mike")) {
//            System.out.println("Welcome! " + userNameInput + " choose options from the menu. ");
//            System.out.println( "Choose options from the menu. ");
//
//
//        } else if ((!(userNameInput.equalsIgnoreCase("John"))) || (!(userNameInput.equalsIgnoreCase("Mike")))) {
//
//
//            //Customs.put(userNameInput, new Customer("", "", 0, 0, 0, 0));
//            System.out.println("Wasn't that simple? We added you against your will " +  userNameInput);
//
//            System.out.println("What password do you want bruh?");
//
//            int passwordInput = scannerInt.nextInt()   ;
//
//            System.out.println("Your shitty password is " + passwordInput);
//            System.out.println("What kind of account do you want");
//
//            String accountName = scanner.nextLine();
//
//            System.out.println( "Checkings or Savings?");
//
//        }
//
//            //Customs.put(userNameInput, new Customer (passwordInput));
//
//            String accountInput = scanner.nextLine();
//
//
//
//            }
//
//            System.out.println("How much money do you have?" + userNameInput + new Customer("", "", 0, 0, 0, 0));
//
//
//        }
//
//
//        //System.out.println("Hello " +Customs.get ("Mike").getName());
//
////        Customs.get(userNameInput).getBalance();
////        Customs.get(userNameInput).getChecking();
////        Customs.get(userNameInput).getSavings();
////        Customs.get(userNameInput).getWithdraw();
////        Customs.get(userNameInput).getAccount();
////        Customs.get(userNameInput).getDeposit();
//
//
//        //System.out.print("Mike's balance is $ " + Customs.get(userNameInput).getBalance());
//    }
//
//
//        /*if (Customs.containsKey ("John")) System.out.println ("Withdraw " + "$ " +41);
//        System.out.println ("John, your current balance is $ " + (JohnBalance  - 41));
//        System.out.println("You broke bruh"); */
//
//
//
//
//        //if (Customs.containsKey ("Mike"))  System.out.print(true);
//
//
//
//
//
//        /*for (String Double: customers) {
//            System.out.println(customers);*/
//
//
//       // System.out.println(" John's account : " + JohnBalance);
//        //System.out.println(" Mike's account : " + MikeBalance);
//
//
//
//
//
//        //customers.chooseAccount();
//
//
//        /*public static String nextLine () {
//
//        String line = scanner.nextLine();
//
//        while (line.startsWith("/")) {
//            switch (line) {
//
//                case "/inv":
//                    for (String select : .getBalance) {
//                        System.out.println(select);
//
//                    }
//                    break;
//
//                case "/exit":
//                    System.exit(0);
//                    break;
//
//                default:
//                    System.out.println("Command not found!");
//                    break;
//
//
//            //line = scanner.nextLine();
//
//
//            //"name" has to be used after i.e. s.o.println("..." + name)
//
//            System.out.println(" 1 0 0 %   R 0 B B E D - F R E E !    |¯¯¯|\n" +
//                    "               ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    |   |\n" +
//                    "         .´¯¯¯¯¯¯¯||¯¯¯¯¯¯¯`..´¯¯¯¯¯¯`.|¯¯¯`¯¯¯`..´¯¯¯    |\n" +
//                    "         |   ..   ||   ||   ||___'|   ||   ||   ||   ||   |\n" +
//                    "         |   ||   ||       < .————'   ||   ||   ||   ||   |\n" +
//                    "         |   ||   ||   ..   ||   ..   ||   ||   ||   ||   |\n" +
//                    "         |   ''   ||   ||   ||   ''   ||   ||   ||        |\n" +
//                    "         `.___    ||   ||   |`._______||___||___|`._______|\n" +
//                    "         .————'   ||___||   '————.\n" +
//                    "         |_______.´|   |`.___    |                           ___\n" +
//                    "                 .-'   '————.|   '———.  .——————. .————————..'   '————.\n" +
//                    "                 |_     ____||        ||        ||    ____||     ____|\n" +
//                    "                   |   |.———.|   ||   ||   ||   ||   '————. |   |.———.\n" +
//                    "                   |   ||   ||   ||   ||    ____||    ____| |   ||   |\n" +
//                    "                   |   ||   ||   ||   ||   |.———.|   |      |   ||   |\n" +
//                    "                   |        ||   ||   ||        ||   |      |        |\n" +
//                    "                   `.______.´|___||___|`.______.´|___|      `.______.´\n" +
//                    "         .´¯¯¯¯¯¯`.|¯¯¯||¯¯¯|-¯¯¯'————..´¯¯¯¯¯¯|¯¯¯¯¯¯¯¯|     |¯¯¯¯¯¯|\n" +
//                    "         |___'|   ||   ||   ||    ____||   ..   ¯\\    ´¯       ¯`  /¯\n" +
//                    "         .————'   ||   ||   ||   |.———.|   ||   | \\    \\        / /\n" +
//                    "         |   ..   ||   ||   ||   ||   ||   ||   |  \\    \\      / /\n" +
//                    "         |   ''   ||   ''   ||   ''   ||   ''   |   \\    \\    / /\n" +
//                    "         `._______|`.______.´`.______.´`.______.´    \\    \\  / /\n" +
//                    "                                                      \\    \\/ /\n" +
//                    "           Bank of America support                     \\     /\n" +
//                    "                                                        \\   /\n");
//            return "Hello";
//        }
//
//
//    }
//
//
//
//
//
//        /*System.out.println("Get your lube ready,  HAHAHAHA!");
//
//        System.out.println("Enter your damn pin! [pin/leave]");
//        String pin = scanner.nextLine(); {pin = "123"
//        }
//
//           if (pin.equalsIgnoreCase("1234")) {
//            System.out.println("Here are your insufficient funds...do better.");
//        } else if (pin.equalsIgnoreCase("leave")){
//        System.out.println("Bye Felicia!");  //Make this switch
//
//}
//
//
//
//        //Can you make int pin so that any (set of)integer(s) is the pin?
//        //or restrict a set of integers to specfic customers and accounts?
//
//        /*Customer custom = new Customer();
//
//
//
//        */
//
//
//
//
//
//
//
//
//