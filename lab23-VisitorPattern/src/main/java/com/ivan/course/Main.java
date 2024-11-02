package com.ivan.course;

import com.ivan.course.element.Appointment;
import com.ivan.course.visitor.PriceVisitor;
import com.ivan.course.visitor.QualityVisitor;
import com.ivan.course.visitor.Visitor;

public class Main {
    public static void main(String[] args) {
        Appointment appointment = new Appointment("Dr. Smith", 12, 9, 1.5);

        Visitor priceVisitor = new PriceVisitor();
        Visitor qualityVisitor = new QualityVisitor();

        appointment.accept(priceVisitor);
        appointment.accept(qualityVisitor);
    }
}