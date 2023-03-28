package classWork;

public class SingleLevelInheritance {
    void show(){
        System.out.println("Students");
    }
    void show1(){
        System.out.println("teacher");
    }
}
class Teachers extends SingleLevelInheritance{
    void show(){
        System.out.println("I am teacher");
    }
}
class school{
    public static void main(String[] args) {
        Teachers t= new Teachers();
        t.show1();
    }
}
