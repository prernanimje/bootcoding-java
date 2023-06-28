package Collection.arraylist.example.doctor;

public class Doctor {
   //Keep 10k doctors into arraylist and print name, education, age, type of doctor
    private String DoctorName;
    private String Education;
    private String type;

    public String getEducation() {
        return Education;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String doctorName) {
        DoctorName = doctorName;
    }
}
