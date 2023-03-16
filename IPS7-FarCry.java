/*
Program Objective:
It is the beginning of 2004’s Far Cry. A ferryman named Jack Carver is hired by Valerie Constantine to transport her to a group of islands in Micronesia. After reaching the island, Valerie speeds off on her jet ski. Meanwhile, Jack’s boat was destroyed by a rocket, forcing him to swim to the shore.
Jack stumbles upon a radio and receives transmission from a man named Doyle, who helps Jack navigate through his surroundings. Under Doyle’s instructions, Carver goes looking for Valerie, who has been captured by Crowe’s men. On his way, Jack is supposed to fight with mutated creatures named TriGen. Only after killing all those trigens, Jack can eventually reach the helipad where Valerie stands.
Your objective is to use to concept of Java Recursion to fight all the trigens and rescue Valerie.
Directions:
1. Create a new class
2. Declare an instance variable – genLife (int).
3. Create a new method - searchForValerie() – This method should have an argument – the total number of trigens that are found in Crowe’s laboratory. Use a for loop within this method to kill the trigens one-by-one.
4. Logic for the for loop: (a) For each trigen, initialize genLife = 100. (b) Call the killTrigen() method to kill that trigen. (c) Print “KILLED TRIGEN 1” 
5. Outside the for loop, once all the trigens are killed, print “RESCUED VALERIE! MISSION PASS!!!” Now, close this method searchForValerie()
6. Create a new static method - killTrigen() – this method should have two arguments – first argument is the number of trigen that Jack is killing now (first trigen or second trigen or etc.) (use the ‘i’ value of the for loop to get it). The second argument is the life of that particular trigen. Use this method to kill the trigen recursively.
7. Logic of killTrigen() method: if the trigen’s life is less than or equal to 0, it should return out of the method. Else, do the following – (i) Print “Life of Trigen 1 is now 100” (ii) Reduce the trigen’s life by 25. (iii) Call the killTrigen() method with the updated life value.
8. Now, let’s write logic for the main() method. Use Scanner class to get the total number of trigens from the user. Create an object for your class and call the searchForValerie() method.
Input Format
2
Output Format
Life of TriGen 1 is now 100
Life of TriGen 1 is now 75    
Life of TriGen 1 is now 50      
Life of TriGen 1 is now 25      
KILLED TRIGEN 1
Life of TriGen 2 is now 100 
Life of TriGen 2 is now 75    
Life of TriGen 2 is now 50      
Life of TriGen 2 is now 25      
KILLED TRIGEN 2
RESCUED VALERIE! MISSION PASS!!!


*/
import java.util.*;
public class FarCry{
    int genLife;

    public void searchForValerie(int n){
        for(int i = 1; i<= n; i++){
            genLife = 100;
            killTrigen(i, genLife);
            System.out.println("KILLED TRIGEN " + i );
        }
        System.out.println("RESCUED VALERIE! MISSION PASS!!!");
    }

    public static void killTrigen(int genNumber, int life) {
        if(life <= 0)
            return;
        else 
            System.out.println("Life of TriGen " + genNumber + " is now " + life);
            life = life - 25;
            killTrigen(genNumber, life);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of trigens: ");
        int n = scan.nextInt();
        FarCry fc = new FarCry();
        fc.searchForValerie(n);
        scan.close();
    }
} 
