package Practice;

import java.security.PublicKey;
import java.security.cert.CertificateNotYetValidException;
import java.util.concurrent.Callable;

public class Cycle {

    public static String model;
    public static String color;
    public static double price;
    public static String type;
    public static int wheel;
    public static Cycle c1;


    public static Cycle CreateCycle(){
        Cycle cycle= new Cycle();
        Cycle.model="heroSport";
        Cycle.color="blue";
        Cycle.price=15.005;
        Cycle.type="boys";
        Cycle.wheel=2;
        return cycle;
    }

    public static Cycle CreateCycle(String m,String c, double p, String t, int w){
       Cycle cycle=new Cycle();
       Cycle.model=m;
       Cycle.color=c;
       Cycle.price=p;
       Cycle.type=t;
       Cycle.wheel=w;

       return cycle;


    }

   // public static void  GoCycle(Cycle cycle){
   ////     System.out.println();
  //  }

    public static void makeCycle(Cycle cycle){
        System.out.println("Cycle.model =" + cycle.model);
        System.out.println("Cycle.color =" + cycle.color);
        System.out.println("Cycle.price =" + cycle.price);
        System.out.println("Cycle.type  =" + cycle.type);
        System.out.println("Cycle.wheel =" + cycle.wheel);
    }
}
