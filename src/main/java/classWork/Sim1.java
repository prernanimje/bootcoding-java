package classWork;

interface Sim1{
    void inserted();
}
class idea implements Sim1{

    @Override
    public void inserted() {
        System.out.println("Idea Sim inserted");
    }
}
class demo6{
    public static void main(String[] args) {
        idea i= new idea();
        i.inserted();
    }
}