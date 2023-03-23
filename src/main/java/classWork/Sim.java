package classWork;

abstract public class Sim {
    abstract void inserted();
}
class Idea extends Sim{
    @Override
    void inserted() {
        System.out.println("Idea Sim inserted");
    }
}
class Airtel extends Sim{
    void inserted(){
        System.out.println("Airtel Sim inserted");
    }
}
class Jio extends Sim{
    void inserted(){
        System.out.println("Jio Sim inserted");
    }
}
class Magic{
   public void showMagic(Sim sim){
       System.out.println("--Start");
       sim.inserted();
       System.out.println("End--");
    }
}
class demo4{
    public static void main(String[] args) {
        Magic m= new Magic();
        Idea i= new Idea();
        Airtel a= new Airtel();
        Jio j= new Jio();
        m.showMagic(i);
        m.showMagic(a);
        m.showMagic(j);
    }
}