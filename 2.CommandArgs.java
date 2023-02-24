//Java progran to demonstrate the usage of Command line arguments
//We use "javac CommandArgs.java" to compile the Java program
//We use "java CommandArgs" to run the program and view the output
//Do you know that we can also pass arguments in this "java CommandArgs"
//For example, "java CommandsArgs name1 name2"
//Now, your args[] array will have the value as ["name1", "name2"]
//Let's write this Java program to check it out

//Importing the necessary packages
import java.lang.*;

//Creating our class
class CommandArgs {
	
	//Defining the main() method
	public static void main(String args[]) {
		
		//Declaring a variable called "count" to count the number of arguments we have passed while running the code
		int count, i=0;
		
		//Declaring a dummy string to print your array of inputs within a while loop
		String s;
		
		//To find the number of elements in an array named "args", we use the syntax "args.length"
		count = args.length;
		
		//Printing the number of arguments that you have passed during run-time
		System.out.println("The number of arguments you hav passed is " + count);
		
		//Creating a while loop to print the list of values that you have passed one-by-one
		while(i<count){
			//First i=0, So, args[0] will be "name1" (the first argument that you had passed). This value gets stored in "s" and gets printed
			//Next,"i" gets incremented and the next argument you had passed will be stored in "s" and gets printed
			//The process continues till all the arguments that you have passed gets printed
			s = args[i];
			i++;
			System.out.println(s);
		}
	}
}
