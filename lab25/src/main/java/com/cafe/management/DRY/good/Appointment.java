package com.cafe.management.DRY.good;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class Appointment {
    private String patientName;
    private LocalDate date;
}
