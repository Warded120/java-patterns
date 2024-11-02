package com.ivan.course.visitor;

import com.ivan.course.element.Appointment;

public interface Visitor {
    void visit(Appointment appointment);
}
