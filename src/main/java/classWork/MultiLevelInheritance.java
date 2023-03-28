package classWork;

public class MultiLevelInheritance {
    void set(){
        System.out.println("Hero");
    }
}
class location extends MultiLevelInheritance{
    void show(){
        System.out.println("makeup");
    }
}
class hint extends location{
    void set1(){
        System.out.println("heroine");
    }
}
class movie{
    public static void main(String[] args) {
        location l= new location();
        l.show();
        l.set();
    }
}
