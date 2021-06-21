package Excercise3;

//create abstract class that implements interface
public abstract class Mortgage implements MortgageConstants {
    //A Mortgage includes a mortgage number, customer name, amount of mortgage, interest rate, and term.
    protected static int mortgageNumber = 1000;
    protected String customerName;
    protected double mortgageAmount;
    protected TERM mortgageTerm;

    //create a constructor for mortgage
    public Mortgage(String customerName, double mortgageAmount, TERM mortgageTerm)
    {
        this.mortgageNumber += 1;
        this.customerName = customerName;
        this.mortgageAmount = setMortgageAmount(mortgageAmount);
        this.mortgageTerm = mortgageTerm;
    }

    //get the mortgage number
    public int getNumber() {
        return this.mortgageNumber;
    }

    //method to set mortgage amount. Any amount over maximum will be set to the maximum.
    public double setMortgageAmount(double mortgageAmount)
    {
     if (mortgageAmount > MAX_MORTGAGE)
     {
         return this.mortgageAmount = MAX_MORTGAGE;
     }
     else
     {
         return mortgageAmount;
     }
    }

    //set the length of the mortgage term.  If an appropriate value isn't entered, set to short term.
    public TERM setTerm(TERM value)
    {
     switch (value)
     {
         case SHORT_TERM -> {
             return TERM.SHORT_TERM;
         }
         case MEDIUM_TERM -> {
             return TERM.MEDIUM_TERM;
         }
         case LONG_TERM -> {
             return TERM.LONG_TERM;
         }
         default -> {
             return TERM.SHORT_TERM;
         }
     }
    }

    //method to create the mortgage amount
    public abstract double calculateMortgage();

}
