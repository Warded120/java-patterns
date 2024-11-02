import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AppointmentManager {
    private static AppointmentManager instance;
    private List<Appointment> appointments;

    private AppointmentManager() {
        appointments = new ArrayList<>();
    }

    public static synchronized AppointmentManager getInstance() {
        if (instance == null) {
            System.out.println("new instance created");
            instance = new AppointmentManager();
        }
        System.out.println("instance returned");
        return instance;
    }

    public void addAppointment(Patient patient, LocalDateTime appointmentTime) {
        appointments.add(new Appointment(patient, appointmentTime));
    }

    public List<Appointment> getAppointments() {
        return new ArrayList<>(appointments);
    }
}
