package Excercise2;

abstract class MobileDeveloper {
    protected String _name;
    protected boolean _isFullTime;

    public MobileDeveloper(String name)
    {
        this._name = name;
    }

    protected abstract int calculateSalary();

}
