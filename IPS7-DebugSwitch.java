import java.util.*;
public class DebugSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = scan.nextInt();
        char grade;
        if(result >= 90) {
            grade = 'A';
        }
        else if(result >= 80) {
            grade = 'B';
        }
        else if(result >= 70) {
            grade = 'C';
        }
        else if(result >= 60) {
            grade = 'D';
        }
        else if(result >= 50) {
            grade = 'E';
        }
        else {
            grade = 'F';
        }
        System.out.println("Grade of the student is " + grade);
        scan.close();
    }
}
