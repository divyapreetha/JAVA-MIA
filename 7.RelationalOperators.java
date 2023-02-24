//Java program to illustrate the usage of relational operators - >, <, >=, <=, ==
//It returns a boolean value as output - true or false

//Create a new class
public class RelationalOperators {
    //Initialize the main() method
    public static void main(String[] args) {

        //Initialize three float values to perform relational operations
        float a = 15.0F, b = 20.75F, c = 15.0F;

        //Print the three values
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        //Perform the relational operations and print the result - true or false
        System.out.println("a < b is " + (a<b));
        System.out.println("a > b is " + (a>b));
        System.out.println("a == c is " + (a==c));
        System.out.println("a <= c is " + (a<=c));
        System.out.println("a >= b is " + (a>=b));
        System.out.println("b != c is " + (b!=c));
        System.out.println("b == a+c is " + (b==a+c));
    }
}
