package Collection.arraylist.example.doctor;

import Collection.arraylist.example.employee.Employee;

import java.util.ArrayList;
import java.util.Random;

public class DoctorService {
    public ArrayList<Doctor> getrecords(int size){
        ArrayList<Doctor> records = new ArrayList<>();
        for(int i = 0; i < size; i++){
            Doctor record = buildRecord();
            records.add(record);
        }
        return records;
    }


    public Doctor buildRecord(){
        Doctor record= new Doctor();
        record.setDoctorName(getRandomName());
        record.setEducation(getRandomEducation());
        record.setType(getRandomType());
        return record;
    }

    private String getRandomName(){
        String[] name={"Prerna","sakshi","ridhi","rinku","sillu","kabir","aditi","Abhishek"};
        return name [new Random().nextInt(name.length)];
    }
    private String getRandomEducation(){
        String[] education={"Phd","M.B.B.S","Organic","Ayurvedic"};
        return  education[new Random().nextInt(education.length)];
    }
    private String getRandomType(){
        String[]type={"heart","bones","liver","brain","eyes","skin"};
        return type[new Random().nextInt(type.length)];
    }
}
