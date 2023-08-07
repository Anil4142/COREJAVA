public class Even {
   
    public static void main(String...args){
   String evenNumber="";
        for(int i=0; i<=40;i++){
            if(i%2==0){

                evenNumber+=i+" \n";

            }
        }
        System.out.println("The even numbers are:");
        System.out.println(evenNumber);
    }
}
