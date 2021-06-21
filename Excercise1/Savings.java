package Excercise1;

public class Savings extends Account {

    //create instance variables
    protected int _savingsAccountNumber;

    //constructor
    public Savings(double inputBalance)
    {
        this._name = "Savings";
        this._savingsAccountNumber =  super.getNumber();
        this._balanceAmount = inputBalance;
    }

    //set account balance
    @Override
    public void setBalance(double amount) {
        this._balanceAmount = amount;
    }

    //display account information
    @Override
    public String displayInfo() {
        return String.format("\nHere's your account information:\nAccount Number: %d\nAccount Type: %s\nAccount Balance: %f\n", this._savingsAccountNumber, getName(), getBalance());
    }
}
