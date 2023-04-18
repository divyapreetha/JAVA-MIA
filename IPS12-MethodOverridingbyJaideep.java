//This code was written by Jaideep

import java.util.*;
import java.io.*;
class Saravanas    // super-class definition named Sarvana this will be the parent class
{
    public void location()  // method declaration that returns the data type void as there is just a print statement
    {
        System.out.println("I live in Chennai");
    }
    public void personalDetails() // similar declaration like the method location();
    {
        System.out.println("Founder of Saravana Stores");
    }
}
class Legend extends Saravanas 
/* sub-class (or) child class declaration that derives all the functions of the parent class
 * but this prioritizes the functions of its own class before the parent class if they both have same method signatures
 * method-signatures is nothing but method name + method paramaters
 */
{
    public void personalDetails()  // method declaration of personal details as per question
    {
    System.out.println("Legendary Actor! Social Media Sensation");
    }
}
class Main
{
    public static void main(String[] args)
    {
        PrintWriter p  = new PrintWriter(System.out,true);
        // i call a PrintWriter class which calls the inbuilt function of Printwriter which does autoflush by itself
        // and can be given shorter names to escape the tedious task of writing System.out.println again and again
        Scanner get = new Scanner(System.in);
        String text =get.nextLine();
        p.println(text);  
        Legend call = new Legend();
        Saravanas call2 = new Saravanas();
        call.location();
        call2.personalDetails();
        call2.location();
        call.personalDetails();
        
    }
}
