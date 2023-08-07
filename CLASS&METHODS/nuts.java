public class nuts {
    public static void main (String[]args){
        nuts nut=new nuts();// referrence
        nut.almondNut();
         // calling a method//
        nut.groundNut();
    }
    public void groundNut(){ // Methods
        System.out.println("Cost is High and as compared to Almond low");
    }
    public void almondNut(){
        System.out.println("Cost is High");
    }
}
