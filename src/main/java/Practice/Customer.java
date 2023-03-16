package Practice;


public class Customer {

    String Name;
    String type;
    double total;


    public static int getDiscount(String type) {
        if (type.equals("regular")) {
            return 40;
        }
        if (type.equals("Non Regular")) {
            return 20;
        }
        if (type.equals("premium")) {
            return 90;
        }

        return 0;
    }
   /* public void TotalDiscount(){
        double total1=total/100;
        double LastDiscount=

    }*/

    public static void main(String[] args) {
        Customer ramesh=new Customer();
        ramesh.Name="ramesh";
        ramesh.type="Regular";
        ramesh.total=6520;

        Customer suresh= new Customer();
        suresh.Name="Suresh";
        suresh.type="Non Regular";
        suresh.total=3598;

        Customer kamlesh= new Customer();
        kamlesh.Name="Kamlesh";
        kamlesh.type="premium";
        kamlesh.total=9856;

        int RameshDiscount=getDiscount(ramesh.type);
        int SureshDiscount=getDiscount(suresh.type);
        int KamleshDiscount=getDiscount(kamlesh.type);

       /* double total1= ramesh.total/100;
        double LastDiscount= ramesh.total*total1;*/

        System.out.println("Ramesh is a" + ramesh.type+"got Discount"+RameshDiscount);
        System.out.println("Suresh is a" + suresh.type+"got Discount"+SureshDiscount);
        System.out.println("Kamlesh is a"+ kamlesh.type+"got Discount"+KamleshDiscount);
    }
}
