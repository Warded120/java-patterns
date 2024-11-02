package com.ivan.course.implementation.concreteImplementation;

import com.ivan.course.implementation.GymEquipment;

public class AdvancedGymEquipment implements GymEquipment {
    @Override
    public void forChest() {
        System.out.println("Use hammer machine chest press");
    }

    @Override
    public void forBack() {
        System.out.println("Use vertical/horizontal row machine");
    }

    @Override
    public void forBiceps() {
        System.out.println("Use scott's bench");
    }

    @Override
    public void forTriceps() {
        System.out.println("Use crossovers (top part)");
    }

    @Override
    public void forShoulders() {
        System.out.println("Use crossovers (bottom part)");
    }

    @Override
    public void forLegs() {
        System.out.println("Use leg press machine");
    }
}
