package com.ivan.course;

import com.ivan.course.entity.Appointment;
import com.ivan.course.handler.Handler;
import com.ivan.course.handler.Impl.DetailedAppointmentHandler;
import com.ivan.course.handler.Impl.FastAppointmentHandler;
import com.ivan.course.handler.Impl.RegularAppointmentHandler;

public class Main {
    public static void main(String[] args) {
        Handler handler = Handler.link(
                new DetailedAppointmentHandler(),
                new RegularAppointmentHandler(),
                new FastAppointmentHandler()
        );

        Server server = new Server(handler);

        Appointment appointment = new Appointment("Oleg", "Dr. Smith", "tomorrow");

        try {
            server.handle(appointment);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}