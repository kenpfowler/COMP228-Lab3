package Excercise2;

//create utility functions
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        //create control variables
        boolean isDoneChoosing = false;
        int choice  = 0;

        //create utility functions
        Scanner scanner = new Scanner(System.in);
        ArrayList<MobileDeveloper> developers = new ArrayList();

        //create loop for creating developers
        while(!isDoneChoosing)
        {
            //prompt user
            System.out.println("To create a full-time mobile developer press 1");
            System.out.println("To create a part-time mobile developer press 2");
            System.out.println("To exit and view your choices, press 3");
            choice = Integer.parseInt(scanner.next());
            if (choice == 1)
            {
                //create full time developer
                System.out.println("Enter your developers name: ");
                String name = scanner.next();
                developers.add(new FullTimeDeveloper(name));
            }
            else if (choice == 2)
            {
                //create part time developer
                System.out.println("Enter your developers name: ");
                String name = scanner.next();
                System.out.println("Enter your developers hours per week: ");
                int hours = Integer.parseInt(scanner.next());

                developers.add(new PartTimeDeveloper(name, hours));
            }
            else if (choice == 3)
            {
                //print out developers and exit program
                isDoneChoosing = true;
                if (!developers.isEmpty())
                {
                    for (MobileDeveloper developer: developers)
                    {
                        System.out.println(developer.toString());
                    }
                }
                System.out.println("Thanks for using the program. Bye!");
            }
            choice = 0;
        }
    }
}
