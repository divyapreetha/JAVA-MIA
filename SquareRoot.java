//Java program to determine the square root of a number

//Importing the lang package to make use of the Math class to perform the square root operation
import java.lang.Math;

//Creating a class named SquareRoot
public class SquareRoot {
	
	//Creating the main() method
	public static void main(String[] args) {
		
		//Declaring the number for which square root has to be found
		double a = 25;
		
		//Making use of the sqrt() method of Math class to calculate the square root of a number
		double s = Math.sqrt(a);
		
		//Printing the result
		System.out.println("The square root of " + a + " is " + s);
	}
}
