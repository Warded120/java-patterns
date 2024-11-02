package com.ivan.course.visitor;

import com.ivan.course.element.Appointment;

public class QualityVisitor implements Visitor {
    @Override
    public void visit(Appointment appointment) {
        System.out.println("calculating quality of appointment");
        double quality = appointment.getAppointmentDuration() * appointment.getDoctorExperience();
        System.out.println("quality of appointment: " + quality + " points");
    }
}
