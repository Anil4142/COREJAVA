class Orders{
    String brands =" Levis";
    public void cloths(){
        System.out.println("The Cloth Brands");
    }

    public String brands(){
        System.out.println("The brands are:" +  brands);
        return brands;
    }
}

class Ord extends Orders{
    public void cloths( String brands){
        System.out.println("The cloths are brands");

    }
int num = 25;
    public int brands(int num){
     
        System.out.println("The Int");
        return num ;
    }
}

public class Overload {
       public static void main(String[]args){

        Ord myobj= new Ord();
        myobj.brands();
        myobj.cloths();
        //myobj.cloths(String );
        //myobj.brands(num);
       }
    
}
