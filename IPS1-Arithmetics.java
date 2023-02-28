//Java program to perform the basic arithmetic operations like + - * / %

//Import the necessary packages
import java.util.*;
import java.lang.*;

//Create a new class
class Main{
    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        a = scan.nextInt();
        System.out.println("Enter number 2 : ");
        b = scan.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        
    }
}
