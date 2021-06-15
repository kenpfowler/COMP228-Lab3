package Excercise1;

public class Savings extends Account {
    public Savings(double inputBalance)
    {
        this._name = "Savings";
        this._number =  getNumber();
        this._balance = inputBalance;
    }

    @Override
    public void setBalance(double amount) {
        this._balance = amount;
    }

    @Override
    public void displayInfo() {
        System.out.printf("\nHere's your account information:\nAccount Number: %d\nAccount Type %s\nAccount Balance: %f\n", getNumber(), getName(), getBalance());
    }
}
