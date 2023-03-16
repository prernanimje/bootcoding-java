package classWork;

import org.w3c.dom.ls.LSOutput;

public class FineClass {

}
final class Class extends FineClass{
    int a=10;
    void show(){
        System.out.println(a);
    }
}
/*class Show extends Class{
    //we cannot inherit final class
}*/
class Demo1{
    public static void main(String[] args) {
        Class c1= new Class();
        c1.show();
    }
}
