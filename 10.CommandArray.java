//Java program to get an array of marks from the command line itself

//Create a new class
class CommandArray {

    //create the main() method
	public static void main(String[] args){

        //Create an Integer array
        int a[] =  new int[10];
        //Create a new variable to store the number of marks that you have passed in command line 
        int n = args.length;
        //Create an int variable to store the total of all marks
        int sum = 0;
        /*Create a for loop
         * Use this for loop to get the command line arguments one-by-one
         * Store these values in your Integer array that you have created
         * Add these values one-by-one in order to get the total marks
         * 
         */
        for (int i = 0; i<n; i++) {
            //Getting the command line arguments and storing it in your array
            //Integer.parseInt() is used to convert your value from String datatype to Integer data-type
            //You can't give "public static void main(int[] args)" . Your JVM won't recognize this
            //So, your input will be treated first as a String. You have to convert it to int use the Integer.parseInt() method
            //You will get error if you try (int)args. This will work only when you are converting numbers from one category to another eg., (float/double/byte/short/int/long)
            a[i] = Integer.parseInt(args[i]);
            //Add the marks and store it in a variable named "sum"
            sum += a[i];
        }
        //Find the average mark
        int average = sum/n;
        //Print the average mark
        System.out.println("The average mark is " + average);
        
     }
}
