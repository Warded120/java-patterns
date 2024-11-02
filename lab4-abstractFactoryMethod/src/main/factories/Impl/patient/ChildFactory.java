package main.factories.Impl.patient;

import main.factories.interfaces.PatientFactory;
import main.products.impl.patient.Child;
import main.products.interfaces.Patient;

public class ChildFactory implements PatientFactory {
    @Override
    public Patient createPatient(String pName, float pTemp) {
        return new Child(pName, pTemp);
    }
}
