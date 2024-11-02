package com.ivan.course.entity.appointment;

import com.ivan.course.entity.person.Doctor;
import com.ivan.course.entity.person.Patient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

// Low coupling, high cohesion, polymorphism
@AllArgsConstructor
@Getter
@Setter
@ToString
public abstract class Appointment {
    Patient patient;
    Doctor doctor;
    LocalDate appointmentDate;

    // Protected variations
    public abstract boolean handle();
}
