/* Java program to print the following pattern
 *  *
 *  * *
 *  * * *
 *  * * * *
 *  * * * * *
 */

//Importing the util package to use the Scanner class
 import java.util.*;
 //Create a new class
public class Pattern {
   
    //Initialize the main() method
    public static void main(String[] args) {
    
        int n;
        System.out.println("Enter the number of rows ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        //Logic to print our pattern
        //The outer for loop is to navigate through each row one by one
        for(int i = 1; i <= n; i++){
        //The inner for loop is to print the items corresponding to each row (column-wise navigation)    
        for(int j=1; j <=i; j++){
            //When i = 1, this will print *
            //When i = 2, this will print * *
            System.out.print("* ");
        }
    
    //This line is used to move the output cursor to the next line so that the next row's values will get displayed in a new line
    System.out.println();
    }
    
   }
}
