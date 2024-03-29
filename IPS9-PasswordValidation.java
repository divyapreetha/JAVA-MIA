/*
Program Objective:
You are now a junior Java developer in CTS. Your team is developing an application similar to the crypto marketplace “Binance”.  Since you are a junior developer, the task assigned to you is to design the “Sign-Up Page”. You know the format of a sign-up page! Every application will have a sign-up page. So, your Senior developer has already declared the basic elements that should be present in a sign-up page so that all the projects developed in CTS can follow that basic template, instead of wasting time rewriting and rethinking the requirements for a Sign-Up page. As a junior developer, follow his instructions; he expects you to fill the logic for each functionality he has mentioned (Hint: within an interface). 
Hint: The essential elements that should be present in a Sign-in page, as instructed by your CTS senior developer team are:
1.	Getting the user details – name, address, date of birth, username, password, mobile number, email address
2.	Check if the username exists already
3.	Check if the password is strong: A valid password must be a combination of 
a.	Minimum one lower-case letter
b.	Minimum one upper-case letter
c.	Minimum one number/digit
d.	Minimum one special character
e.	Minimum Password Length – 9
f.	Maximum Password Length – 25
 (Hint: You need to learn Regular Expression in order to do this)
4.	Integrating the Google-Sign Up Button
5.	A background image
6.	Checkbox for accepting the terms and conditions
Note: I have just included password checker in my test case. So, focus only on that. For the remaining functionalities, you can just use print() statement.
Input Format 1:
Java$CSE1018
Output Format 1:
Name
Mobile Number
username
Valid Password
Sign Up
Input Format 2:
java123
Output Format 2:
Name
Mobile Number
username
Invalid Password
Sign Up
*/


import java.util.*;
import java.util.regex.*;
interface SeniorDeveloper {
    public void userDetails();
    public void passwordCheck(String password);
    public void button();
}
class JuniorDeveloper implements SeniorDeveloper {
    public void userDetails() {
        System.out.println("Name");
        System.out.println("Mobile Number");
        System.out.println("username");
    }

    public void passwordCheck(String password) {
        // Regex to check valid password.
        // Minimum one number should be present -  (?=.*[0-9]) 
        // ?= -> Anywhere in my input string
        // . -> Atleast one
        // * -> 0 or 1 occurence of the value
        // \\d -> digit [You can also write [0-9]]
        String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{9,25}$";
 
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
 
        // Pattern class contains matcher() method
        // to find matching between given password
        // and regular expression.
        Matcher m = p.matcher(password);
 
        // Return if the password
        // matched the ReGex
        if(m.matches() == true) {
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Invalid Password");

        }

    }
    public void button() {
        System.out.println("Sign Up");
    }
    
}
public class SignUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        JuniorDeveloper sign = new JuniorDeveloper();
        sign.userDetails();
        sign.passwordCheck(password);
        sign.button();
        scan.close();
    }
}
