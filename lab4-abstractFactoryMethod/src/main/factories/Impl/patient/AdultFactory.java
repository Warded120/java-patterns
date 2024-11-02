package main.factories.Impl.patient;

import main.factories.interfaces.PatientFactory;
import main.products.impl.patient.Adult;
import main.products.interfaces.Patient;

public class AdultFactory implements PatientFactory {
    @Override
    public Patient createPatient(String pName, float pTemp) {
        return new Adult(pName, pTemp);
    }
}
