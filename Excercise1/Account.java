package Excercise1;

//create abstract account class
public abstract class Account
{
    //create private fields
    private int _number;
    private String _name;
    private double _balance;

    public int getNumber() {
        return _number;
    }

    public String getName() {
        return _name;
    }

    public abstract double getBalance();

    public abstract void setBalance(double _balance);

    public void displayInfo() {
        System.out.printf("Here's your account information:\nAccount Number: %d\nAccount Type %s\nAccount Balance: %d", getNumber(), getName(), getBalance());
    }
}
