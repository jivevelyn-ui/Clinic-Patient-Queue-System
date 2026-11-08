package clinicqueuesystem;

public class Patient {
    private String patientId;
    private String fullName;
    private int age;
    private String birthdate;
    private String address;
    private int queueNumber;
    private String classification;
    private String gender;

    public Patient(String patientId, String fullName, int age,
            String birthdate, String address, int queueNumber,
            String classification, String gender) {

        this.patientId = patientId;
        this.fullName = fullName;
        this.age = age;
        this.birthdate = birthdate;
        this.address = address;
        this.queueNumber = queueNumber;
        this.classification = classification;
        this.gender = gender;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getAddress() {
        return address;
    }

    public int getQueueNumber() {
        return queueNumber;
    }

    public String getClassification() {
        return classification;
    }

    public String getGender() {
        return gender;
    }

    public String getPatientType() {
        return "Regular";
    }
}


