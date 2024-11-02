package com.ivan.course.entity.person;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

// Low coupling, high cohesion, polymorphism
@AllArgsConstructor
@Getter
@ToString
public abstract class Person {
    protected final String name;
    protected final int age;
}
