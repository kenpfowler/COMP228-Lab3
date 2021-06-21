package Excercise2;

//create abstract class for mobile developer
abstract class MobileDeveloper {
    //create instance variables
    protected String _name;
    protected boolean _isFullTime;

    //constructor
    public MobileDeveloper(String name)
    {
        this._name = name;
    }
    //abstract method to calculate salary
    protected abstract int calculateSalary();

}
