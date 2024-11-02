package main.creator;

import main.entity.MyEntity;
import main.entity.Patient;

public class PatientCreator extends Creator {

    @Override
    public MyEntity create() {
        return new Patient();
    }
}
