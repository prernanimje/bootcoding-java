package Practice;


public class Fan {

    public static String brand;
    public static double price;
    public static String type;
    public static String color;

    public static Fan GetFan(){
        Fan fan=new Fan();
        brand="orient";
        price=900.3;
        type="Seeling fan";
        color="white";
        return fan;

    }

    public static Fan GetFan(String b, double p, String t,String c){
        Fan fan = new Fan();
        brand=b;
        price=p;
        type=t;
        color=c;
        return fan;
    }

    public static void GotFan(Fan fan){
        System.out.println("Fan.brand =" + brand);
        System.out.println("Fan.price=" + price);
        System.out.println("Fan.type=" +type);
        System.out.println("Fan.color =" + color);
    }
}
