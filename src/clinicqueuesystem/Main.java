package clinicqueuesystem;

public class Main {

    public static void main(String[] args) {

        PatientManager manager = new PatientManager();

        java.awt.EventQueue.invokeLater(() -> {

            new QueueManagementDashboard(manager)
                    .setVisible(true);

        });
    }
}