/*
Leetcode 1957: Delete Characters to Make Fancy String

A fancy string is a string where no three consecutive characters are equal.

Given a string s, delete the minimum possible number of characters from s to make it fancy.

Return the final string after the deletion. It can be shown that the answer will always be unique.

 

Example 1:

Input: s = "leeetcode"
Output: "leetcode"
Explanation:
Remove an 'e' from the first group of 'e's to create "leetcode".
No three consecutive characters are equal, so return "leetcode".
Example 2:

Input: s = "aaabaaaa"
Output: "aabaa"
Explanation:
Remove an 'a' from the first group of 'a's to create "aabaaaa".
Remove two 'a's from the second group of 'a's to create "aabaa".
No three consecutive characters are equal, so return "aabaa".
Example 3:

Input: s = "aab"
Output: "aab"
Explanation: No three consecutive characters are equal, so return "aab".



*/

//JAIDEEP's code
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        String input = get.nextLine();
        StringBuffer mod = new StringBuffer(input);
        int count = 1;
        for (int i = 1; i < mod.length(); i++) {
            if (mod.charAt(i) == mod.charAt(i - 1)) {
                count++;
                if (count > 2)
                    mod.deleteCharAt(i--);
            } else
                count = 1;
        }
        System.out.println(mod);
    }
}


//Solution II
class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        for (char c : s.toCharArray()) {
            int n = ans.length();
            if (n > 1 && ans.charAt(n - 1) == c && ans.charAt(n - 2) == c) {
                continue;
            }
            ans.append(c);
        }
        return ans.toString();
    }
}
