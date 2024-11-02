package com.ivan.course.mediator;

import com.ivan.course.entity.Doctor;
import com.ivan.course.entity.Patient;

public interface Mediator {
    void scheduleAppointment(Patient patient, Doctor doctor);
    void notifyDoctor(Doctor doctor, String message);
    void notifyPatient(Patient patient, String message);
}