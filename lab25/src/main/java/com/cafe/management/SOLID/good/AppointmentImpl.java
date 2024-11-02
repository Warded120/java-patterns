package com.cafe.management.SOLID.good;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@ToString(callSuper = true)
public class AppointmentImpl extends BaseAppointment implements Handleable, Delayable {
    private boolean isHandled = false;

    public AppointmentImpl(String patientName, LocalDate appointmentDate) {
        super(patientName, appointmentDate);
    }

    public void handle() {
        isHandled = true;
    }

    @Override
    public void delay(LocalDate newDate) {
        appointmentDate = newDate;
    }
}
