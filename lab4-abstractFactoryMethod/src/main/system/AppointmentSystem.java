package main.system;

import main.factories.interfaces.AppointmentFactory;
import main.factories.interfaces.DoctorFactory;
import main.factories.interfaces.PatientFactory;
import main.products.interfaces.Appointment;
import main.products.interfaces.Doctor;
import main.products.interfaces.Patient;

public class AppointmentSystem {
    private AppointmentFactory appointmentFactory;
    private PatientFactory patientFactory;
    private DoctorFactory doctorFactory;

    public AppointmentSystem(AppointmentFactory appointmentFactory, PatientFactory patientFactory, DoctorFactory doctorFactory) {
        this.appointmentFactory = appointmentFactory;
        this.patientFactory = patientFactory;
        this.doctorFactory = doctorFactory;
    }

    public void manage(String pName, float pTemp, String dName) {
        Patient patient = patientFactory.createPatient(pName, pTemp);
        Doctor doctor = doctorFactory.createDoctor(dName);
        Appointment appointment = appointmentFactory.createAppointment(patient, doctor);

        System.out.println("----------------------------");
        System.out.println(appointment.getAppointmentData());
        System.out.println(doctor.examinePatient(patient));
        System.out.println(appointment.AnnounceDiagnose());
        System.out.println("----------------------------");
        System.out.println();
    }
}
