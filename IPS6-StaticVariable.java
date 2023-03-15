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
