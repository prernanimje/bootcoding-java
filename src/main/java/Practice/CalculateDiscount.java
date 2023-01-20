package Practice;

public class CalculateDiscount {
    public static void main(String[] args) {
        int[] number={1,5,4,7,6,9};
        int[] shoppedResult=frequentlyshopping(number);
        for (int i=0;i<shoppedResult.length;i++){
            System.out.println("Number of shopping :"+number[i]+"= Customer got "+shoppedResult[i]+"% Discount");
        }
    }

    public static int[] frequentlyshopping (int [] number) {
       int[] shopped= new int [(number.length)];
       for (int i=0;i<number.length;i++){
           int discount;
           int percentage=number[i];
           discount=discounts(percentage);
           shopped[i]=discount;
       }return shopped;

    }
    public static int discounts (int dispercentage){
        int discount;
        if (dispercentage>=8) {
            discount = 50;
        } else if(dispercentage>=6) {
            discount = 30;
        }else{
            discount=0;
        }



        return discount;

    }
}
