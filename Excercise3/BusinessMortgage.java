package Excercise3;
import  java.lang.Math;

public class BusinessMortgage extends Mortgage {
    //create variables for business mortgage
    protected final double BUSINESS_INTEREST_RATE = 0.02;
    protected double interestRate;
    protected int businessAccountNumber;

    //constructor for business mortgage
    public BusinessMortgage(String customerName, double mortgageAmount, double primeRate, TERM mortgageTerm)
    {
        super(customerName, mortgageAmount, mortgageTerm);
        this.interestRate = primeRate + BUSINESS_INTEREST_RATE;
        this.businessAccountNumber = super.getNumber();
    }

    //get the term
    public TERM getTerm()
    {
        return this.mortgageTerm;
    }

    //print out mortgage details
    @Override
    public String toString() {
        return "BusinessMortgage{" +
                "  customerName='" + customerName + '\'' +
                ", mortgageAmount=" + mortgageAmount +
                ", interestRate=" + interestRate +
                ", businessAccountNumber=" + businessAccountNumber +
                ", mortgageTerm=" + mortgageTerm +
                ", amountOwed=" + calculateMortgage() +
                '}';
    }

    //calculate the price of the mortgage
    @Override
    public double calculateMortgage() {
        if(this.mortgageTerm == TERM.SHORT_TERM)
        {
            return mortgageAmount * Math.pow((1 + interestRate), TERM.SHORT_TERM.termLength);

        }
        else if (this.mortgageTerm == TERM.MEDIUM_TERM)
        {
            return mortgageAmount * Math.pow((1 + interestRate), TERM.MEDIUM_TERM.termLength);

        }
        else
        {
            return mortgageAmount * Math.pow((1 + interestRate), TERM.LONG_TERM.termLength);
        }
    }
}
