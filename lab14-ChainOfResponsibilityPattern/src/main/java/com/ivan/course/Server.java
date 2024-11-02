package com.ivan.course;

import com.ivan.course.entity.Appointment;
import com.ivan.course.handler.Handler;

public class Server {
    private final Handler handler;

    public Server(Handler handler) {
        this.handler = handler;
    }

    public boolean handle (Appointment appointment) throws InterruptedException {
        if(handler.handle(appointment)) {
            System.out.println("Appointment handled");
            return true;
        }
        System.out.println("Appointment not handled");
        return false;
    }
}
