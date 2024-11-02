package com.ivan.course.handler;

import com.ivan.course.appointment.Appointment;

public class DetailedAppointmentHandler extends AppointmentHandler {
    public DetailedAppointmentHandler(Appointment appointment) {
        super(appointment);
    }

    @Override
    public void schedule() {
        System.out.println("Schedule detailed appointment");
    }

    @Override
    public void notifyMembers() {
        System.out.println("Notify " + appointment.getPatientName()
                + " and " + appointment.getDoctorName()
                + " about detailed appointment");
    }

    @Override
    public void startAppointment() {
        System.out.println("start detailed appointment");
    }

    @Override
    public void getResults() {
        System.out.println("send detailed results to " + appointment.getPatientName());
    }
}
