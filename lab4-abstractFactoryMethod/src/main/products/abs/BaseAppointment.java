package main.products.abs;

import main.products.impl.doctor.RegularDoctor;
import main.products.impl.patient.Adult;
import main.products.interfaces.Doctor;
import main.products.interfaces.Patient;

public class BaseAppointment {
    protected Patient patient;
    protected Doctor doctor;
    protected String diagnose;

    public BaseAppointment(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
        this.diagnose = "no diagnose currently";
    }

    public BaseAppointment() {
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }
}
