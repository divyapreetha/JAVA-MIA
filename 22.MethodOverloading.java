/*
 * Polymorphism is the ability of an object to take several forms.
 * The derivation of the word Polymorphism is from two different Greek words- poly and morphs. "Poly" means numerous, and "Morphs" means forms.
 * 
 * Polymorphism in Java allows us to perform the same action in many different ways.
 * 
 * Real Life Example of Polymorphism:
 * An individual can have different relationships with different people. A woman can be a mother, a daughter, a sister, and a friend, all at the same time, i.e. she performs other behaviors in different situations.
 * 
 * There are two types of Polymorphism
 * 1. Static Polymorphism (or) Method Overloading (or) Early Binding
 * 2. Dynamic Polymorphism (or) Method Overriding (or) Late Binding
 * 
 * 1. Method Overloading
 * Method overloading is the process that can create multiple methods of the same name in the same class, and all the methods work in different ways. Method overloading occurs when there is more than one method of the same name in the class.
 * 
 */

import java.util.*;

class Shape {
    
    int area = 0;
    
    public void area(int a) {
        System.out.println("SQUARE");
        area = a * a;
        System.out.println("Area of your SQUARE is " + area);
    }
    public void area(int l, int b) {
        System.out.println("RECTANGLE");
        area = l * b;
        System.out.println("Area of your RECTANGLE is " + area);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Shape shape1 = new Shape();
        //Calling the area() method with only one argument
        shape1.area(2);

        Shape shape2 = new Shape();
        //Calling the area() method with two arguments
        shape2.area(3,4);
        
        scan.close();
    }
}
