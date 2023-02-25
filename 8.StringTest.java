//Java program to demonstrate how to get two String inputs from user within a for loop or while loop

//Import the packages
import java.util.*;

//Create a new class
public class StringTest {
  
    //Create the main() method
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String a,b;
       for(int i = 1; i<=2; i++){
        System.out.println("Loop Number: " + i); 
        System.out.println("Enter the first string input "); 
        a = scan.nextLine();
        System.out.println("The first string input is " + a); 
        System.out.println("Enter the second string input "); 
        b = scan.nextLine();
        System.out.println("The second string input is " + b);
     }
    }
}
