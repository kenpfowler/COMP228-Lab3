package Excercise2;

//create class that extends mobile developer
public class PartTimeDeveloper extends MobileDeveloper{
    //create instance variables
    private int _hours;
    private final int PAY_PER_HOUR = 30;

    //create constructor
    public PartTimeDeveloper(String name, int hours)
    {
        super(name);
        super._isFullTime = false;
        this._hours = hours;
    }

    //calculate salary
    @Override public int calculateSalary()
    {
        return this._hours * PAY_PER_HOUR;
    };

    //print out part time developer
    @Override
    public String toString() {
        return "\nPartTimeDeveloper{" +
                "\nName=" + this._name +
                "\nPAY_PER_HOUR=" + PAY_PER_HOUR +
                "\nHours=" + _hours +
                "\nSalary=" + String.format("%d\n", calculateSalary()) +
                "isFullTime=" + this._isFullTime + "\n" +
                '}';
    }
}
