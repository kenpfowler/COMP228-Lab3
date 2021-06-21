package Excercise3;

//import utility functions
import java.util.Scanner;
import java.util.ArrayList;

public class ProcessMortgage {
    public static void main(String[] args) {
        //create array and scanner
        ArrayList<Mortgage> mortgages = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        //create control variables
        boolean isDoneChoosing = false;
        int choice  = 0;

        //create loop to create mortgages and add to array
        while(!isDoneChoosing)
        {
            //prompt user
            System.out.println("To create a Welcome to " + MortgageConstants.BANK_NAME + "!");
            System.out.println("To create a Business Mortgage press 1");
            System.out.println("To create a Personal Mortgage press 2");
            System.out.println("To exit and view your choices, press 3");
            choice = Integer.parseInt(scanner.next());

            if (choice == 1)
            {
                //create a new business mortgage
                System.out.println("Enter your customers name: ");
                String customerName = scanner.next();
                System.out.println("Enter your mortgage amount (MAX: $800,000): ");
                double mortgageAmount = Double.parseDouble(scanner.next());
                System.out.println("Enter the prime interest rate: ");
                double interestRate = Double.parseDouble(scanner.next());
                System.out.println("Enter the term of your mortgage: (1, 3, or 5 years)");
                int term = Integer.parseInt(scanner.next());
                TERM termSelected;
                switch (term)
                {
                    case 1: termSelected = TERM.SHORT_TERM;
                    break;
                    case 3: termSelected = TERM.MEDIUM_TERM;
                    break;
                    case 5: termSelected = TERM.LONG_TERM;
                    break;
                    default: termSelected = TERM.SHORT_TERM;
                }
                mortgages.add(new BusinessMortgage(customerName, mortgageAmount, interestRate, termSelected));
            }
            else if (choice == 2)
            {
                //create a new personal mortgage
                System.out.println("Enter your customers name: ");
                String customerName = scanner.next();
                System.out.println("Enter your mortgage amount (MAX: $800,000): ");
                double mortgageAmount = Double.parseDouble(scanner.next());
                System.out.println("Enter the prime interest rate: ");
                double interestRate = Double.parseDouble(scanner.next());
                System.out.println("Enter the term of your mortgage: (1, 3, or 5 years)");
                int term = Integer.parseInt(scanner.next());
                TERM termSelected;
                switch (term)
                {
                    case 1: termSelected = TERM.SHORT_TERM;
                        break;
                    case 3: termSelected = TERM.MEDIUM_TERM;
                        break;
                    case 5: termSelected = TERM.LONG_TERM;
                        break;
                    default: termSelected = TERM.SHORT_TERM;
                }

                mortgages.add(new PersonalMortgage(customerName, mortgageAmount, interestRate, termSelected));
            }

            else if (choice == 3)
            {
                //display mortgages and exit program
                isDoneChoosing = true;
                if (!mortgages.isEmpty())
                {
                    for (Mortgage mortgage: mortgages)
                    {
                        System.out.println(mortgage.toString());
                    }
                }
                System.out.println("Thanks for using the program. Bye!");
            }
            choice = 0;
        }
    }
}
