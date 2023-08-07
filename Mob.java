

// Inheritance ===> The Process of accurring Properties from parent class to child class.
// Here we Inherited the  class Mobiles with New_Mobiles with extends keyword,
//and New_Mobiles with Child_Mobiles
public class Mob {

    public static void main (String[]args){

  
   Child_Mobile myobj = new Child_Mobile();
  // New_Mobiles myobj2 = new New_Mobiles();
myobj.lenovo();
        myobj.poco();
        myobj.oppo();
      }
    
}


class Mobiles{

    void oppo(){
String model;
model="A83";
        System.out.println("The Oppo Mobile Model:" + model);
    }

}
class New_Mobiles extends Mobiles{

    public void poco() {
        String model = "AZ series";
        long IME_Num = 548524652;
        System.out.println("The Model Of Poco : "+ model);
        System.out.println("The IME Number Of Poco : "+ IME_Num);
        //return poco();
    }
}
class Child_Mobile extends New_Mobiles{

    void lenovo(){
        String model = "X series";
        int two_digit_num = 25;
        System.out.println("The Model Of lenovo: "+ model);
        System.out.println("The two digit num: "+ two_digit_num);

    }

}