/*
 *Sorting a String Array in Alphabetical Order
The String class defines a number of methods that allow us to accomplish a variety of string manipulation tasks. In this program, use the compareTo() function to sort an array of alphabets in alphabetical order.

Syntax:
s1.compareTo(s2)

This method returns negative if s1<s2, returns positive if s1>s2, and zero if s1 is equal to s2.

Program Objective:
Use this compareTo() method to get an array of exactly 5 names from the user and sort them in Ascending order.

Input Format

Sharan
Harshini
Mounica
Himani
Viswesh

Output Format

After Sorting in Alphabetical Order:
Harshini
Himani
Mounica
Sharan
Viswesh

 * 
 */

import java.util.*;

public class Alphabet {

    public static void main(String[] args) {
        String name[] = new String[5];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i<5; i++) {
            name[i] = scan.nextLine();
        }
        int size = name.length;
        String temp = null;
        for(int x = 0; x < size; x++) {
            for(int y = x+1; y < size; y++) {
                if(name[y].compareTo(name[x]) < 0 ) {
                    //Swap the strings
                    temp = name[x];
                    name[x] = name[y];
                    name[y] = temp;
                }
            }
        }

        System.out.println("After Sorting in Alphabetical Order:");

        for(int j = 0; j < size; j++) {
            System.out.println(name[j]);
        }
        scan.close();
    }
}
