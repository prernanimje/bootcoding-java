package classWork;

public class InheritanceMoreClass
    // This code is invalid as class cannot inherit more than one class it will extents the class only once.
{
    void show(){
        System.out.println("I am in show");
    }
}
class A
{
  void showA(){
      System.out.println("i am in A");
  }
}
/*class B extends InheritanceMoreClass,A{
     System.out.println("I am in C");
}*/
class hello extends A{
    void showB(){
        System.out.println("I am in B");
    }
}
class Demo5{
    public static void main(String[] args) {
        hello h1= new hello();
        h1.showB();
    }
}