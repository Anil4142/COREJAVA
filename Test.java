

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
            
            String name;
            String name2;
            System.out.println("kitchen");
           // System.out.println("name");
            name = "pan";
            System.out.println(name);
            name2 = "glass";
            System.out.println(name2);

        }

    }
    
  class Test{
    public static void main(String[]args 
    ){

        
        Fp_Woman obj2 = new  Fp_Woman();
        obj2.kitchen();
        
    }

    }