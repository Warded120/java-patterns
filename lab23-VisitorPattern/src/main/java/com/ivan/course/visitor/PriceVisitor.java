package com.ivan.course.visitor;

import com.ivan.course.element.Appointment;

public class PriceVisitor implements Visitor {
    @Override
    public void visit(Appointment appointment) {
        System.out.println("calculating price for appointment: " + appointment);
        double price = appointment.getDoctorPricePerHour() * appointment.getAppointmentDuration();
        System.out.println("price for appointment is: " + price + "$");
    }
}
