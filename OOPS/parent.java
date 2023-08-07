package OOPS;

class Parent
{
int x1=50;
public void display()
{
System.out.println("this is display() of parent class");
}
}
class Child extends Parent
{
int y1=100;

public void test()
{
System.out.println("this is test() method of childclass");
  }
}

class SimpleInheritance
{
public static void main(String[] args)
{
Child c1=new Child();
c1.display();
System.out.println("Value of x1 = "+c1.x1);
c1.test();
System.out.println("Value of y1 = "+c1.y1);
 }
}