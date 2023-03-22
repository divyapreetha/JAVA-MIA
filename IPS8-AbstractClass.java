/*
Program Objective:
If you've ever walked into a small-town ice cream parlour, you know the smell—this sweet and nutty fragrance that has nothing to do with ice cream, and everything to do with those crisp and crunchy cones hand-rolled in the back. Let’s try to understand Java Abstraction with the help of these crunchy waffle cones.
First, all the waffle ingredients are mixed well and this liquid gets poured into a pan. The pan cooks it like sandwiches. Once it gets cooked, the mould machine shapes it into an ice cream waffle cone. Now the waffle cone is ready to fill the ice cream.  
All the ingredients that are required for the ice cream such as milk, sugar, etc are mixed and boiled. When it is ready, the liquid cream is cooled by the refrigerator. Then, an employee will place the waffle cones into the production line. Next, a machine sprinkles liquid chocolate over the ice cream. Then, another machine fills the cream into the cone. The ice cream is then dipped over the chocolate cream and the nuts respectively. Finally, the ice cream is ready to be transferred to the packaging line. Now, after packing it, it will be sent to the packaging shop.
Your objective is to use to write the logic for preparation of Waffle cone in an abstract class and complete the logic for filling your favourite flavoured ice cream into that waffle cone within a child class.
Directions:
1. Create a new abstract class named “Waffle”
2. Create a new concrete method named prepareWaffle() – Print the following within this method:
”WAFFLE CONE PREPARATION
Mix all the waffle ingredients
Pour this liquid into a pan and cook
The mould machine shapes it into a waffle cone
WAFFLE CONE IS READY”
3. Create two abstract methods – 
1. prepareFilling(String flavour) 
2. prepareTopping(String topping) 
4. Now, create the class Main. This class should extend the Waffle class. Define three methods within this Main class.
	1. prepareFilling(String flavour)
	2. prepareTopping(String topping)
	3. main() method
5. Logic for the method prepareFilling(String flavour): – Print the following within this method:
”ICE CREAM PREPARATION
Mix and boil the ingredients – milk, sugar, flavour
Refrigerate this liquid cream into a pan
Fill the waffle cone with this flavour flavoured ice cream”
6. Logic for the method prepareTopping(String topping): – Print the following within this method:
”Dip the ice cream over the chocolate cream
Dip again over the topping
Pack it and hand it to the customer”
7. Now, let’s write logic for the main() method. Use Scanner class to get the flavour and topping from the user. Create an object for the class and call the prepareWaffle(), prepareFilling(flavour) and prepareTopping(topping) method one by one.
Input Format
chocolate
nuts
Output Format
WAFFLE CONE PREPARATION
Mix all the waffle ingredients
Pour this liquid into a pan and cook
The mould machine shapes it into a waffle cone
WAFFLE CONE IS READY!
ICE CREAM PREPARATION
Mix and boil the ingredients - milk, sugar, chocolate       
Refrigerate this liquid cream into a pan
Fill the waffle cone with this chocolate flavoured ice cream
Dip the ice cream over the chocolate cream
Dip again over the nuts
Pack it and hand it to the customer

*/


import java.util.Scanner;

abstract class Waffle {
    void prepareWaffle() {
        System.out.println("WAFFLE CONE PREPARATION");
        System.out.println("Mix all the waffle ingredients");
        System.out.println("Pour this liquid into a pan and cook");
        System.out.println("The mould machine shapes it into a waffle cone");
        System.out.println("WAFFLE CONE IS READY!");
    }
    abstract void prepareFilling(String flavour);
    abstract void prepareTopping(String topping);
}
public class ChocoWaffle extends Waffle {
    void prepareFilling(String flavour) {
        System.out.println("ICE CREAM PREPARATION");
        System.out.println("Mix and boil the ingredients - milk, sugar, " + flavour);
        System.out.println("Refrigerate this liquid cream into a pan");
        System.out.println("Fill the waffle cone with this " + flavour + " flavoured ice cream");
    }
    void prepareTopping(String topping) {
        System.out.println("Dip the ice cream over the chocolate cream");
        System.out.println("Dip again over the " + topping);
        System.out.println("Pack it and hand it to the customer");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String flavour = scan.nextLine();
        String topping = scan.nextLine();
        Waffle chocolate = new ChocoWaffle();
        chocolate.prepareWaffle();
        chocolate.prepareFilling(flavour);
        chocolate.prepareTopping(topping);
        scan.close();
    }
}
