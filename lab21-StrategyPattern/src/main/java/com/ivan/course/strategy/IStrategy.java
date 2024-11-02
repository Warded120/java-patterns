package com.ivan.course.strategy;

import com.ivan.course.Appointment;

public interface IStrategy {
    void handle(Appointment appointment);
}
