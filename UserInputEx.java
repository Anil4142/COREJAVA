import java.util.Scanner;
    //Example for user input 
public class UserInputEx {

    public static void main (String[]ar){

        Scanner obj = new Scanner(System.in); // Scanner is a predifinied class.
        String name;
        long phone;

        String address;

        System.out.print("enter name:");
         name = obj.nextLine();
        
        System.out.println("enter phone:");
         phone = obj.nextLong();
        System.out.println("enter Address:");
         address = obj.nextLine();

         obj.close();

         System.out.println("\n--- User Information ---");
         System.out.println("Name: " + name);
         System.out.println("Phone: " + phone);
         System.out.println("Address: " + address);
    }
    
}
