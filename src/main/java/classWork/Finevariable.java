package classWork;

public class Finevariable {

    void show() {
        final int a = 10;// we cannot change value of final variable
        int b = a + 20;// we can use final variable
        System.out.println(a);
        System.out.println(b);
    }
}
class Variable extends Finevariable {
    final int b = 2;

    void show() {
        int c = b + 65;
        System.out.println(c);
    }
}
   class Demo {
       public static void main(String[] args) {
           Variable v1= new Variable();
           v1.show();
       }
   }

