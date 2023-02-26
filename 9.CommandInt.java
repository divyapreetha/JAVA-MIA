//Java program to get integer input from the command line itself
//Get two int numbers as input and calculate their sum

//Create a new class
class CommandInt {
	//create the main() method
    public static void main(String[] args){
        
        //Integer.parseInt() is used to convert your value from String datatype to Integer data-type
        //You can't give "public static void main(int[] args)" . Your JVM won't recognize this
        //So, your input will be treated first as a String. You have to convert it to int use the Integer.parseInt() method
        //You will get error if you try (int)args[0]. This will work only when you are converting numbers from one category to another eg., (float/double/byte/short/int/long)
            
        //Declare a variable 'a' to store the first argument
        int a = Integer.parseInt(args[0]);
        //Declare a variable 'b' to store the second argument
        int b = Integer.parseInt(args[1]);
        //Calculate their sum
        int c = a+b;
        //Print the sum
        System.out.println("Sum of the two numbers is "+c);
   }
}
