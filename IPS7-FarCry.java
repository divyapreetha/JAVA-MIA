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
