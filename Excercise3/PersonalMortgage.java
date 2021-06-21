package Excercise3;

public class PersonalMortgage extends Mortgage
{
    //create personal mortgage variables
    protected final double PERSONAL_INTEREST_RATE = 0.03;
    protected double interestRate;
    protected int personalAccountNumber;

    //personal mortgage constructor
    public PersonalMortgage(String customerName, double mortgageAmount, double primeRate, TERM mortgageTerm)
    {
        super(customerName, mortgageAmount, mortgageTerm);
        this.interestRate = primeRate + PERSONAL_INTEREST_RATE;
        this.personalAccountNumber = super.getNumber();

    }

    //get term method
    public TERM getTerm()
    {
        return this.mortgageTerm;
    }

    //print out the variables for personal mortgage
    @Override
    public String toString() {
        return "PersonalMortgage{" +
                "  customerName='" + customerName + '\'' +
                ", mortgageAmount=" + mortgageAmount +
                ", interestRate=" + interestRate +
                ", personalAccountNumber=" + personalAccountNumber +
                ", mortgageTerm=" + mortgageTerm +
                ", amountOwed=" + calculateMortgage() +
                '}';
    }

    //calculate the value of the loan
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


