//Java program to find volume of a sphere
//Volume of a sphere = (4/3)πr^3

//Import the necessary packages
import java.util.*;

import javax.xml.transform.Result;

//Create a new class
public class Volume {
    //Create a main() method
    public static void main(String[] args) {
        int radius;
        double volume;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of your sphere: ");
        radius = scan.nextInt();
        volume = (4/3) * (Math.PI) * Math.pow(radius, 3);
        int answer = (int)volume;
        System.out.println("Typecasted volume is " + answer);

    }
}
