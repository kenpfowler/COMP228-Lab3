package Excercise1;

//create abstract account class
public abstract class Account
{

    //create private fields
    protected static int _number = 1000;
    protected String _name;
    protected double _balance;

    public int getNumber() {
        return _number;
    }

    public String getName() {
        return _name;
    }
    public Account()
    {
        this._number += 1;
    }

    public double getBalance() {
        return this._balance;
    }

    abstract void setBalance(double _balance);

    abstract void displayInfo();
}
