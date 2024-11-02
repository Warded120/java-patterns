package app;

import app.appointment.Appointment;
import app.appointment.AppointmentPool;

public class Main {
    public static void main(String[] args) {
        int pool = 3;
        AppointmentPool appointmentPool = new AppointmentPool(pool, false);

        Appointment appointment1 = appointmentPool.borrowAppointment();
        appointment1.setPatientName("patient1");
        appointment1.meet();

        Appointment appointment2 = appointmentPool.borrowAppointment();
        appointment2.setPatientName("patient2");
        appointment2.meet();

        Appointment appointment3 = appointmentPool.borrowAppointment();
        appointment3.setPatientName("patient3");
        appointment3.meet();

        Appointment appointment4 = appointmentPool.borrowAppointment();


        appointmentPool.returnAppointment(appointment1);
        appointmentPool.returnAppointment(appointment2);
        appointmentPool.returnAppointment(appointment3);
    }
}