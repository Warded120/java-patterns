package app.appointment;

public class Appointment {

    private static int idCounter = 0;
    private int id;
    private String patientName;

    public Appointment(int id, String patientName) {
        this.id = idCounter++;
        this.patientName = patientName;
    }

    public Appointment() {
        this.id = idCounter++;
    }

    public void meet() {
        System.out.println(patientName + " meets appointment");
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void reset() {
        patientName = "";
    }
}
