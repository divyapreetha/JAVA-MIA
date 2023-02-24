/* Java program to print the following pattern
 * 1
 * 2    2
 * 3    3   3
 * 4    4   4   4
 * 5    5   5   5   5
 * 6    6   6   6   6   6
 * 7    7   7   7   7   7   7 
 * 8    8   8   8   8   8   8   8
 * 9    9   9   9   9   9   9   9   9
 */

 //Create a new class
public class Pattern {
   
    //Initialize the main() method
    public static void main(String[] args) {
    
        //Logic to print our pattern
        //The outer for loop is to navigate through each row one by one
        for(int i = 1; i <= 9; i++){
        //The inner for loop is to print the items corresponding to each row (column-wise navigation)    
        for(int j=1; j <=i; j++){
            //When i = 1, this will print 1
            //When i = 2, this will print 2 2
            //"\t" is used to provide a tab space.
            System.out.print(i + "\t");
        }
    
    //This line is used to move the output cursor to the next line so that the next row's values will get displayed in a new line
    System.out.println();
    }
    //A final print statement to denote that our pattern is ready
    System.out.println("Our Pattern is ready");
   }
}
