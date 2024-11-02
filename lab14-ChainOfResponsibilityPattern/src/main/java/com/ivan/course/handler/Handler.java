package com.ivan.course.handler;

import com.ivan.course.entity.Appointment;

import java.util.Random;

public abstract class Handler {
    private Handler next;

    public static Handler link(Handler first, Handler... chain) {
        Handler head = first;
        for (Handler chainItem : chain) {
            head.next = chainItem;
            head = chainItem;
        }
        return first;
    }

    public abstract boolean handle(Appointment appointment) throws InterruptedException;

    protected boolean handleNext(Appointment appointment) throws InterruptedException {
        if (next == null) {
            return false; // handling failed
        }
        return next.handle(appointment);
    }

    protected static final Random rand = new Random();
    protected static boolean isSuccess() throws InterruptedException {
        Thread.sleep(2000);
        return rand.nextInt(9) >= 6; // chance 33%
    }
}
