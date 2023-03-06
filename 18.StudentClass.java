import java.util.*;
class StudentDetails {
    public int rollno;
    public int marks[] = new int[5];
    public String name;
    public String department;
    public String semester;

    Scanner sc = new Scanner(System.in);

    public void getStudentDetails() {
        
        System.out.println("Enter the roll number: ");
        rollno=sc.nextInt();
        System.out.println("Enter the name: ");
        name=sc.next();
        System.out.println("Enter the department: ");
        department=sc.next();
        System.out.println("Enter the semester: ");
        semester=sc.next();
        //Use a for loop to get all three marks of each student one-by-one
        for(int j=0;j<3;j++) 
        { 
            System.out.println("Enter the mark " + (j+1));
            marks[j]=sc.nextInt();
        }
    }

    public void printStudentDetails() {
        System.out.println("Roll number : " + rollno);
        System.out.println("Name : " +name);
        System.out.println("Department : " + department);
        System.out.println("Semester: " + semester);
        System.out.println("Marks are : ");
        int sum=0;
        //Use a for loop to add all the marks
        for (int j=0;j<3;j++) 
        {
            System.out.println(marks[j]);
            sum += marks[j];
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

}

public class Student {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = scan.nextInt();

        //Creating an array of objects for the StudentDetails class - one object for each student
        StudentDetails student[] = new StudentDetails[n];
        
        //Use a for loop to get student details from user
        for(int i = 0; i<n; i++) {
            System.out.println("Enter the details of Student " + (i+1));
            student[i] = new StudentDetails();
            student[i].getStudentDetails();
        }

        //Use a for loop to print all the student details
        System.out.println("Entering all the students' details one-by-one");
        for (int i=0;i<n;i++) 
        {
            System.out.println("Printing the details of Student " + (i+1));
            student[i].printStudentDetails();
        }

        scan.close();
    }
}
