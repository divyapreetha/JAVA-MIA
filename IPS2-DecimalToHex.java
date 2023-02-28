//Java program to convert an Integer value to hexadecimal value

//Import the necessary packages
import java.util.*;
//Create a new class
public class DecimalToHex {
    
    //Create a main() method
    public static void main(String args[]){  
        int n;
        //Getting an integer from user
        System.out.println("Enter an integer");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        System.out.println("The hexadecimal value is ");
        String x = Integer.toHexString(n);
        System.out.println(x);  
        }   
}
