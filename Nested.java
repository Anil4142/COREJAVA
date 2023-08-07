public class Nested{
 
    public static void main (String...args){

         // Here we will take 3 int Values as variables

         int num = 4, num1 =8, num2 =0;

         // nestedif

         if(num<8)// If condition 1 true it will perform cond 2 or if it is false  then it will perform false block that means cond 3
         {
            if(num1<=num) // condtion 2 ---> True block
            {

                System.out.println("num is less");

            }
            else{
                System.out.println("or grater");

            }
         }
         else{
         if(num>num2) //condition 3------> false block
         {

            System.out.println("num is grater");

         }
         else{

            System.out.println("or num2 is grater");

         }
         }

         // statement x;
    }
}