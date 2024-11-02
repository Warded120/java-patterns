package com.cafe.management.SOLID.bad;

import lombok.RequiredArgsConstructor;
import java.time.LocalDate;

public class AllInOne {
    private String patientName;
    private LocalDate appointmentDate;
    private boolean isHandled = false;

    public AllInOne(String patientName, LocalDate appointmentDate) {
        this.patientName = patientName;
        this.appointmentDate = appointmentDate;
        this.isHandled = isHandled;
    }

    public void handle() {
        isHandled = true;
    }

    public static void main(String[] args) {
        AllInOne appointment = new AllInOne("Oleg", LocalDate.now());

        appointment.handle();
        System.out.println("appointment handled");
    }
}
