package main.products.impl.doctor;

import main.products.abs.BaseDoctor;
import main.products.impl.patient.Child;
import main.products.interfaces.Doctor;
import main.products.interfaces.Patient;

public class Pediatrician extends BaseDoctor implements Doctor {

    public Pediatrician(String name) {
        super(name);
    }

    public Pediatrician() {}


    @Override
    public String examinePatient(Patient patient) {
            return patient.doWhatDoctorSays() + " but doctor handled it";
    }
}
