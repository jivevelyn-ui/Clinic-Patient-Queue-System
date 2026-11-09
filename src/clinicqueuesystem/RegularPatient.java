package clinicqueuesystem;

public class RegularPatient extends Patient {

    public RegularPatient(String patientId, String fullName,
            int age, String birthdate, String address,
            int queueNumber, String classification,
            String gender) {

        super(patientId, fullName, age, birthdate,
                address, queueNumber, classification, gender);
    }

    @Override
    public String getPatientType() {
        return "Regular";
    }
}
    

