public class Demo_Constructor{
  int id;
    String name;
/* 
   Demo_Constructor(){
        //System.out.println(id+" "+name);
    }
        */

public static void main(String[] args) {
    Demo_Constructor cp = new Demo_Constructor();
  System.out.println(cp.id);
  System.out.println(cp.name);
   
  }
}
// constructor --> is used to allocate the memory to the variables in the class.
// constructor name should be as same as the class name.
// constructor dosen't have return type.
// java automatically have one default constructor or implicit constructor.
// The default constructor is used to provide default values to the object like 0, null etc , like depending on the type.