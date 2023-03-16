/*
Buckle up kids! Let’s time travel back to the Dark Ages. Voila! 
We have landed in an ancient barracks and all we can see are swords of various category – Needle (sword used by Arya Stark), Dragonglass Weaponry, Littlefinger’s Dagger, Heartsbane, Longclaw, Widow’s Wail, Oathkeeper, etc.
Let’s pick two swords from this deck and have a tournament. 
•	Create a new class.
•	Declare the following variables: swordName (String), piercingDamage (Integer), slashingDamage (Integer), playerXP (Integer)
•	Create a constructor for the class; pass the sword’s name as an argument to this constructor. Initialize the sword name within this constructor.
•	Create a new method startTheGame(). This method should print “START” once the game begins
•	Create a new method named setWeaponFeatures() to define the specifications of each sword – (1) piercingDamage is the number of XPs that will be lost from the enemy’s life once the player calls the attack() method [Set it between 5 to 20]. (2) slashingDamage is the number of XPs that will be lost from the attacker’s life once the player calls the parry() method [Set it between 5 to 10]. (3) playerXP is the maximum life of a player [Set it between 50 to 100]
•	Create a method called attack(). This method is used whenever a player wants to attack their opponent. This method should print “Player Attacked Using: swordName” whenever a player calls this method
•	Create a method called parry(). This method is used whenever a player wants to defend themselves from the opponent’s attack. This method should print “Enemy Parried Using: swordName” whenever a player calls this method
•	Create a method called endTheGame(). This method should print “GAME OVER” whenever a player calls this method
•	Create a method called gameSummary(). This method should print “Sword Name: swordName \n Piercing Damage: piercingDamage \n Slashing Damage: slashingDamage \n Player XP: playerXP” whenever a player calls this method
•	Create a main() method. Get two sword names as input from the user (String)
•	Now, create two objects of this class named “player1” and “player2” – one for each player
•	Start the game by calling the method startTheGame()
•	Now, define the specification of each player and sword by calling the setWeaponFeatures() twice – first time using the object “player1” and second time using the object “player2”. 
•	Let the player1 perform an attack by calling the attack() method
•	Since player1 has performed an attack, reduce the life of player2 using the formula “playerXP = playerXP - piercingDamage”
•	Player1 has performed an attack; now player2 will try to defend it. Perform it by calling the parry() method using the player2 object
•	Player2’s parrying has reduced the life of player1 little bit. Recalculate the new life of player1 using the formula “playerXP = playerXP - slashingDamage”
•	End the game by calling the function endTheGame()
•	Print “***SUMMARY***” on the screen
•	Now, display the final points of both players by calling the gameSummary() method twice – first time using the object “player1” and second time using the object “player2”.
•	Now, use an if..else statement to check whether player1’s playerXP is higher or player2’s playerXP is higher. 
•	If the winner is player1, print “WINNER: player1.swordName”
•	Else if the winner is player2, print “WINNER: player2.swordName”
    
Input Format
Dagger
Valyrian
20
10
100
15
5
100

Output Format
START
Player Attacked Using: Dagger
Enemy Parried Using: Valyrian
GAME OVER
***SUMMARY***
Sword Name : Dagger
Piercing Damage : 20
Slashing Damage : 10
Player XP : 95
Sword Name : Valyrian
Piercing Damage : 15
Slashing Damage : 5
Player XP : 80
WINNER : Dagger

*/
import java.util.*;
public class SwordGame {
    public String swordName;
    public byte piercingDamage;
    public byte slashingDamage;
    public short playerXP;

    public SwordGame(String name) {
        swordName = name;
    }

    public void startTheGame() {
        System.out.println("START");
    }

    public void setWeaponFeatures() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the piercing damage caused by your sword " + swordName);
        piercingDamage = sc.nextByte();
        System.out.println("Enter the slashing damage caused by your sword " + swordName);
        slashingDamage = sc.nextByte();
        System.out.println("Enter the max life of the player having sword " + swordName);
        playerXP = sc.nextByte();
        
    }

    public void attack() {
        System.out.println("Player Attacked Using: " + swordName);
    }

    public void parry() {
        System.out.println("Enemy Parried Using: " + swordName);
    }

    public void endTheGame() {
        System.out.println("GAME OVER");
    }

    public void gameSummary() {
        System.out.println("Sword Name : " + swordName);
        System.out.println("Piercing Damage : " + piercingDamage);
        System.out.println("Slashing Damage : " + slashingDamage);
        System.out.println("Player XP : " + playerXP);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of your Sword 1");
        String name1 = scan.next();
        System.out.println("Enter the name of your Sword 2");
        String name2 = scan.next();
        SwordGame player1 = new SwordGame(name1);
        SwordGame player2 = new SwordGame(name2);
        player1.startTheGame();

        player1.setWeaponFeatures();
        player2.setWeaponFeatures();

        player1.attack();
        player2.playerXP -=  player1.piercingDamage;

        player2.parry();
        player1.playerXP -= player2.slashingDamage;
        
        player2.endTheGame();

        System.out.println("***SUMMARY***");
        player1.gameSummary();
        player2.gameSummary();

        if(player1.playerXP > player2.playerXP) {
            System.out.println("WINNER : " + player1.swordName);
        }
        else {
            System.out.println("WINNER : " + player2.swordName);
        }
        scan.close();
    }
}
