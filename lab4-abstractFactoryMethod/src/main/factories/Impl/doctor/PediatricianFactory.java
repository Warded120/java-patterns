package main.factories.Impl.doctor;

import main.factories.interfaces.DoctorFactory;
import main.products.impl.doctor.Pediatrician;
import main.products.interfaces.Doctor;

public class PediatricianFactory implements DoctorFactory {
    @Override
    public Doctor createDoctor(String dName) {
        return new Pediatrician(dName);
    }
}
