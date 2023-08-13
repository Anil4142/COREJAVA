public class Exception_handeling {
    public static void main(String[] args) {
        System.out.println("program execution Start");
        int a=20;
        int b =0;
        int result = a/b;

        //try is mandatory block
       try{
         System.out.println(result);
       }
       //finally is optional block 
       //We can't use finally block as single, its mandatory to use try block before finally.
       finally{
        System.out.println("hd");
       }

        System.out.println("program execution is stoped");

    }
}
//Exception Handiling------> To take the control of the exceptions from java
                            //or//             
// Due to some problems if a program execution is stoped or terminated or disrapted then that problem is called as exception

//Types of Exceptions

            // checked Exceptions       (compile- time exception)
            // Unchecked Exceptions     (Runtime exception)

//Stacktrace
/*
 *Exception name -java.lang.ArithmeticException
 *Exception message - / by zero
 *which linenumber 
 *Methods Info

 */

