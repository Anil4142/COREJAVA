import java.util.Scanner;

public class Userinput {
    
    public static void main (String[]ar){

        Scanner scan = new Scanner(System.in);

        String name;
        long phone_number;
        String Address;
        double decimal;
        
       

        System.out.println("Entername :");
         name = scan.next();

         System.out.println("Enter phone number :");
         phone_number = scan.nextLong();

         System.err.println("Enter Address :");
         Address = scan.next();

         System.err.println("Enter decimal number :");
         decimal = scan.nextDouble();

         scan.close();


        System.err.println("Enter name:"+name);
        System.err.println("Enter phone number:"+phone_number);
        System.err.println("Enter Address:"+Address);
        System.err.println("Enter decimal:"+decimal);

    }
}

//Scanner  is a predifinied class which is used to get the userinput.
//It will found in the java.util package