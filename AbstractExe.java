abstract class Flipkart{
    abstract void  register();
    abstract void  login();

}
  class Flip extends Flipkart{

    void register(){
        System.out.println("Register by giving details");
    }

    void login(){
        System.out.println("Login Here");
    }

}


public class AbstractExe {
    public static void main(String[] args) {
    Flip myobj = new Flip();
    myobj.register();
    }
    
}
