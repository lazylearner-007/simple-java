package banking;

/* Represents checking/saving bank account for customer */

public class BankAccount {
    String accountType;
    double balance;
    Customer customer;

    public BankAccount(String accountType, Customer customer){
        this.accountType = accountType;
        this.customer = customer;
    }

    public void deposite(double amount) throws Exception
    {
        if(amount<=0)
        {
            throw new Exception("Amount should be greater than 0");
        }
        this.balance+= amount;
    }

    public void winthdraw(double amount) throws Exception
    {
        if(amount>this.balance)
        {
            throw new Exception("Amount is greater than account balance");
        }
        this.balance-= amount;
    }

    public String getAccountInfo(){
        String Info = "\nAccount info:" + "\nAccount type: " + this.accountType + "\nAccount Balance: " + ' ' + this.balance ;
        return Info;
    }

    public String getCustomerInfo(){
        return "\nCustomer Info: \n" + "Name: " +  this.customer.name + "\n" + "Address: " + this.customer.address;
    }
}
