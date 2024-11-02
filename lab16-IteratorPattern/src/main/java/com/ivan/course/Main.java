package com.ivan.course;

import com.ivan.course.entity.Appointment;
import com.ivan.course.iterator.AppointmentList;
import com.ivan.course.iterator.AppointmentSet;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Appointment a1 = new Appointment("John Doe", "Dr. Smith", "2024-10-07");
        Appointment a2 = new Appointment("Jane Doe", "Dr. Adams", "2024-10-08");
        Appointment a3 = new Appointment("Alice", "Dr. Brown", "2024-10-09");

        AppointmentList appointmentList = new AppointmentList();
        appointmentList.addAppointment(a1);
        appointmentList.addAppointment(a2);
        appointmentList.addAppointment(a3);

        AppointmentSet appointmentSet = new AppointmentSet();
        appointmentSet.addAppointment(a1);
        appointmentSet.addAppointment(a2);
        appointmentSet.addAppointment(a3);

        System.out.println("Appointment List");
        Iterator<Appointment> iterator = appointmentList.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Appointment Set");
        iterator = appointmentSet.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}