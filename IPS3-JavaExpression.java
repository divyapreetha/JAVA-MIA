//Java program to evaluate an expression (3X^2 + 2X + 1)

//Import the necessary packages
import java.util.*;

//Create a new class
public class Expression {
    //Initialize the main() method
    public static void main(String[] args) {
        double x,y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        x = scan.nextDouble();
        //Evaluate the given expression
        y = (3 * Math.pow(x,2)) + (2 * x) + 1;
        System.out.println("The result of the given expression is: ");
        System.out.print(y);
    }

}
