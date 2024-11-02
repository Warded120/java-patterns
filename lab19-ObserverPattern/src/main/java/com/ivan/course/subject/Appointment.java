package com.ivan.course.subject;

import com.ivan.course.observer.Observer;
import java.util.ArrayList;
import java.util.List;

public class Appointment implements Subject {
    List<Observer> observers;
    String appointmentDate;

    public Appointment(String appointmentDate) {
        observers = new ArrayList<>();
        this.appointmentDate = appointmentDate;
    }

    @Override
    public void registerObserver(Observer observer) {
        System.out.println("Registered Observer: " + observer);
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        System.out.println("Removed Observer: " + observer);
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(appointmentDate);
        }
        System.out.println("Observers notified");
    }
}
