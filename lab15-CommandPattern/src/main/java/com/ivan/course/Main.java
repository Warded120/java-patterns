package com.ivan.course;

import com.ivan.course.command.Command;
import com.ivan.course.command.Controller;
import com.ivan.course.command.impl.DelayAppointment;
import com.ivan.course.command.impl.HandleAppointment;
import com.ivan.course.entity.Appointment;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Appointment appointment = new Appointment("Oleg", "Dr. Smith", LocalDate.now());
        Command handleCommand = new HandleAppointment(appointment);
        Command delayCommand = new DelayAppointment(appointment);

        Controller controller = new Controller();

        System.out.println("executing handleCommand");
        controller.setCommand(handleCommand);
        controller.execute();


        System.out.println("executing delayCommand");
        controller.setCommand(delayCommand);
        controller.backup();
        controller.execute();
        controller.undo();
    }
}