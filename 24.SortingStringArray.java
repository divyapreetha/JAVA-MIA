
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
       
        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }
        Arrays.sort(names);
        System.out.println("After Sorting in Alphabetical Order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
