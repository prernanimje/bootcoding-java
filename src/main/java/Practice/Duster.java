package Practice;

import java.lang.constant.DynamicCallSiteDesc;

public class Duster {

    public static String color = "black";
    public static double price;
    public static String shape;
    public static String type;

    public static Duster GetDuster(){
        Duster duster=new Duster();
        duster.color="black";
        duster.price=25.25;
        duster.shape="rectangle";
        duster.type="whiteboard";
        return duster;
    }

    public static Duster GetDuster(String c,double p,String s,String t){
        Duster duster=new Duster();
        duster.color=c;
        duster.price=p;
        duster.shape=s;
        duster.type=t;
        return duster;
    }

    public static void GotDuster(Duster duster){
        System.out.println("Duster.color=" + duster.color);
        System.out.println("Duster.price="+ duster.price);
        System.out.println("Duster.shape=" + duster.shape);
        System.out.println("Duster.type=" + duster.type);

    }

}
