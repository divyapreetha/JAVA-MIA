//Debugging Question
/*
Debug the errors in the following code snippet

import java.util.*;
class Main {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int x = scan.nextInt();
int ans = (2 (+5 -8) (+5 -5) + 10) * 2 + x;
System.out.println(ans);
}
}


Test Case
Input Format
1
Output Format
19


*/
import java.util.*;
public class Float {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int ans = (2 + (5 -8) + (5 -5) + 10 ) * 2 + x;
        System.out.println(ans);
        scan.close();
    }
}
