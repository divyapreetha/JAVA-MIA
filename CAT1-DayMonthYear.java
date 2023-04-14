//Java program to convert a given number of days into years, weeks and days
import java.util.*;
public class DayMonthYear {
    public static void main(String[] args) {
        int n, day, week, year;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int total = n;
        year = n/365;
        n = n % 365;
        week = n / 7;
        day = n % 7;
        System.out.printf("%d has %d years, %d weeks, and %d days", total, year, week, day);
        scan.close();

    }
}
