import java.time.LocalDateTime;

public class Appointment implements Prototype {
    private Patient patient;
    private LocalDateTime appointmentTime;

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Appointment(Patient patient, LocalDateTime appointmentTime) throws InterruptedException {
        System.out.println("Lets pretend the appointment creation takes a lot of time....");
        Thread.sleep(3000);

        this.patient = patient;
        this.appointmentTime = appointmentTime;
    }

    public Appointment(Appointment appointment) {
        this.patient = appointment.patient;
        this.appointmentTime = appointment.appointmentTime;
    }

    public Patient getPatient() {
        return patient;
    }

    public LocalDateTime getAppointmentTime() {
        return appointmentTime;
    }

    @Override
    public String toString() {
        return "Appointment{patient=" + patient + ", appointmentTime=" + appointmentTime + "}";
    }

    @Override
    public Prototype clone() {
        return new Appointment(this);
    }
}
