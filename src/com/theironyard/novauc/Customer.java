package com.theironyard.novauc;

/**
 * Created by dangelojoyce on 2/9/17.
 */
public class Customer {

    String account;
    String name;
    int checking;
    int savings;
    double balance;
    int withdraw;
    int deposit;
    int password;


    public Customer(int password) {
        this.password = password;
    }



    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }


    public int getDeposit() {
        return deposit;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getChecking() {
        return checking;
    }

    public void setChecking(int checking) {
        this.checking = checking;
    }

    public int getSavings() {
        return savings;
    }

    public void setSavings(int savings) {
        this.savings = savings;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;

    }

    public Customer(String account, String name, int checking, int savings, double balance, int withdraw) {
        this.account = account;
        this.name = name;
        this.checking = checking;
        this.savings = savings;
        this.balance = balance;
        this.withdraw = withdraw;
        this.deposit = deposit;
    }


    public void findSelect(String select) throws Exception {
        System.out.println("Choose your" + select + "!  Pick it up? [y/n]");


    //public void email () throws Exception{


    }

        /*String answer = ATMmachine.nextLine();

        /*if (answer.equalsIgnoreCase("y")) {
            select.(select);
            System.out.println("You picked up an item!");

        } else if (answer.equalsIgnoreCase("n")) {
            System.out.println("You are going to die...");
        } else {
            throw new Exception("Error: follow instructions better");
        }*/
    }

    /*public void chooseName() {
        System.out.println("What is your name?");
        name = ATMmachine.nextLine();
    }

    public void chooseInt() {
        System.out.println("What is your account?");
        account = ATMmachine.nextLine();
        */






        /*HashMap<String, Customer> customers = new HashMap<String, Customer>();*/









        /*for (String Double: customers) {
            System.out.println(customers);*/






        /*Customer customer = new Customer(); */






        /*int myint = Integer.valueOf("123");
        System.out.println("my int : " + myint);

        double mydouble = Double.valueOf(".50");
        System.out.println("my double : " + mydouble);

        boolean myboolean = Boolean.valueOf("true");
        System.out.println("This is " + myboolean);*/



        /*System.out.println(" John's account : " + Integer.valueOf("123"));{

        System.out.println(" Mike's account : " + Integer.valueOf("123"));*/






        /*Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        public  Scanner scanner = new Scanner (System.in);
        public static Customer player = new Customer();*/




