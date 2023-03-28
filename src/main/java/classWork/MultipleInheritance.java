package classWork;

public interface MultipleInheritance {
    void set1();
}
interface picnic {
    void show();
    void call();
}
class place implements MultipleInheritance,picnic{
    public void set1(){
        System.out.println("girls");
    }

    @Override
    public void call() {
        System.out.println("parents");
    }

    @Override
    public void show() {
        System.out.println("location");
    }
}
class tuition{
    public static void main(String[] args) {
        place p= new place();
        p.set1();
    }
}
