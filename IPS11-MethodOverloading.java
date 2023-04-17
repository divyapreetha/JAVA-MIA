/*
IPS-11 Questions

Fine Dining
Program Objective:
Imagine you are going on a solo-bike trip to Ladakh. It’s almost lunch time and you feel hungry. Using your GPS, you decide to have lunch at JW Marriott, New Delhi. Once you have occupied your table, the waiter gives you the food menu. A full course meal includes a soup, a starter, the main dish and a dessert. You can either have a full-course meal or a limited meal. Let’s implement this food choice operation using Java’s method overloading concept.

Description:
Step 1: Create a class named “Menu”
Step 2: Create a new method greeting(String name). This method must print 
“Welcome <name>!”
Step 3: Next, let’s create a method orderFood(). This method is used by the waiter to get the customer’s order. Not all customers will be interested to have a full-course meal (soup, starter, mainDish, dessert). Some customers can either have (starter, mainDish, dessert). Some customers can just have (mainDish, dessert). Instead of creating a new method for each order category, we can overload the same method with different arguments, so that at compile time, we can bind the order category with the corresponding method. That’s METHOD OVERLOADING. Come, let’s do it
Step 4: Create a method named “orderFood(String soup, String salad, String mainDish, String dessert)”. This method must be called when a customer orders a four-course meal. Within this method, print the following:
“Four-course meal
Soup : <soup>
Salad : <salad>
Main Dish : <mainDish>
Dessert : <dessert>”
Step 5: Create a method named “orderFood(String starter, String mainDish, String dessert)”. This method must be called when a customer orders a three-course meal. Within this method, print the following:
“Three-course meal
Starter : <starter>
Main Dish : <mainDish>
Dessert : <dessert>”
Step 6: Create a method named “orderFood(String mainDish, String dessert)”. This method must be called when a customer orders a two-course meal. Within this method, print the following:
“Two-course meal
Main Dish : <mainDish>
Dessert : <dessert>”
Step 7: Close this class named “Menu”
Step 8: Create a class named “Main”
Step 9: Create the main() method
Step 10: Use the Scanner class to get the following inputs – yourName (String)(This is your name), orderType (Integer)(This denotes the number of items you want to have)
Step 11: Create an object for the class named ”Menu”. We can access the greeting() method and orderFood() method only by creating an object for this Menu class.
Step 12: Use the if..else statement to call the corresponding orderFood() method based on the orderType (Number of food items)
Step 13: If the orderType == 2, get the mainDish and dessert as input from the user using the Scanner classs and call the method greeting(yourName), orderFood(mainDish, dessert)
Step 14: Else If the orderType == 3, get the starter, mainDish and dessert as input from the user using the Scanner classs and call the method greeting(yourName), orderFood(starter, mainDish, dessert)
Step 15: Else If the orderType == 4, get the soup, salad, mainDish and dessert as input from the user using the Scanner classs and call the method greeting(yourName), orderFood(soup, salad, mainDish, dessert)
Step 16: Else, (a) call the method greeting(yourName). (b) Print “Invalid Order Type”
Step 17: Close the main() method and the Main class.
Note: Getting the food order from customer is a single function; but the order type of customer can differ based on their budget. Hence, we have used “method overloading”.
Input Format:
Yuvaraj
2
Nalli Korma
Kesari Rasmalai
Output Format:
Welcome Yuvaraj!
Two-course meal
Main Dish : Nalli Korma
Dessert : Kesari Rasmalai
 

 */

import java.util.*;

class Menu {

    void greeting(String name) {
        System.out.println("Welcome " + name + "!");
    }

    void orderFood(String soup, String salad, String mainDish, String dessert) {
        System.out.println("Four-course meal");
        System.out.println("Soup : " + soup);
        System.out.println("Salad : " + salad);
        System.out.println("Main Dish : " + mainDish);
        System.out.println("Dessert : " + dessert);
    }

    void orderFood(String starter, String mainDish, String dessert) {
        System.out.println("Three-course meal");
        System.out.println("Starter : " + starter);
        System.out.println("Main Dish : " + mainDish);
        System.out.println("Dessert : " + dessert);
    }

    void orderFood(String mainDish, String dessert) {
        System.out.println("Two-course meal");
        System.out.println("Main Dish : " + mainDish);
        System.out.println("Dessert : " + dessert);
    }

}

public class Restaurant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int orderType = scan.nextInt();
        scan.nextLine();
        Menu myMenu = new Menu();
        
        if(orderType == 2) {
            String mainDish = scan.nextLine();
            String dessert = scan.nextLine();
            myMenu.greeting(name);
            myMenu.orderFood(mainDish, dessert);
        }
        else if (orderType == 3) {
            String starter = scan.nextLine();
            String mainDish = scan.nextLine();
            String dessert = scan.nextLine();
            myMenu.greeting(name);
            myMenu.orderFood(starter, mainDish, dessert);
        }
        else if (orderType == 4) {
            String soup = scan.nextLine();
            String salad = scan.nextLine();
            String mainDish = scan.nextLine();
            String dessert = scan.nextLine();
            myMenu.greeting(name);
            myMenu.orderFood(soup, salad, mainDish, dessert);
        }
        else {
            myMenu.greeting(name);
            System.out.println("Invalid Order Type");
        }
        scan.close();
       
    }
}
