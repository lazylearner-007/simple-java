package banking;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) throws Exception
    {
        Bank bank = new Bank();
        bank.run();
    }

    public void run() throws Exception
    {
        System.out.println("Hello, Welcome To Bank! PLease Enter Your Name");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        System.out.println("Hello " + name + "! " + "We are creating new account for you.");
        Customer customer = new Customer(name);

        System.out.println("\nEnter your address: ");
        String address = scanner.next();
        customer.setAddress(address);

        System.out.println("\nEnter 1 for opening savings account, Enter 2 for opening checking account. ");
        String choice = "";
        choice = scanner.next();
        BankAccount account = new BankAccount("savings",customer);

        while(true){
            if(choice.equals("1")){
                break;
            }
            if(choice.equals("2")){
                account.accountType = "checking";
                break;
            }
            System.out.println("Please enter valid input");
            choice = scanner.next();
        }

        System.out.println(account.getCustomerInfo());
        System.out.println(account.getAccountInfo());

        System.out.println("\nEnter 1 to Deposite money, Enter 2 to Withdraw money: ");
        choice = scanner.next();
        double amount = 0.0;

        if(choice.equals("1")){
            System.out.println("\nEnter amount to deposite money: ");
            amount = scanner.nextDouble();
            account.deposite(amount);
        }
        if(choice.equals("2")){
            System.out.println("\nEnter amount to withdraw money: ");
            amount = scanner.nextDouble();
            account.winthdraw(amount);
        }

    }

}

