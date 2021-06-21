package Excercise2;

//create class for full time developer to extend mobile developer
public class FullTimeDeveloper extends MobileDeveloper{

    //constructor
    public FullTimeDeveloper(String name)
    {
        super(name);
        super._isFullTime = true;
    }

    // calculate salary
    @Override public int calculateSalary()
    {
        return 6000;
    };

    //print out the full time developer
    @Override
    public String toString() {
        return "\nFullTimeDeveloper{" +
                "\nName=" + this._name +
                "\nSalary=" + String.format("%d\n", calculateSalary()) +
                "isFullTime=" + this._isFullTime + "\n" +
                '}';
    }

}
