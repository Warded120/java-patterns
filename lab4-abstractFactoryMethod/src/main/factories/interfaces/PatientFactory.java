package main.factories.interfaces;

import main.products.interfaces.Patient;

public interface PatientFactory {
    Patient createPatient(String pName, float pTemp);
}
