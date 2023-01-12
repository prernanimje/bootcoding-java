package Evening;

import java.util.Scanner;

public class Marks {
    private static Scanner sc;
    public static void main(String[] args) {
        int a=60;
        int b=45;
        int n= 65;
        int c=50;
        int d=35;
        if (n>=a){
            System.out.println("Student got " + a +   "Student is in : Division 1");
        }
        if (c>=b){
            System.out.println("Student got " + c + "Student is in : Division 2 ");
        }
       if (d<=b){
            System.out.println("Student got "+ d + "Student is in : Division 3 ");
        }
    }
}
