package classWork;

public class Access{
    private String name;
    private int age;
    private double basic;

    void SetEmployee(String n, int a,double bs){
        name=n;
        age=a;
        basic=bs;
    }

    void ShowEmployee(){
        System.out.println("Name" +"-"+name);
        System.out.println("Age" +"-"+age);
        System.out.println("Basic"+"-"+ basic);
    }

    public static void main(String[]args){
        Access e1= new Access();
        e1.SetEmployee("prerna",19,5.3);
        e1.ShowEmployee();
    }
}
