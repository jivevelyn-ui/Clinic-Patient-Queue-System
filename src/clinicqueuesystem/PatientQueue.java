
package clinicqueuesystem;

public class PatientQueue {

    private Patient[] patients;
    private int front;
    private int rear;
    private int size;

    private final int CAPACITY = 100;

    // Constructor
    public PatientQueue() {

        patients = new Patient[CAPACITY];

        front = 0;
        rear = -1;
        size = 0;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if queue is full
    public boolean isFull() {
        return size == CAPACITY;
    }

    // Return number of patients
    public int getSize() {
        return size;
    }

    // Add patient to queue
    public boolean enqueue(Patient patient) {

        if (isFull() || patient == null) {
            return false;
        }

        rear = (rear + 1) % CAPACITY;

        patients[rear] = patient;

        size++;

        return true;
    }

    // Remove first patient
    public Patient dequeue() {

        if (isEmpty()) {
            return null;
        }

        Patient patient = patients[front];

        patients[front] = null;

        front = (front + 1) % CAPACITY;

        size--;

        if (size == 0) {
            front = 0;
            rear = -1;
        }

        return patient;
    }

    // View first patient
    public Patient peek() {

        if (isEmpty()) {
            return null;
        }

        return patients[front];
    }

    // Get patient at a specific position
    public Patient getAt(int index) {

        if (index < 0 || index >= size) {
            return null;
        }

        int position = (front + index) % CAPACITY;

        return patients[position];
    }
}
