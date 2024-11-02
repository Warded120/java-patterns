package com.ivan.course;

import com.ivan.course.constants.Status;
import com.ivan.course.controller.AppointmentController;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AppointmentController controller = new AppointmentController(Status.REGULAR,
                "Oleg", 18, 38.2,
                "Dr. Smith", 59, 16,
                LocalDate.now());

        controller.handleAppointment();
    }
}