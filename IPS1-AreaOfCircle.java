//Java program to find the area of circle

import java.util.*;
class Main{
    public static void main(String[] args) {
        double radius, area;
        Scanner scan = new Scanner(System.in);
        radius = scan.nextDouble();
        area = (Math.PI) * (Math.pow(radius,2));
        System.out.println(area);
    }
}
