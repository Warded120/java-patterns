package main;

import main.factories.Impl.appointment.AdultAppointmentFactory;
import main.factories.Impl.appointment.ChildAppointmentFactory;
import main.factories.Impl.doctor.PediatricianFactory;
import main.factories.Impl.doctor.RegularDoctorFactory;
import main.factories.Impl.patient.AdultFactory;
import main.factories.Impl.patient.ChildFactory;
import main.system.AppointmentSystem;

public class Main {
    public static void main(String[] args) {
        AppointmentSystem adultSystem = new AppointmentSystem(new AdultAppointmentFactory(), new AdultFactory(), new RegularDoctorFactory());
        AppointmentSystem childSystem = new AppointmentSystem(new ChildAppointmentFactory(), new ChildFactory(), new PediatricianFactory());

        adultSystem.manage("Vitalii", (float) 37.9, "Dr. Smith");
        childSystem.manage("Oleg", (float) 38.9, "Dr. Paprika");
    }
}