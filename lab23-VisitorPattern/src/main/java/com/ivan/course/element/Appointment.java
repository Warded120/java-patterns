package com.ivan.course.element;

import com.ivan.course.visitor.Visitor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Appointment implements Element {
    private String doctorName;
    private int doctorPricePerHour;
    private int doctorExperience;
    private double appointmentDuration;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
