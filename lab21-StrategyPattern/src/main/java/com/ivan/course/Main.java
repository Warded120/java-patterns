package com.ivan.course;

import com.ivan.course.strategy.DetailedAppointment;
import com.ivan.course.strategy.IStrategy;
import com.ivan.course.strategy.FastAppointment;

public class Main {
    public static void main(String[] args) {
        Appointment appointment = new Appointment("Oleg", "Dr. Smith", "today");
        AppointmentHandler handler = new AppointmentHandler(appointment);

        IStrategy fastStrategy = new FastAppointment();
        IStrategy detailedStrategy = new DetailedAppointment();

        handler.setStrategy(fastStrategy);
        handler.handle();

        handler.setStrategy(detailedStrategy);
        handler.handle();
    }
}