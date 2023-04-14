import java.util.*;

class ClassH1 
{
    public void dispH1(String s)
    {
        System.out.println("disp() method of ClassH1 - " + s);
    }
}
class ClassH2 extends ClassH1 
{
    public void dispH2(String s)
    {
        System.out.println("disp() method of ClassH2 - " + s);
    }
}
class ClassH3 extends ClassH1
{
    public void dispH3(String s)
    {
        System.out.println("disp() method of ClassH3 - " + s);
    }
}
class ClassH4 extends ClassH1
{
    public void dispH4(String s)
    {
        System.out.println("disp() method of ClassH4 - " + s);
    }
}
public class Hierarchical 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        String s3 = scan.nextLine();
        String s4 = scan.nextLine();
        //Assigning ClassH2 object to ClassH2 reference
        ClassH2 h2 = new ClassH2();
        //call dispH2() method of ClassH2
        h2.dispH2(s2);
        //call dispH1() method of ClassH1
        h2.dispH1(s1);
        
        
        //Assigning ClassH3 object to ClassH3 reference
        ClassH3 h3 = new ClassH3();
        //call dispH3() method of ClassH3
        h3.dispH3(s3);
        //call dispH1() method of ClassH1
        h3.dispH1(s1);
        
        //Assigning ClassH4 object to ClassH4 reference
        ClassH4 h4 = new ClassH4();
        //call dispH4() method of ClassH4
        h4.dispH4(s4);
        //call dispH1() method of ClassH1
        h4.dispH1(s1);
        scan.close();
    }
}
