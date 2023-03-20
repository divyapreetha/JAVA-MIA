/*
Abstract Class:
A class that is declared using "abstract" keyword is known as abstract class. It can have abstract methods(methods without body) as well as concrete methods (regular methods with body).

Consider an example.
Let us take a Banking Scenario. All banks have some common functionalities.

Common Functionalities in every bank: 1.depositMoney() 2.withdrawCash() 3.useATM() 4.giveLoan() 5.locker()
We can define these functionalities as normal methods within the Bank class

But there are some functionalities that are unique to each bank: 1.interestRate() 2.bankLayout() 3.minimumBalance() 4.usageCharges()
Each bank charges different interest rates for loan. Each bank deducts different processing charges for using the ATM facility, for availing gold loans, etc.

Steps to define a banking software
Step 1. Create a parent class called "Bank"

Step 2: Define the common behavior (eg., depositMoney()) which are same to all banks in this parent class

Step 3: As I mentioned earlier, there are other functionalities that are unique to each bank (SBI will have different interest rate for loan, while TMB will charge a higher interest rate)

Step 4: So, just declare these method names within the parent class. We can define the logic for these methods within separate child classes - SBI, TMB

Step 5: Create a child class named "SBI"

Step 6: Within the "SBI" class, write the logic for setting the interest rate.


Rules:

Rule 1:  There are cases when it is difficult or often unnecessary to implement all the methods in parent class. In these cases, we can declare the parent class as abstract, which makes it a special class which is not complete on its own.
        A class derived from the abstract class must implement all those methods that are declared as abstract in the parent class.

Rule 2: Abstract class cannot be instantiated which means you cannot create the object of it. To use this class, you need to create another class that extends this this class and provides the implementation of abstract methods, then you can use the object of that child class to call non-abstract methods of parent class as well as implemented methods(those that were abstract in parent but implemented in child class)

Rule 3: If a child does not implement all the abstract methods of abstract parent class, then the child class must need to be declared abstract as well.

Why can’t we create the object of an abstract class?
  Because these classes are incomplete, they have abstract methods that have no body so if java allows you to create object of this class then if someone calls the abstract method using that object then What would happen?There would be no actual implementation of the method to invoke.
Also because an object is concrete. An abstract class is like a template, so you have to extend it and build on it before you can use it.


*/

//I have defined a Bank class
abstract class Bank {

  //Defining the common behavior of all banks as a normal method
  void depositMoney() {
    System.out.println("Money is Deposited");
  }
  void withdrawCash() {
    System.out.println("Cash is Withdrawn");
  }

  //Defining the unique behavior as abstract method so that each bank can define their own logic while inheriting this class
  abstract void interestRate();
  abstract void usageCharges();
}

//Defining a new class for SBI Bank
public class SBIBank extends Bank {
  //This SBI bank class can inherit all the methods from Bank class
  //In addition, it writes its own logic for interest rate, usage charges, etc.
  void interestRate() {
    System.out.println("Interest Rate for SBI is 8%");
  }
  void usageCharges() {
    System.out.println("ATM charges - 200 INR");
    System.out.println("Loan Processing charges - 2000 INR");
    System.out.println("Minimum Balance Maintenance Fine - 100 INR");
  }

  //Main method - object creation time
  public static void main(String[] args) {

    //Creating an object. You can notice the change in syntax
    // ParentClassName objectName = new ChildClassName;

    //We can't directly create an object for our abstract parent class because we haven't defined all its methods completely. Some methods in our parent Bank is "abstract" means, it is incomplete.
    Bank sbiAdyar = new SBIBank();

    //Accessing the common behavior
    sbiAdyar.depositMoney();
    sbiAdyar.withdrawCash();

    //Accessing behavior that is unique to SBI bank
    sbiAdyar.interestRate();
    sbiAdyar.usageCharges();  
      
  }
}

/*
 * If you want to define logic for Indian Bank,
 * 1. Create another new file
 * 2. Write a class for IndianBank
 * 3. "class IndianBank extends Bank"
 * 4. Write the interestRate(), usageCharges() logic specific to the Indian bank protocol
 * 5. Write the main() method within the IndianBank class
 * 6. Create an object "Bank indianBankVITCampus = new Bank();"
 * 7. Access both the concrete (common) methods and abstract (unique) methods through this object.
 * 
 */
