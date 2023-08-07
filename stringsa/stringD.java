package stringsa;
public class stringD {

    public static void main (String[]args){

        String firstName="ANIL";

        String lastName="YERRA";

        String fullName=firstName + lastName; // String concatination.

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(fullName);

        fullName= firstName+" "+lastName; // giving space to the name.
        System.out.println(fullName);

        String prefix="Mr.";

        fullName= prefix +" "+ firstName+ " "+lastName;
        System.out.println(fullName);
    
   }

    
}