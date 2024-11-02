package com.ivan.course.subject;

import com.ivan.course.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
