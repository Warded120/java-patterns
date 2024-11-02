package com.ivan.course;

import com.ivan.course.extrinsic.Appointment;
import com.ivan.course.intrinsic.AppointmentFactory;
import com.ivan.course.intrinsic.AppointmentType;
import com.ivan.course.intrinsic.Symptom;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AppointmentManager {
    private static int idCounter = 0;

    private List<Appointment> appointments = new ArrayList<Appointment>();

    public void addAppointment(String patientName, Symptom symptom, LocalDate date, String doctorName, int experiance, int cabinet) {
        AppointmentType appointmentType = AppointmentFactory.getAppointmentType(doctorName, symptom, experiance, cabinet);
        Appointment appointment = new Appointment(idCounter++, patientName, symptom, date, appointmentType);

        appointments.add(appointment);
    }

    public void holdAppointments() {
        for(Appointment appointment : appointments) {
            appointment.hold();
        }
    }
}
