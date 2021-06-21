package Excercise1;

//create abstract account class
public abstract class Account
{

    //create private fields
    protected static int _number = 1000;
    protected String _name;
    protected double _balanceAmount;

    //create constructor
    public Account()
    {
        this._number += 1;
    }

    //create getters
    public int getNumber() {
        return this._number;
    }

    public String getName() {
        return _name;
    }

    public double getBalance() {
        return this._balanceAmount;
    }

    //create abstract methods
    abstract void setBalance(double _balance);

    abstract String displayInfo();
}
