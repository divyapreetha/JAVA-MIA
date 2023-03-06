/*Java program to perform bitwise operations
    j = m|n
    k = m&n
    l=m^n
    p=~m
Explaining how a bitwise operation is performed
Let m=62 and n=23.
First, represent these numbers as 8-bits (by byte)
Then, convert these numbers to binary
Binary equivalent of 62 = 0011 1110
Binary equivalent of 23 = 0001 0111

Bitwise OR operation
j = m|n  
j = 0011 1111   
j = 63 in decimal

Bitwise AND operation
k = m&n  
k = 0001 0110
k = 22 in decimal

Bitwise XOR operation
l = m|n  
l = 0010 1001
l = 41 in decimal

Bitwise NOT operation
p = ~m  
p = 1100 0001
p = -63 in decimal
*/

//Import the necessary packages
import java.util.*;
//Create a new class
public class Bitwise {
    //Create the main() method
    public static void main(String[] args) {
        int m,n,j,k,l,p;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of m : ");
        m = scan.nextInt();
        System.out.println("Enter the value of n : ");
        n = scan.nextInt();
        j = m|n;
        k = m&n;
        l = m^n;
        p = ~m;
        System.out.println("j = m|n = " + j);
        System.out.println("k = m&n = " + k);
        System.out.println("l = m^n = " + l);
        System.out.println("p = ~m = " + p);

    }
}
