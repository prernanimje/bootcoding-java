package classWork;

public class SuperKeyword {
    int a;
    void setA(int n1){
        a=n1;
    }
    void show(){
        System.out.println("A=" + a);
    }
}
class B extends SuperKeyword{
    void setB(int n1,int n2){
        super.a=n1;
        a=n2;
    }
    void show(){
        super.show();
        System.out.println("B="+ a);
    }
}
class Demo{
    public static void main(String[] args) {
        B b1= new B();
        b1.setA(100);
        b1.setB(10,20);
        b1.show();
    }
}
