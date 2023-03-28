package classWork;

public class HierarchicalInheritance {
    void show(){
        System.out.println("pen");
    }
}
class gel extends HierarchicalInheritance {
    void show1(){
        System.out.println("Gel pen");
    }
}
class Ink extends HierarchicalInheritance {
    void show2(){
        System.out.println("Ink pen");
    }
}
class pen {
    public static void main(String[] args) {
        gel g= new gel();
        g.show();
    }
}