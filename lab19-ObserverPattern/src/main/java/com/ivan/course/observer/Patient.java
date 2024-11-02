package com.ivan.course.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Patient implements Observer {
    private String name;

    @Override
    public void update(String date) {
        System.out.println(name + " has been notified about new appointment date: " + date);
    }
}
