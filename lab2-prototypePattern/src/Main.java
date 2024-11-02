import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        try {
            Patient patient = new Patient("Volodya", "228");
            Appointment appointment = new Appointment(patient, LocalDateTime.now());
            System.out.println("created appointment" + appointment);

            Patient clonedPatient = (Patient) patient.clone();
            clonedPatient.setName("Petya");

            Appointment clonedAppointment = (Appointment) appointment.clone();
            clonedAppointment.setPatient(clonedPatient);
            System.out.println("cloned appointment" + clonedAppointment);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}