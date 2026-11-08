package clinicqueuesystem;

public class PatientManager {

    private PatientQueue lane1;
    private PatientQueue lane2;
    private PatientQueue lane3;
    private PatientQueue lane4;

    private boolean nextPriorityLane1 = true;
    private boolean nextRegularLane3 = true;

    public PatientManager() {

        lane1 = new PatientQueue();
        lane2 = new PatientQueue();
        lane3 = new PatientQueue();
        lane4 = new PatientQueue();
    }

    // Register priority patient
    public int addPriorityPatient(PriorityPatient patient) {

        if (lane1.getSize() < lane2.getSize()
                || (lane1.getSize() == lane2.getSize()
                && nextPriorityLane1)) {

            if (lane1.enqueue(patient)) {
                nextPriorityLane1 = false;
                return 1;
            }

        } else {

            if (lane2.enqueue(patient)) {
                nextPriorityLane1 = true;
                return 2;
            }
        }

        return -1;
    }

    // Register regular patient
    public int addRegularPatient(RegularPatient patient) {

        if (lane3.getSize() < lane4.getSize()
                || (lane3.getSize() == lane4.getSize()
                && nextRegularLane3)) {

            if (lane3.enqueue(patient)) {
                nextRegularLane3 = false;
                return 3;
            }

        } else {

            if (lane4.enqueue(patient)) {
                nextRegularLane3 = true;
                return 4;
            }
        }

        return -1;
    }

    // Get queue based on lane number
    public PatientQueue getLane(int laneNumber) {

        switch (laneNumber) {
            case 1:
                return lane1;
            case 2:
                return lane2;
            case 3:
                return lane3;
            case 4:
                return lane4;
            default:
                return null;
        }
    }

    // Call next patient from a specific lane
    public Patient callNextPatient(int laneNumber) {

        PatientQueue queue = getLane(laneNumber);

        if (queue == null) {
            return null;
        }

        return queue.dequeue();
    }

    // Search patient using manual linear search
    public Patient searchPatient(String patientId) {

        PatientQueue[] lanes = {
            lane1, lane2, lane3, lane4
        };

        for (int i = 0; i < lanes.length; i++) {

            for (int j = 0; j < lanes[i].getSize(); j++) {

                Patient patient = lanes[i].getAt(j);

                if (patient.getPatientId().equalsIgnoreCase(patientId)) {
                    return patient;
                }
            }
        }

        return null;
    }
}
