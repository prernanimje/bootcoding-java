package Practice;

public class GradeSystem {
    public static void main(String[] args) {
        int [] studentPercentages={61,55,85,47,52,95} ;
        char[] gradesResults=calculateGrade(studentPercentages);
        for(int i=0;i<gradesResults.length;i++){
            System.out.println(studentPercentages[i]+ "->" + gradesResults[i]);
        }
    }

    public static char[] calculateGrade(int[] studentPercentages){
        char[] grades = new char[studentPercentages.length];
        for(int i=0;i<studentPercentages.length;i++){
            char grade;
            int percentage = studentPercentages[i];
            grade =getGrade(percentage);
            grades[i]=grade;
        }
        return grades;
    }
    private static  char getGrade(int percentage){
        char grade;
        if(percentage>=75){
            grade='A';
        }else if (percentage>=60){
            grade='B';
        }
        else {
            grade='C';
        }
        return grade;
    }
}
