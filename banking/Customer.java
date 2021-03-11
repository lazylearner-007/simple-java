package banking;

/* Represents a customer of a bank */
public class Customer
{
    String name;
    String address;

    /* Constructor for class Customer */
    public Customer(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

}
