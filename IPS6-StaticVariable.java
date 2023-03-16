/*
Program Objective:
To print the name, roll number and faculty name of yourself and your close friend in this lab 313.
Directions:
1. Create a new class
2. Declare two instance variables - name and roll number.
3. Declare the variable to store faculty name as a static variable since I am the only faculty for this Java lab.
4. Initialize the value for the faculty within the static block
5. Create a new method - getDetails() - use this method to accept the roll number and name of a student from the user
6. Create a new method - printDetails() - use this method to print the student's name, roll number, faculty name
7. Now, let's write the main() method
8. Create two objects - first object to store details of yourself and the second object to store the details of your friend
9. Use getDetails() method to get the name and roll number details of yourself and your friend in command line
10. Print the details in the following format
Input Format
Akilan
1191
Simson
1158
Output Format
MY PROFILE
Name: Akilan       
Rollno: 1191       
Faculty: Divya     
MY FRIEND's PROFILE
Name: Simson       
Rollno: 1158     
Faculty: Divya


*/

import java.util.*;
public class StaticVariable {
    
    String name;
    int rollno;
    static String faculty;

    static {
        faculty = "Divya";
    }

    void getDetails() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name");
        name = scan.next();
        System.out.println("Enter the roll number");
        rollno = scan.nextInt();
    }
    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Rollno: " + rollno);
        System.out.println("Faculty: " + faculty);
    }

    public static void main(String[] args) {
        StaticVariable akilan = new StaticVariable();
        StaticVariable simpson = new StaticVariable();
        akilan.getDetails();
        simpson.getDetails();
        System.out.println("MY PROFILE");
        akilan.printDetails();
        System.out.println("MY FRIEND's PROFILE");
        simpson.printDetails();
    }
}
