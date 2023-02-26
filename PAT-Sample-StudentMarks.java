//Java Program for the student marks question which I shared
//This code was written by your classmate JAIDEEP

//Import the necessary packages
import java.util.*;

//Create a new class
public class Student 
{   
    //Create the main() method
    public static void main(String[] args) 
    {
        //Creating an object for the Scanner class in order to get user input
        Scanner scan = new Scanner(System.in);
        //Get the total number of students as input
        System.out.println("Enter the number of students: ");
        int n=scan.nextInt();
        //Create separate arrays to store the roll number, name, department, semester and marks of each student
        //The syntax to create a one-dimensional integer array is "int[] a = new int[10]"
        
        int rollno[] = new int[22];
        //The syntax to create a two-dimensional integer array is "int[][] a = new int[10][10]"
        int mark[][] = new int[22][3]; 
        //The syntax to create a one-dimensional String array is "String[] a = new String[10]"
        //Since name, department and semester are String values, we are creating String arrays to store them
        String name[] = new String[22];
        String department[] = new String[22];
        String semester[] = new String[22];
        int i,j,sum;
        //Use a for loop to get each student's data one-by-one
        for (i=0;i<n;i++) 
        {
            System.out.println("Student Number " + (i+1));
            System.out.println("Enter the roll number: ");
            rollno[i]=scan.nextInt();
            System.out.println("Enter the name: ");
            name[i]=scan.next();
            System.out.println("Enter the department: ");
            department[i]=scan.next();
            System.out.println("Enter the semester: ");
            semester[i]=scan.next();
            //Use a for loop to get all three marks of each student one-by-one
            for(j=0;j<3;j++) 
            { 
                System.out.println("Enter the mark " + (j+1));
                mark[i][j]=scan.nextInt();
            }
        }
        System.out.println("Entering all the students' details one-by-one");
        for (i=0;i<n;i++) 
        {
            System.out.println("Student " + (i+1));
            System.out.println("Roll number : " + rollno[i]);
            System.out.println("Name : " +name[i]);
            System.out.println("Department : " + department[i]);
            System.out.println("Semester: " + semester[i]);
            System.out.println("Marks are : ");
            sum=0;
            //Use a for loop to add all the marks
            for (j=0;j<3;j++) 
            {
                System.out.println(mark[i][j]);
                sum+=mark[i][j];
            }
            System.out.println("The Total is " + sum);
            //Calculate the student's average marks
            int average = sum/3;
            System.out.println("Average Marks is " + average);
            //Determine the student's grade based on their average marks
            if (average>=95 && average<=100)
             {
                System.out.println("Student's grade is S");
            } 
            else if (average>=90 && average<95)
             {
                System.out.println("Student's grade is A");
            } else 
            {
                System.out.println("Invalid Grade");
            }
        }
        scan.close();
    }
}
