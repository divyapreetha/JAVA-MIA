//Java program to demonstrate the basic datatypes in Java
/* Primitive Data types in Java
 * Integer - byte, short, int, long
 * Floating Point - float, double
 * Character - char
 * Boolean - boolean
 * 
 * Java supports both positive and negative numbers.
 * There is no concept of "unsigned" integers in Java
 * 
 * The memory allocation for each datatype is 
 * byte - 1 byte [1 byte = 8 bits. 2^8=256. So a byte datatype can store 256 values. They are -128 to 127]
 * short - 2 bytes
 * int - 4 bytes
 * long - 8 bytes [You should add 'L' or 'l' at the end while defining a new 'long' value. e.g., long ab = 121218734L]
 * 
 * float - 4 bytes [You should add 'F' or 'f' at the end while defining a new 'float' value. e.g., float ab = 12.34F]
 * double - 8 bytes
 * 
 * char - 1 byte
 * 
 * boolean - 1 bit  (true or false)
 */

//Create a new class
public class Datatypes {
    
    //Initialize the main() method
    public static void main(String[] args) {
        
        System.out.println("Variables created");
        
        //Declare some variables - one from each datatype
        char c = 'x';
        byte b = 50;
        short s = 1992;
        int i = 123456789;
        long l = 123456789765434L;
        float f1 = 3.14F;
        float f2 = 1.2e-5F;
        double d2 = 0.00000000987;

        //Print each value
        System.out.println("c = " + c);
        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("d2 = " + d2);
        System.out.println(" ");

        //Type-casting = Converting one datatype to another
        /*Two types of typecasting - Implicit and Explicit
         * 1.Implicit Typecasting: Converting from a narrower datatype to a wider datatype
         *Datatypes who has higher memory allocation are called wider datatypes
         e.g., When we compare 'long' and 'int', we can say that 'long' is the wider datatype because its memory allocation is 8 bytes.
         'int' is a narrower datatype since its memory allocation is 4 bytes
         
         2.Explicit Typecasting: Converting from a wider datatype to a narrower datatype
         *Datatypes who has higher memory allocation are called wider datatypes

         In simple terms, imagine yourself standing in the Trends showroom shopping for T-shirt
         If your T-shirt size is 'S', you can also buy T-shirts of size 'M', 'L', 'XL', etc. 
         You can wear a bigger size T-shirt when you feel sick. This is called implicit casting. 
         byte(S size), short(M size), int(L size), long(XL size) 

         Imagine a situation, when you met with an accident and gained some weight. Now your 'S' size T-shirt is too tight for you. 
         You have to lose some weight in order to fit in to your S-sized T-shirt. This is called explicit casting
         e.g., 1.2 is a float value. If I convert it into int type, the result will be 1. The 0.2 got omitted in order to convert it into an int type.
         *
         */
        System.out.println("Types converted");
        short s1 = (short)b; //Explicit Typecasting
        short s2 = (short)i; //Produces incorrect result
        float n1 = (float)l;
        int m1 = (int)f1;
        System.out.println(" (short)b = " + s1);
        System.out.println(" (short)i = " + s2);
        System.out.println(" (int)f1 = " + m1);
        System.out.println(" (float)l = " + n1);

    }
}
