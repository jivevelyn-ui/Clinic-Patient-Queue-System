
package clinicqueuesystem;

public class Main {

    public static void main(String[] args) {

        // Create the patient manager
        PatientManager manager = new PatientManager();

        System.out.println("================================");
        System.out.println("   CLINIC PATIENT QUEUE SYSTEM");
        System.out.println("================================");

        // Create sample priority patients
        PriorityPatient p1 = new PriorityPatient(
                "P-001", "Juan Dela Cruz", 65,
                "1961-05-10", "Maramag",
                1, "Senior Citizen", "Male",
                "Senior Citizen"
        );

        PriorityPatient p2 = new PriorityPatient(
                "P-002", "Maria Santos", 28,
                "1998-03-15", "Valencia",
                2, "Pregnant", "Female",
                "Pregnant"
        );

        // Create sample regular patients
        RegularPatient p3 = new RegularPatient(
                "P-003", "Pedro Garcia", 35,
                "1991-02-20", "Malaybalay",
                3, "Regular", "Male"
        );

        RegularPatient p4 = new RegularPatient(
                "P-004", "Ana Reyes", 24,
                "2002-01-10", "Manolo Fortich",
                4, "Regular", "Female"
        );

        // Register patients
        int laneA = manager.addPriorityPatient(p1);
        int laneB = manager.addPriorityPatient(p2);

        int laneC = manager.addRegularPatient(p3);
        int laneD = manager.addRegularPatient(p4);

        System.out.println("\nPATIENT REGISTRATION:");

        System.out.println(p1.getPatientId() + " assigned to Lane " + laneA);
        System.out.println(p2.getPatientId() + " assigned to Lane " + laneB);
        System.out.println(p3.getPatientId() + " assigned to Lane " + laneC);
        System.out.println(p4.getPatientId() + " assigned to Lane " + laneD);

        // Display waiting patients
        System.out.println("\nWAITING PATIENTS:");

        for (int lane = 1; lane <= 4; lane++) {

            System.out.println("\nLANE " + lane + ":");

            PatientQueue queue = manager.getLane(lane);

            for (int i = 0; i < queue.getSize(); i++) {

                Patient patient = queue.getAt(i);

                System.out.println(
                        patient.getPatientId() + " - "
                        + patient.getFullName()
                );
            }
        }

        // Call next patient from Lane 1
        System.out.println("\nCALLING NEXT PATIENT:");

        Patient serving = manager.callNextPatient(1);

        if (serving != null) {

            System.out.println(
                    "Now Serving: "
                    + serving.getPatientId()
                    + " - "
                    + serving.getFullName()
            );
        }

        System.out.println("\nSYSTEM TEST COMPLETED.");
    }
}

