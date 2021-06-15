package Excercise1;

//driver class for the account classes
public class AccountTest {
    //main method
    public static void main(String [] args)
    {
        //Code goes here...
        Chequing account = new Chequing(2000);
        account.displayInfo();
        Savings account2 = new Savings(1000);
        account2.displayInfo();
        Savings account3 = new Savings(1000);
        account3.displayInfo();

    }
}
