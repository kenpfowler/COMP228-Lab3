### Exercise 1
Write a Java application that implements different types of bank accounts for customers.
- [ ] Let Account be an abstract superclass 
  
- [ ] Chequing and Savings two of its subclasses that describe respectively
  checking account and savings account.

- [ ] The Account class defines an instance variable of type of int to describes the type of account number,
  type String to describe the type of account
  and an instance variable of type double to hold the balanceAmount of that account.

- [ ] Implement the get methods for both variables of class Account. 
  Declare also two abstract methods named setBalancedAmount()
  and displayInfo() for this class.

- [ ] The Checking and Savings class should implement setBalancedAmount()
  and display methods by setting the appropriate balance amount
  and display the information for each account type.

- [ ] Write a driver class named AccountTest to test this hierarchy.
  This application should ask the user to enter the type of account and its balance amount. 
  Then, will create the appropriate object (chequing and savings) and display the account information.

- [ ] As you create each account object, 
  place an Account reference to each new Account object into an array. 
  Each class has its own setBalancedAmount() method. 
  Write a polymorphic screen manager that walks through the array 
  sending setBalancedAmount messages to each object in the array 
  and displaying this information on the screen. 
  (3 marks)

### Exercise 2

- [ ] Create an abstract class called MobileDeveloper. 
  The MobileDeveloper class includes a name for the developer
  and a boolean value representing the status (full-time, part-time).

- [ ] Include an abstract method to determine the salary, 
  with full-time mobile developers getting a base salary of $6000 
  and part-time mobile developers getting $30 per hour.

- [ ] Create two subclasses called FullTimeDeveloper, PartTimeDeveloper. 
  Create a console application that demonstrates how to create objects of both subclasses. 
  Allow the user to choose mobile developer type and enter the number of hours for the part-time developers.
  (3 marks)
  
### Exercise 3
- [ ] Centen bank provides mortgages for individuals and businesses up to $800,000.
  Write a Java application that keeps track of mortgages
  and computes the total amount owed at any time (mortgage amount + interest).

##### Design the following classes to implement your application:

- [ ] Mortgage – an abstract class that implements the MortgageConstants interface. 
  A Mortgage includes a mortgage number, customer name, amount of mortgage, interest rate, and term.

- [ ] Don’t allow mortgage amounts over $800,000. 
  Force any mortgage term that is not defined in the MortgageConstants interface to a short-term,
  one year loan. Create a getMortgageInfo method to display all the mortgage data.

- [ ] MortgageConstants – includes constant values for short-term (one year), medium-term (three years) and long-term (5 years) mortgages. 
  It also contains constants for bank name and the maximum mortgage amount.

- [ ] BusinessMortgage – extends Mortgage. 
  Its constructor sets the interest rate to 2% over the current prime rate.

- [ ] PersonalMortgage - extends Mortgage. 
  Its constructor sets the interest rate to 3% over the current prime rate.

- [ ] ProcessMortgage – a main class that create an array of 3 mortgages. 
  Prompt the user for the current interest rate. 
  Then in a loop prompts the user for a mortgage type and all relevant information for that mortgage. 
  Store the created Mortgage objects in the array. When data entry is complete, display all mortgages.
  (4 marks)