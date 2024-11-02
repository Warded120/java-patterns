package com.ivan.course.element;

import com.ivan.course.visitor.Visitor;

public interface Element {
    void accept(Visitor visitor);
}
