package Evening;

public class Count {
    public static void main(String[] args) {
        int a =123;
        int count=0;
        int temp=0;
        int rem=0;

        if(a!=0){
            int div =a/10;
            count++;
            a=div;
            System.out.println("The count of digit is  : " + count);
        }

    }
}
