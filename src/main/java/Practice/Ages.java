package Practice;

public class Ages {

    public static boolean isSeniorCitizen(int[] ages) {
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] >= 60) {
                return true;
            }
        }

        return false;
    }

    public static boolean isChildreanAge(int []ages) {
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] >= 9) {
                return true;
            }
        }
        return false;

    }
    public static void main(String[]args) {
    int[] ages= {12,50,32,12,60,78};
    boolean result= isSeniorCitizen(ages);
        System.out.println(isSeniorCitizen(ages));
    boolean res=isChildreanAge(ages);
            System.out.println(isChildreanAge(ages));
    }
}
