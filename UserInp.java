import java.util.Scanner;

public class UserInp {
    
public static void main(String...args){

String name;
String address;
double decimal;
int num;
Scanner scan = new Scanner(System.in);

System.out.println("Enter the name:");
name = scan.next();

System.out.println("Enter the address:");
address = scan.next();

System.out.println("Enter the decimal:");
decimal = scan.nextDouble();

System.out.println("Enter the num:");
num = scan.nextInt();

scan.close();

System.out.println("Enter the name:"+ name);
System.out.println("Enter the address:"+ address);
System.out.println("Enter the decimal:"+ decimal);
System.out.println("Enter the num:"+ num);

}

}
