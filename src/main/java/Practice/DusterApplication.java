package Practice;

public class DusterApplication {
    public static void main(String[] args) {

        Duster d1=Duster.GetDuster();
        Duster d2=Duster.GetDuster("white",15.41,"square","blackboard");
        Duster.GotDuster(d1);
        Duster.GotDuster(d2);
    }
}
