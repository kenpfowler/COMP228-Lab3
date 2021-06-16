package Excercise2;

public class PartTimeDeveloper extends MobileDeveloper{
    private int _hours;
    private final int PAY_PER_HOUR = 30;

    public PartTimeDeveloper(String name, int hours)
    {
        super(name);
        super._isFullTime = false;
        this._hours = hours;
    }

    @Override public int calculateSalary()
    {
        return _hours * PAY_PER_HOUR;
    };

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
