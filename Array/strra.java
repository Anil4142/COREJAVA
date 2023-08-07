package Array;
public class strra {
    public static void main (String[]args){
        String[] cars= {"Ford","Tata", "Benz", "Audi","Nano"};

        System.out.println("Brand of Car:" + cars.length);
        


        for(int index=0; index<cars.length; index++)

        System.out.println(cars[index]);

        //System.out.println("Brand of Car:" + cars[0]+cars[1]+cars[2]+cars[3]+cars[4]+cars[5]+cars[6]);====> Error
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5 at strra.main(strra.java:13)


    }
}
