package com.ivan.course.decorator.concreteDecorator;

import com.ivan.course.component.Appointment;
import com.ivan.course.decorator.AppointmentDecorator;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.List;

public class DelayableAppointmentDecorator extends AppointmentDecorator {
    public DelayableAppointmentDecorator(Appointment appointment) {
        super(appointment);
    }

    public void delayAppointmentHours(int hours) {
        System.out.println("delaying appointment hours: " + hours);
        LocalDateTime newAppointmentDateTime = appointment.getAppointmentDateTime().plusHours(hours);

        if(newAppointmentDateTime.getHour() >= 18 || newAppointmentDateTime.getHour() < 9) {
            System.out.println("Appointment has not been delayed: it is not work time");
            return;
        }

        appointment.setAppointmentDateTime(newAppointmentDateTime);
        System.out.println("Appointment has been delayed.");
    }

    public void delayAppointmentDays(int days) {
        System.out.println("delaying appointment days: " + days);
        LocalDateTime newAppointmentDateTime = appointment.getAppointmentDateTime().plusDays(days);

        if (List.of(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY).contains(newAppointmentDateTime.getDayOfWeek())) {
            System.out.println("Appointment has not been delayed: we do not work on weekends");
            return;
        }

        appointment.setAppointmentDateTime(newAppointmentDateTime);
        System.out.println("Appointment has been delayed.");
    }

    public void delayAppointmentWeeks(int weeks) {
        System.out.println("delaying appointment weeks: " + weeks);
        LocalDateTime newAppointmentDateTime = appointment.getAppointmentDateTime().plusWeeks(weeks);

        System.out.println("Appointment has been delayed.");
    }

}
