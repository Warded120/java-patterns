package com.ivan.course.entity.person;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper=true)
public class Doctor extends Person {
    private final int experience;

    public Doctor(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }
}