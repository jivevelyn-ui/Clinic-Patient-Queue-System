package clinicqueuesystem;

public class PatientQueue {
    private Patient[] patients;
    private int front;
    private int rear;
    private int size;
    private final int CAPACITY = 100;

    public PatientQueue() {
        patients = new Patient[CAPACITY];
        front = 0;
        rear = -1;
        size = 0;
    }

    boolean getSize() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Patient getAt(int j) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
