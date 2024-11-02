package com.ivan.course.handler;

import com.ivan.course.appointment.Appointment;

public class FastAppointmentHandler extends AppointmentHandler {
    public FastAppointmentHandler(Appointment appointment) {
        super(appointment);
    }

    @Override
    public void schedule() {
        System.out.println("schedule fast appointment " + appointment.getAppointmentDate());
    }

    @Override
    public void notifyMembers() {
        System.out.println("Notify " + appointment.getPatientName()
                + " and " + appointment.getDoctorName()
                + " fast");    }

    @Override
    public void startAppointment() {
        System.out.println("start fast appointment");
    }

    @Override
    public void getResults() {
        System.out.println("send brief results to " + appointment.getPatientName());
    }
}
