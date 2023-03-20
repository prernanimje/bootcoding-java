package Evening;

public class CommandLineArgs {
    public static void main(String[] input) {
        int rem=0;
        String firstArgument = input[0];
        int n1=Integer.parseInt(input[0]);
        int temp=n1;
        while(n1!=0){
            int div = n1/10;
            rem = rem * 10 + n1 % 10;
            n1 = div;
        }if (temp==rem){
            System.out.println(temp+"=Palindrome number");
        }else {
            System.out.println("Not Palindrome");
        }
        }
}
