package Collection.arraylist.example.doctor;

import java.util.ArrayList;

public class DoctorApplication {
    public static void main(String[] args) {
        DoctorService ds= new DoctorService();
        ArrayList<Doctor> records= ds.getrecords(10000);
        for (int i=0;i< records.size();i++){
            System.out.println("DoctorName:"+ records.get(i).getDoctorName());
            System.out.println("Education:"+records.get(i).getEducation());
            System.out.println("Type of Doctor:"+records.get(i).getType());
        }
    }
}
