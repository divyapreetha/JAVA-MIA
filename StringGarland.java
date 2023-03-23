import java.io.*;
import java.util.Scanner;

class StringGarland {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
        String str= scan.next(); 
        String garland="";
		char ch;
		
	System.out.print("Original word: ");
	System.out.println(str); //Example word
		
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); //extracts each character
        
        if(Character.isLetter(ch)) { //Check if the character is an alphabet
            garland = garland + ch;
        }
        if(Character.isDigit(ch)){ //Check if the character is a digit
            int count = Character.getNumericValue(ch);
            String temp = garland;
            for(int j = 1; j <= count; j++) {
                StringBuilder input1 = new StringBuilder();
  
                // append a string into StringBuilder input1
                input1.append(temp);
        
                // reverse StringBuilder input1
                input1.reverse();
                garland = garland + input1;
                temp = input1.toString();
            }
            
        }

        //garland= ch+garland; //adds each character in front of the existing string
	}
	System.out.println("String Garland is: "+ garland);
    scan.close();
	}
}


