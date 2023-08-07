public class Override {
      
    int ani=25;
    public void over(){
        System.out.println("overthe");
    }

    public int ani(){
        System.out.println("The number"+ ani);
        return ani;
    }
    public static void main(String[]args){
    
        Ride myobj = new Ride();
        myobj.over();
        myobj.ani();
    }
}
 
class Ride extends Override{

   
    public void over(){
        System.out.println("overend");
    }
    public int ani (){

        System.out.println("The Numeric:"+ani);
  return ani;
    }
}

