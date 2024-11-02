package main.factories.interfaces;

import main.products.interfaces.Doctor;

public interface DoctorFactory {
    Doctor createDoctor(String dName);
}
