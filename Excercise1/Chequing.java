package Excercise1;

public class Chequing extends Account
{
    protected int _chequingAccountNumber;

    public Chequing(double inputBalance)
    {
        this._name = "Chequing";
        this._chequingAccountNumber = super.getNumber();
        this._balance = inputBalance;
    }

    @Override
    public void setBalance(double amount) {
        this._balance = amount;
    }

    @Override
    public String displayInfo() {
        return String.format("\nHere's your account information:\nAccount Number: %d\nAccount Type: %s\nAccount Balance: %f\n", this._chequingAccountNumber, getName(), getBalance());
    }

}
