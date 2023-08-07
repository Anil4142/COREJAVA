abstract class Animal{
    // Abstract methods 
    public abstract void dogs();

    //Redugar method
    public void  pets(){
        System.out.println("cat");
    }
}
class Animal_Names extends Animal{

    public  void dogs(){
        //The body of the dogs (abstract method ) is provided here 
        System.out.println("Lot of breads");
    }

}


public class AbstractEx {
    public static void main(String...args){
        Animal_Names myobj = new Animal_Names();
        myobj.dogs();
        myobj.pets();
    }
    
}
