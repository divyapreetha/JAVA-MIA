import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //%s is used for string so,
                //%-15s --> is used for -15 spaces right side for string
                //%03 --> used for 3 spaces left side for int with starting 0
                System.out.printf("%-15s%03d%n",s1,x);
            }
            System.out.println("================================");

    }
}



