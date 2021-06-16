package Excercise1;

public class Savings extends Account {

    protected int _savingsAccountNumber;

    public Savings(double inputBalance)
    {
        this._name = "Savings";
        this._savingsAccountNumber =  super.getNumber();
        this._balance = inputBalance;
    }

    @Override
    public void setBalance(double amount) {
        this._balance = amount;
    }

    @Override
    public String displayInfo() {
        return String.format("\nHere's your account information:\nAccount Number: %d\nAccount Type: %s\nAccount Balance: %f\n", this._savingsAccountNumber, getName(), getBalance());
    }
}
