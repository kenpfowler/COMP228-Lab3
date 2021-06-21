### Lab 3 : Using Inheritance and Polymorphism.
### Due Date:  End of Week 6,  Sunday 20 June at 11:59 pm.

Purpose: The purpose of this Lab assignment is to:
* Practice the use of Inheritance
* Practice the use of Polymorphism.

Be sure to read the following general instructions carefully:
You must name your Eclipse projects according to the following rule:
* YourFullName_COMP228Labnumber
* Each exercise should be placed in a separate package named exercise1, exercise2, etc.

Submit your assignment in a zip file that is named according to the following rule:
* YourLastName_COMP228Labnumber.zip

Apply the naming conventions for variables, methods, classes, and packages:
* variable names start with a lowercase character
* classes start with an uppercase character
* packages use only lowercase characters
* methods start with a lowercase character

### Exercise 1
Write a Java application that implements different types of bank accounts for customers.
- [x] Let Excercise1.Account be an abstract superclass 
  
- [x] Chequing and Savings two of its subclasses that describe respectively
  checking account and savings account.

- [x] The Excercise1.Account class defines an instance variable of type of int to describes the type of account number,
  type String to describe the type of account
  and an instance variable of type double to hold the balanceAmount of that account.

- [x] Implement the get methods for both variables of class Excercise1.Account. 
  Declare also two abstract methods named setBalancedAmount()
  and displayInfo() for this class.

- [x] The Checking and Savings class should implement setBalancedAmount()
  and display methods by setting the appropriate balance amount
  and display the information for each account type.

- [x] Write a driver class named AccountTest to test this hierarchy.
  This application should ask the user to enter the type of account and its balance amount. 
  Then, will create the appropriate object (chequing and savings) and display the account information.

- [x] As you create each account object, 
  place an Excercise1.Account reference to each new Excercise1.Account object into an array. 
  Each class has its own setBalancedAmount() method. 
  Write a polymorphic screen manager that walks through the array 
  sending setBalancedAmount messages to each object in the array 
  and displaying this information on the screen. 
  (3 marks)
  
### Exercise 2

- [x] Create an abstract class called MobileDeveloper. 
  The MobileDeveloper class includes a name for the developer
  and a boolean value representing the status (full-time, part-time).

- [x] Include an abstract method to determine the salary, 
  with full-time mobile developers getting a base salary of $6000 
  and part-time mobile developers getting $30 per hour.

- [x] Create two subclasses called FullTimeDeveloper, PartTimeDeveloper. 
  Create a console application that demonstrates how to create objects of both subclasses. 
  Allow the user to choose mobile developer type and enter the number of hours for the part-time developers.
  (3 marks)
  
### Exercise 3
- [x] Centen bank provides mortgages for individuals and businesses up to $800,000.
  Write a Java application that keeps track of mortgages
  and computes the total amount owed at any time (mortgage amount + interest).

##### Design the following classes to implement your application:

- [x] Mortgage – an abstract class that implements the MortgageConstants interface. 
  A Mortgage includes a mortgage number, customer name, amount of mortgage, interest rate, and term.

- [x] Don’t allow mortgage amounts over $800,000. 
  Force any mortgage term that is not defined in the MortgageConstants interface to a short-term,
  one year loan. Create a getMortgageInfo method to display all the mortgage data.

- [x] MortgageConstants – includes constant values for short-term (one year), medium-term (three years) and long-term (5 years) mortgages. 
  It also contains constants for bank name and the maximum mortgage amount.

- [x] BusinessMortgage – extends Mortgage. 
  Its constructor sets the interest rate to 2% over the current prime rate.

- [x] PersonalMortgage - extends Mortgage. 
  Its constructor sets the interest rate to 3% over the current prime rate.

- [x] ProcessMortgage – a main class that create an array of 3 mortgages. 
  Prompt the user for the current interest rate. 
  Then in a loop prompts the user for a mortgage type and all relevant information for that mortgage. 
  Store the created Mortgage objects in the array. When data entry is complete, display all mortgages.
  (4 marks)