import java.util.*;

class Electronics {
    public Electronics(){
        System.out.println("Class Electronics");
    }
    public void deviceType(String s) {
        System.out.println(s);
        System.out.println("Device Type: Electronics");
        
    }
}
class Grinder extends Electronics {
    public Grinder() {
        System.out.println("Class Grinder");
    }
    public void category(String s) {
        System.out.println(s);
        System.out.println("Category - Grinder");
        
    }
}
class WetGrinder extends Grinder {
    public WetGrinder() {
        System.out.println("Class WetGrinder");
    }
    public void grinding_tech(String s) {
        System.out.println(s);
        System.out.println("Grinding Technology- WetGrinder");
        
    }
}
public class Multilevel {
    public static void main(String[] arguments) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        String s3 = scan.nextLine();
        WetGrinder wt= new WetGrinder();
        wt.deviceType(s1);
        wt.category(s2);
        wt.grinding_tech(s3);
        scan.close();
    }
}
