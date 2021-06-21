package Excercise1;

public class Chequing extends Account
{
    //instance variables
    protected int _chequingAccountNumber;

    //constructor
    public Chequing(double inputBalance)
    {
        this._name = "Chequing";
        this._chequingAccountNumber = super.getNumber();
        this._balanceAmount = inputBalance;
    }

    //set the balance for account
    @Override
    public void setBalance(double amount) {
        this._balanceAmount = amount;
    }

    //display info about account
    @Override
    public String displayInfo() {
        return String.format("\nHere's your account information:\nAccount Number: %d\nAccount Type: %s\nAccount Balance: %f\n", this._chequingAccountNumber, getName(), getBalance());
    }

}
