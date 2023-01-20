package Practice;

public class Helmet {
    public static String brand;
    public static double price;
    public static String color;
    public static String type;

    public static  Helmet GetHelmet(){
        Helmet helmet=new Helmet();
        helmet.brand="Bajaj";
        helmet.price=500;
        helmet.color="red";
        helmet.type="ladies";
        return helmet;
    }

    public static Helmet GetHelmet(String b, double p, String c, String t){
        Helmet helmet =new Helmet();
        helmet.brand=b;
        helmet.price=p;
        helmet.color=c;
        helmet.type=t;
        return helmet;
    }

    public static void GotHelmet(Helmet helmet){
        System.out.println("Helmet.brand = " + helmet.brand);
        System.out.println("Helmet.price = " + helmet.price);
        System.out.println("Helmet.color = " + helmet.color);
        System.out.println("Helmet.type  = " + helmet.type);

    }
}
