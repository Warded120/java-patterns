import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        AppointmentManager manager = AppointmentManager.getInstance();

        Patient patient1 = new Patient("Volodya", "228");
        Patient patient2 = new Patient("Petya", "822");

        manager.addAppointment(patient1, LocalDateTime.now());
        manager.addAppointment(patient2, LocalDateTime.now().plusDays(2));

        System.out.println(manager.getAppointments());
    }
}