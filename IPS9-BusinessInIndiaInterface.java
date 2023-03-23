/*
Program Objective:
Imagine you have completed your graduation and you have a business idea. Your dad is also ready to invest money in your business. So, what’s the next step? You just have to check the legal requirements to start a business in India and register your business. The most important legal requirements for starting a startup in India are: 
1.	Company Name
2.	Submitting the Essential Documents
3.	GST Registration
4.	Specialized Licenses – FSSAI or IEC or Halal or Kasher
Come! Let’s satisfy these requirements and start our business soon.
Description:
Step 1: Create an interface named “LegalRequirements”
Step 2: You are supposed to create separate methods for each legal requirement. However, to save time, just declare a method only for the first legal requirement
1. setCompanyName(String companyName) 
Step 3: Close the interface
Step 4: Create a class named “SoloBusiness” and implement the interface named “LegalRequirements”
Step 5: Define the logic for the method setCompanyName(String companyName) – Print your company name
Step 6: Create a new method and define the logic (this method is specific only to this business) – void warehouse() – Print “Steel products”
Step 7: Close this class named “SoloBusiness”
Step 8: Create a class named “PartnershipBusiness” and implement the interface named “LegalRequirements”
Step 9: Define the logic for the method setCompanyName(String companyName) – Print your company name. In the next line, print “Arunprasad is my partner”
Step 10: Create a new method and define the logic (this method is specific only to this business) – void licenseDetails() – Print “Authorized Dealer for Rayban”
Step 11: Close this class named “PartnershipBusiness”
Step 12: Next, create a class named “Main”
Step 13: Create the main() method
Step 14: Use the Scanner class to get the following inputs – soloCompanyName, partnershipCompanyName from the user
Step 15: Create an object for your class named “SoloBusiness”
Step 16: Using that object, call all the two methods one by one and print all the details
Step 17: Create an object for your class named “PartnershipBusiness”
Step 18: Using that object, call all the two methods one by one and print all the details
Note: Since both the companies are in totally different fields, we have used interface; because they don’t have anything in common. These two companies just have to follow the legal requirements.
However, assume if both the companies are franchises of A2B, they will have several functionalities in common, and some functionalities in their own choice. In such a scenario, we use abstract classes instead of interface.
Input Format:
Sachin Enterprises
Sujeeth Sunglasses
Output Format:
Sachin Enterprises
Steel Products
Sujeeth Sunglasses
Arunprasad is my partner
Authorized Dealer for Rayban
*/

import java.util.*;
interface LegalRequirements {
    void setCompanyName(String companyName);
}
class SoloBusiness implements LegalRequirements {
    public void setCompanyName(String companyName) {
        System.out.println(companyName);
    }
    public void warehouse() {
        System.out.println("Steel Products");
    }
}
class PartnershipBusiness implements LegalRequirements {
    public void setCompanyName(String companyName) {
        System.out.println(companyName);
        System.out.println("Arunprasad is my partner");
    }
    public void licenseDetails() {
        System.out.println("Authorized Dealer for Rayban");
    }
}
public class IPS9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String companyName = scan.nextLine();
        String nextCompanyName = scan.nextLine();
        
        SoloBusiness sachin = new SoloBusiness();
        sachin.setCompanyName(companyName);
        sachin.warehouse();

        PartnershipBusiness arun = new PartnershipBusiness();
        arun.setCompanyName(nextCompanyName);
        arun.licenseDetails();
        scan.close();
    }
}
