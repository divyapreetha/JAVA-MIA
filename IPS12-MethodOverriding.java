/*
 * Family Tree

 Method Overriding in Java

 If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.

 Rules for Java Method Overriding
1.	The method must have the same name as in the parent class
2.	The method must have the same parameter as in the parent class.

Program Objective:

Come let’s learn the concept of method overriding with the help of a Family Tree.
We all know about the Legend Saravana family. Saravanan Arul is a successful Indian businessman. He is none other than the owner of popular shopping stores The Legend Saravana, Saravana Selvarathinam, and The Legend New Saravana Stores. His father is a legendary businessman Saravana Selvarathinam and his mother is a nurse. His acting debut with The Legend movie directed by Jerry and Joseph D Sami. Disney+ Hotstar bagged the streaming rights for this film. The trial look for his second movie went viral on social media.
Eventhough the father Selvarathinam focused only on their sales business, the Legend Arul focused also on acting in advertisements and movies, in addition to managing their business. Let’s implement this with Java’s method overriding.

Description:

Step 1: Create a class named “Saravanas”. This class is for describing the details of the founder Saravana Selvarathinam.

Step 2: Create a new method location(). This method must print 
“I live in Chennai”

Step 3: Next, let’s create a method personalDetails(). This method must print 
“Founder of Saravana Stores”

Step 4: Create a class named “Legend”, that extends the class Saravanas. This class is for describing the details of his son, Legend Arul.

Step 5: Next, let’s create a method personalDetails(). This method must print 
“Legendary Actor! Social Media Sensation”
We have created the personalDetails() method to print the occupation details of a person. Eventhough, both Saravana and Arul belong to the same family, they have rights to do different professions based on their personal interest. 

Step 6: Create a class named “Main”

Step 7: Create the main() method

Step 8: Use the Scanner class to get the following inputs – welcome (String)(This is a random text)

Step 9: Print this string welcome. 

Step 10: Create an object for the class Saravanas.

Step 11: Call the location() method and personalDetails() methods using this object. This will print the location and occupation details of the father Saravana Selvarathinam.

Step 12: Create an object for the class Legend.

Step 13: Call the location() method and personalDetails() methods using this object. This will print the location and occupation details of the son Legend Arul.

Step 14: The son’s Legend class has not defined any logic for the location() method. So, the logic for location() method defined in the parent Saravanas class gets called. It is common for a child to live in his father’s house till he builds his own house. The same thing happened here.

Step 15: The son’s Legend class has defined a new logic for the personalDetails() method. So, the logic for personalDetails () method defined in the child Legend class gets called. Eventhough a son has all the rights over his father’s property, the son has all the rights to choose his own career and make his own personal choices. The same thing happened here.

Step 16: Close the main() method and the Main class.

Note: Getting the occupation details is a single function; but the occupation of a parent and a son can differ based on their personal choice. This choice of printing either the parent’s occupation or the child’s occupation happens at run-time. If the parent’s object calls the personalDetails() function, the parent’s occupation gets printed. If the child’s object calls the personalDetails() function, the child’s occupation gets printed. Hence, we have used “method overriding”.

Input Format:

Family Tree

Output Format:

Family Tree
I live in Chennai
Founder of Saravana Stores
I live in Chennai
Legendary Actor! Social Media Sensation

 * 
 */
import java.util.*;

class Saravanas {
    void location() {
        System.out.println("I live in Chennai");
    }

    void personalDetails() {
        System.out.println("Founder of Saravana Stores");
    }
}

class Legend extends Saravanas {
    void personalDetails() {
        System.out.println("Legendary Actor! Social Media Sensation");
    }
}
public class IPS12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(s);
        Saravanas annachi = new Saravanas();
        annachi.location();
        annachi.personalDetails();
        Legend arul = new Legend();
        arul.location();
        arul.personalDetails();
        scan.close();
    }
}
