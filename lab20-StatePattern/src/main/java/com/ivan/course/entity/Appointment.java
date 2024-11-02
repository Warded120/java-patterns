package com.ivan.course.entity;

import com.ivan.course.state.ScheduleState;
import com.ivan.course.state.State;
import lombok.*;

@Getter
@ToString
public class Appointment {
    @Setter
    private State state;

    private final String patientName;
    private final String doctorName;
    private final String appointmentTime;
    @Setter
    private boolean isStarted = false;
    @Setter
    private boolean isFinished = false;

    public Appointment(String patientName, String doctorName, String appointmentTime) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.appointmentTime = appointmentTime;
        this.state = new ScheduleState(this);
    }

    public void nextState() {
        state.nextState();
    }
}
