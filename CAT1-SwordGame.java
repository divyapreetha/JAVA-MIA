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
