package main.factories.Impl.doctor;

import main.factories.interfaces.DoctorFactory;
import main.products.impl.doctor.RegularDoctor;
import main.products.interfaces.Doctor;

public class RegularDoctorFactory implements DoctorFactory {
    @Override
    public Doctor createDoctor(String dName) {
        return new RegularDoctor(dName);
    }
}
