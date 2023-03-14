package Practice;

import java.util.Random;

// Student with name, rollNo, physicsMarks,
// chemistryMarks, mathsMarks, avgMarks, percentage and 2 methods as calculateAverage() and calculatePercentage()
public class Student{
    public String name;
    public int rollNo;
    public int physicsMarks;
    public int chemistryMarks;
    public int mathsMarks;
    public double avgMarks;
    public double percentage;

    public  void calculateAverage(){
        avgMarks = (physicsMarks + chemistryMarks + mathsMarks) / 3;
    }

    public  void calculatePercentage(){
        percentage = ((physicsMarks + chemistryMarks + mathsMarks) / 300.00 ) * 100;
    }

    public void print(){
        System.out.println("--MathsMarks"+mathsMarks);
        System.out.println("PhysicsMarks"+physicsMarks);
        System.out.println("ChemistryMarks"+chemistryMarks);
        System.out.println("Percentage"+percentage);
        System.out.println("Average"+avgMarks);
    }

    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 1; i <= 50; i++){
            Student s1 = new Student();
            s1.mathsMarks = 10 + random.nextInt(90);
            s1.physicsMarks=10+ random.nextInt(90);
            s1.chemistryMarks=10+ random.nextInt(90);
            s1.name="khushi";
            s1.rollNo=1;
            s1.calculateAverage();
            s1.calculatePercentage();
            s1.print();
        }

    }

}
