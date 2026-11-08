package clinicqueuesystem;


    public class PriorityPatient extends Patient {

    private String priorityType;

    public PriorityPatient(String patientId, String fullName,
            int age, String birthdate, String address,
            int queueNumber, String classification,
            String gender, String priorityType) {

        super(patientId, fullName, age, birthdate,
                address, queueNumber, classification, gender);

        this.priorityType = priorityType;
    }

    public String getPriorityType() {
        return priorityType;
    }

    @Override
    public String getPatientType() {
        return "Priority";
    }
}
