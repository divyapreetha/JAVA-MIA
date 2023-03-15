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
