package Evening;

public class Print {
    public static void main(String[] args) {
       int n=134;
       int Last=n% 10;

       int First=n;
       while (n!=0) {
           First=n;
           n = n / 10;
       }
           System.out.println("This is first digit : " + First);
           System.out.println("This is Last digit : " + Last);


    }
}
