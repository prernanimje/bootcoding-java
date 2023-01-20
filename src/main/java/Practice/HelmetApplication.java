package Practice;

public class HelmetApplication {
    public static void main(String[] args) {
        Helmet h1=Helmet.GetHelmet();
        Helmet h2=Helmet.GetHelmet("vega",600,"black","boys");
        Helmet.GotHelmet(h1);
        Helmet.GotHelmet(h2);
    }
}
