package classWork;

public class Constructor {
    Constructor(){
        System.out.println("Default in A");
    }
    Constructor(int n2){
        System.out.println("Parameterize in A");
    }
}
class C extends Constructor{
    C(){
        System.out.println("default in B");
    }
    C(int n2){
        super(n2);
        System.out.println("Parameterize in B");
    }
}
class demo1{
    public static void main(String[] args) {
        C c1=new C(100);
    }
}
