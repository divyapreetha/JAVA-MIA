

//This code was written by your classmate JAIDEEP

/*
Make use of StringBuilder and StringBuffer class to print the following

Input Format:
Object Language

Output Format:
Object-Oriented Language improves security


*/

import java.util.*;
import java.io.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner get = new Scanner(System.in);
        String input=get.nextLine();
        StringBuffer text = new StringBuffer(input);
        /* getting a input string and sending it to the object of StringBuilder class
         * In java the String class is an immutable Class and so the StringBuffer class is a mutable class  
         * The StringBuilder class has inbuilt functions like append and insert that we will use to execute the program
         */ 
        text.insert(6,"-Oriented");
        /* the insert(parameter1,parameter2) function takes two parameters
         *  parameter1---> the index where u wanna insert the text
         *  parameter2----> the text u wanna insert
         * This now will insert the text in the given index
         */
        
        text.append(" improves security"); 
        /* append(parameter1) function takes only one parameter 
         * parameter1---> is the text that we insert
         * this can also be thought as inserting in the last index of any input string
         */
        System.out.println(text);
    }
}
