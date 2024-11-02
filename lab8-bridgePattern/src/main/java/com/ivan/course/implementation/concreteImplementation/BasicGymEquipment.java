package com.ivan.course.implementation.concreteImplementation;

import com.ivan.course.implementation.GymEquipment;

public class BasicGymEquipment implements GymEquipment {
    @Override
    public void forChest() {
        System.out.println("Use dumbbells (for better balance in muscles) or a barbell");
    }

    @Override
    public void forBack() {
        System.out.println("Use dumbbells (to train each side separately) or a barbell (to train both sides concurrently)");
    }

    @Override
    public void forBiceps() {
        System.out.println("Use dumbbells(for better balance in muscles) or a barbell");
    }

    @Override
    public void forTriceps() {
        System.out.println("Use dumbbells (to train each side separately) or a W-shaped barbell");
    }

    @Override
    public void forShoulders() {
        System.out.println("Use dumbbells");
    }

    @Override
    public void forLegs() {
        System.out.println("Use a barbell and squat");
    }
}
