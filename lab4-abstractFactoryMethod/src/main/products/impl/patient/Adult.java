package main.products.impl.patient;

import main.products.abs.BasePatient;
import main.products.interfaces.Patient;

public class Adult extends BasePatient implements Patient {
    public Adult(String name, float symptom) {
        super(name, symptom);
    }

    public Adult() {}

    @Override
    public String doWhatDoctorSays() {
        return this.name + " obediently does what doctor says...";
    }

    @Override
    public String howDoIFeel() {
        if(temperature >= 39.2)
            return this.getName() + " feels very bad";
        else if (temperature >= 37.2)
            return this.getName() + " feels not very good";
        else
            return this.getName() + " feels good";
    }
}
