package classWork;

public class overloading {
    //hence it will complie because it has same parathethis and have same datatype inside it.
    void showA(int a1,int b1) {
        System.out.println(a1);
    }
}
class Student1 extends overloading{
    void showA(int c1,int d1){
        System.out.println(d1);
    }
}

class demo8{
    public static void main(String[] args) {
        Student1 s= new Student1();
        s.showA(100,500);
        overloading over = new overloading();
        over.showA(62,14);
    }
}