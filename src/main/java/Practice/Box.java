package Practice;

import com.sun.source.tree.BreakTree;

public class Box {

    public double length;
    public double breath;
    public  double height;

    public static  Box createBox(){
     Box box=new Box();
        box.length=10.0;
        box.breath=10.0;
        box.height=10.0;
       return box;
    }
    public static Box createBox(double l,double b,double h){
     Box box=new Box();
     box.length=l;
     box.breath=b;
     box.height=h;
     return box;
    }
    public static void printBox(Box box){
        System.out.println("Box.length = " + box.length );
        System.out.println( "Box.breath = " +box.breath) ;
        System.out.println( "Box.height = " + box.height);

    }
}
