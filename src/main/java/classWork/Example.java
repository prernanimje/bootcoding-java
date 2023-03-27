package classWork;

 interface Example {
     void custom();
}
interface Example1 extends Example{
     void print();
     void pressure();
}
class Student implements Example1{
    @Override
    public void custom() {
        System.out.println("yo");
    }

    @Override
    public void pressure() {
        System.out.println("hey");
    }

    @Override
    public void print() {
        System.out.println("printing");
    }
}
class demo7{
    public static void main(String[] args) {
        Student a= new Student();
        a.print();
    }
}
