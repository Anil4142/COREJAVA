package OOPS;

public class inherit {
    
    int a = 20;


    public void inher() {
        System.out.println("fhf");
    }

    
}
 class Inh extends inherit{

    double b =0.25;

    public void inher(){
        System.out.println("The int value a is " + a );
        System.out.println("The double value b is " + b );
    }

}
class Inheritance{
    public static void main(String[]ar){
        Inh obj = new Inh();
        obj.inher();
        System.out.println(obj.a);
    }
}
