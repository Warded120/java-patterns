package main.products.impl.patient;

import main.products.abs.BasePatient;
import main.products.interfaces.Patient;

public class Child extends BasePatient implements Patient {

    public Child(String name, float symptom) {
        super(name, symptom);
    }

    public Child() {}

    @Override
    public String doWhatDoctorSays() {
            return this.name + " doesn't want to do what doctor says";
    }

    @Override
    public String howDoIFeel() {
        if(temperature >= 38.5)
            return this.name + " feels very bad";
        else if(temperature >= 37)
            return this.name + " feels not very good";
        else
            return this.name + " feels good";
    }
}
