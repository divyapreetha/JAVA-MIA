import java.util.*;
class A { 
    int a, b; 
    void display() 
    { 
        System.out.println("Inside class A values = " + a + " " + b); 
    } 
} 
class B extends A { 
    int c; 
    void show() 
    { 
        System.out.println("Inside Class B values= " + a + " " + b + " " + c);  
    } 
} 
public class SingleInheritance { 
    public static void main(String args[])     { 
        Scanner scan = new Scanner(System.in);
        B obj = new B(); //derived class object 
        obj.a=scan.nextInt(); 
        obj.b=scan.nextInt(); 
        obj.c=scan.nextInt(); 
        obj.display(); 
        obj.show(); 
        scan.close();
    } 
} 
