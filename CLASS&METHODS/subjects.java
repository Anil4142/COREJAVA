public class subjects {// class
    public static void main (String [] args){// main method
        System.out.println("MPC");
        subjects subject=new subjects();// reference
        subject.mathSub();
        subject.physics();
        subject.chemistry();
    }
    public void mathSub(){// methods
        System.out.println("Maths");
    }
    public void physics(){
        System.out.println("Physics");
    }
    public void chemistry(){
        System.out.println("hemistry");
    }
}
