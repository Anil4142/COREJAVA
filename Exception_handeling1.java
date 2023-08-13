public class Exception_handeling1 {
    public static void main(String[] args) {
        System.out.println("program execution Start");
        int a=20;
        int b =0;
     

        //try is mandatory block
          //type of exception variable
       try{
           int result = a/b;
         System.out.println(result);
       }
           
      catch (ArithmeticException e) {
      
        System.out.println(e.toString());
       }
       //finally is optional block 
       //We can't use finally block as single, its mandatory to use try block before finally.
       finally{
        System.out.println("hd");
       }

        System.out.println("program execution is stoped");

    }
    }

