package com.theironyard.novauc;

/**
 * Created by dangelojoyce on 2/12/17.
 */
public class OS {
    int infiniteLoop = 0;
    String userInput;

        public void mainMenu(){
            while (infiniteLoop == 0){
                System.out.println("WELCOME TO THE LOGIN MENU. ENTER SHUT DOWN TO QUIT");
                System.out.println("ENTER USER NAME");
                userInput = ATMmachine.scanner.nextLine();

                if (ATMmachine.Customs.containsKey(userInput)) {
                    accountInfo();
                } else if (userInput.equalsIgnoreCase("Shut down")){
                    System.exit(0);
                } else {
                    System.out.println("USER NOT FOUND");
                    addUser();
                }
            }
        }
        public void accountInfo(){
            while (infiniteLoop == 0){
                System.out.println("[CHECK BALANCE] [WITHDRAW] [DEPOSIT] [LOGOUT] [DELETE ACCOUNT]");
                switch(ATMmachine.scanner.nextLine().toUpperCase()){ //This is called Method Chaining
                    case "CHECK BALANCE" :
                        System.out.println("THIS IS YOUR BALANCE " +ATMmachine.Customs.get(userInput));
                        break;
                    case "DEPOSIT":
                        deposit();
                        break;
                    case "WITHDRAW":
                        withdraw();
                        break;
                    case "LOGOUT":
                        return;
                    case "DELETE ACCOUNT":
                        if (deleteUser()){
                            return;
                        } else {
                            break;
                        }
                    default:
                        System.out.println("RETURNING TO MAIN MENU");
                        break;
                }
            }
        }
        public void withdraw(){
            double withdrawAmount;
            while(infiniteLoop==0){
                System.out.println("ENTER WITHDRAW AMOUNT");
                withdrawAmount = ATMmachine.scannerDbl.nextDouble(); //Assignment (Right to left)
                if (withdrawAmount > ATMmachine.Customs.get(userInput)){
                    System.out.println("YOUR FUNDS ARE GROSSLY INSUFFICIENT");
                }
                else {
                    ATMmachine.Customs.put(userInput, ATMmachine.Customs.get(userInput) - withdrawAmount);
                    return;
                }
            }
        }
        public void deposit (){
            System.out.println("ENTER DEPOSIT AMOUNT");
            double depositAmount = ATMmachine.scannerDbl.nextDouble();
            ATMmachine.Customs.put(userInput, ATMmachine.Customs.get(userInput) +depositAmount);
        }
        public void addUser() {
            String newCustom;
            while (infiniteLoop == 0){
                System.out.println("ADDING NEW USER. ENTER GO BACK TO RETURN TO MAIN MENU");
                System.out.println("WHAT IS YOUR NAME?");
                newCustom = ATMmachine.scanner.nextLine();
                if (ATMmachine.Customs.containsKey(newCustom)){
                    System.out.println("USER ACCOUNT ALREADY EXISTS");
                } else if (newCustom.equalsIgnoreCase("GO BACK")) {
                    return;
                } else {
                    ATMmachine.Customs.put(newCustom, 5.00);
                    System.out.println("ACCOUNT SUCCESSFULLY CREATED");
                    return;
                }
            }
        }
        public boolean deleteUser(){
            System.out.println("ARE YOU SURE?, ENTER YES OR NO?");
            String accountDel = ATMmachine.scanner.nextLine();
            if (accountDel.equalsIgnoreCase("YES")){
                ATMmachine.Customs.remove(userInput);
                System.out.println("HAVE A NICE DAY!");
                return true;
            } else {
                return false;
            }
    }
}

