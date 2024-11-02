package com.ivan.course.abstraction;

import com.ivan.course.implementation.GymEquipment;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Training {

    protected GymEquipment equipment;

    protected abstract void trainChest();
    protected abstract void trainBack();
    protected abstract void trainBiceps();
    protected abstract void trainTriceps();
    protected abstract void trainShoulders();
    protected abstract void trainLegs();

    public void train() {
        System.out.println("-------------------------------------------------------");
        trainChest();
        trainBack();
        trainBiceps();
        trainTriceps();
        trainShoulders();
        trainLegs();
        System.out.println("-------------------------------------------------------");
    }
}
