package OOPS;

 class Fp_Men {
    
    public void login(){
        System.out.println("login");
    }


    public void  cloths(){

        System.out.println("cloths");
    }
}




    class Fp_Woman extends Fp_Men {

        public void kitchen(){
            System.out.println("kitchen");
        }

    }
    
  class Test{
    public static void main(String[]args
    ){

        
        Fp_Woman obj2 = new  Fp_Woman();
        obj2.kitchen();
    }

    }




    


 


