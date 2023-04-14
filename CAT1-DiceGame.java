import java.util.*;
public class DiceGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int scoreA = 0;
        int scoreB = 0;
        int gameCount = 0;
        int maxScore = scan.nextInt();
        System.out.println("Let us start the game");
        while(true) {
            gameCount++;
            System.out.println("Game number: " + gameCount);

            System.out.print("A's turn - ");
            int n = (int) (100 * Math.random()) % 6 + 1;
            scoreA += n;
            System.out.println("A's score: " + scoreA);

            System.out.print("B's turn - ");
            int m = (int) (100 * Math.random()) % 6 + 1;
            scoreB += m;
            System.out.println("B's score: " + scoreB);
            if ((scoreA >= maxScore) || (scoreB >= maxScore))
                break;
        }
        if(scoreA > scoreB) {
            System.out.println("A is the winner");
        }
        else if(scoreB > scoreA) {
            System.out.println("B is the winner");
        }
        else {
            System.out.println("It's a tie");
        }
        scan.close();
    }
}
