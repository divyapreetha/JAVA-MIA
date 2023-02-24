//Java program to demonstrate how to create multiple classes within the same file

//Importing the necessary packages
import java.lang.*;

//Creating a class named Rectangle to define the necessary opeations to be performed on a rectangle
class Rectangle {
	
	//Declaring the length and breadth of a rectangle
	float length;
	float breadth;
	
	//Defining a new method to calculate the area of a rectangle and return the result
	public float findArea(float a, float b) {
		length = a;
		breadth = b;
		float area = length * breadth;
		return area;
	}
}

//Creating another class where we specify the main() method
//This file is named as "Shape.java" since the main() method is within this class
class Shape {
	
	//Creating our main() method
	public static void main(String[] args) {
		
		//Creating an object for our Rectangle class
		//We can access the variables and methods of a class only if we create an object for that class
		Rectangle rect = new Rectangle();
		
		//Calling the findArea() method of the Rectangle class using the object which we have created in the previous line
		//findArea() method is in another class named "Rectangle". So you can access it only with the help of an object
		//I have mentioned 15.8f because, in Java, floating point numbers should end with 'F' or 'f' ; else you will receive error
		float myArea = rect.findArea(12,15.8f);
		
		//Printing the result
		System.out.println("Area of your Rectangle is " + myArea);
	}
}
