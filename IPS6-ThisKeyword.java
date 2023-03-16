/*
Program Objective:
Imagine your favorite game in mind. Write a Java program to print the name of your game, your level in that game, and your global rank in the game.
Directions:
1. Create a new class
2. Declare three instance variables – gameName, playerLevel and playerRank.
3. Create a parameterized constructor to initialize the gameName. 
4. Create a new method - getPlayerStats() - use this method to initialize the value of playerLevel and playerRank. These values must be passed as arguments and then assigned to the instance variables using the this keyword.
5. Create a new method - printStats() - use this method to print the gameName, playerLevel and playerRank.
6. Now, let's write the main() method
7. Create an object. Get the gameName from user on command-line and then pass this value as an argument during object creation.
8. Get the playerLevel and playerRank as input from user and use them as arguments to call the getPlayerStats() method
9. Use printStats() method and print the gameName, playerLevel and playerRank.
10. Print the details in the following format
Input Format
Clash of Clans
9
2000
Output Format
Game: Clash of Clans
Player Level: 9     
Global Rank: 2000


*/
import java.util.Scanner;

public class ThisKeyword {
    String game;
    int level;
    int rank;

    ThisKeyword(String game) {
        this.game = game;
    }

    void getPlayerStats(int level, int rank) {
        this.level = level;
        this.rank = rank;
    }

    void printStats() {
        System.out.println("Game: " + this.game);
        System.out.println("Player Level: " + this.level);
        System.out.println("Global Rank: " + this.rank);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        ThisKeyword obj = new ThisKeyword(name);
        int level = scan.nextInt();
        int rank = scan.nextInt();
        obj.getPlayerStats(level,rank);
        obj.printStats();
        scan.close();
    }
}
