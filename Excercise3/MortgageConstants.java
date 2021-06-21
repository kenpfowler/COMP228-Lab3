package Excercise3;

//create enum for mortgage terms and length
enum TERM
{
    SHORT_TERM(1),
    MEDIUM_TERM(3),
    LONG_TERM(5);

    final int termLength;

    TERM(int length)
    {
        termLength = length;
    }
}

//create interface
public interface MortgageConstants {
    //declare constants
    String BANK_NAME = "Centen Bank";
    Double MAX_MORTGAGE = 800000.00;

    TERM getTerm();
}
