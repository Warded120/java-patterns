package com.ivan.course.object;

import java.time.LocalDate;

public interface Appointment {
    void schedule(LocalDate date);
    void start();
    void cancel();
}
