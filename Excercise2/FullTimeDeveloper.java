package Excercise2;

public class FullTimeDeveloper extends MobileDeveloper{

    public FullTimeDeveloper(String name)
    {
        super(name);
        super._isFullTime = true;
    }

    @Override public int calculateSalary()
    {
        return 6000;
    };

    @Override
    public String toString() {
        return "\nFullTimeDeveloper{" +
                "\nName=" + this._name +
                "\nSalary=" + String.format("%d\n", calculateSalary()) +
                "isFullTime=" + this._isFullTime + "\n" +
                '}';
    }

}
