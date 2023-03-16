package classWork;

public class FineMethod {
    final void show(){
        int a=100;
        System.out.println(a);
    }
}
class Method extends FineMethod{
    /*void show(){// We cannot inherit final method if we do that than we get error we cannot override it
        int b=0;
        System.out.println(b);
    }*/
    void show1(){
        String a="prerna";
        System.out.println(a);
    }
}
class demo2{
    public static void main(String[] args) {
       Method m1= new Method();
       m1.show();
       m1.show1();
    }
}
