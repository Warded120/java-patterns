package main.creator;

import main.entity.Appointment;
import main.entity.MyEntity;

public class AppointmentCreator extends Creator {
    @Override
    public MyEntity create() {
        return new Appointment();
    }
}
