package com.ivan.course.abstraction.refinedAbstraction;

import com.ivan.course.abstraction.Training;
import com.ivan.course.implementation.GymEquipment;

public class IntensiveTraining extends Training {

    public IntensiveTraining(GymEquipment equipment) {
        super(equipment);
    }

    @Override
    public void trainChest() {
        System.out.println("Intensive Chest training");
        System.out.println("4 sets, 12-16 reps, 2:30 break");
        equipment.forChest();
    }

    @Override
    public void trainBack() {
        System.out.println("Intensive Back training");
        System.out.println("4 sets, 12-16 reps, 2:30 break");
        equipment.forBack();
    }

    @Override
    public void trainBiceps() {
        System.out.println("Intensive Biceps training");
        System.out.println("4 sets, 12-16 reps, 2:00 break");
        equipment.forBiceps();
    }

    @Override
    public void trainTriceps() {
        System.out.println("Intensive Triceps training");
        System.out.println("4 sets, 12-16 reps, 2:00 break");
        equipment.forTriceps();
    }

    @Override
    public void trainShoulders() {
        System.out.println("Intensive Shoulders training");
        System.out.println("drop-set: 4 sets, 20-30 reps, 2:00 break");
        equipment.forShoulders();
    }

    @Override
    public void trainLegs() {
        System.out.println("Intensive Legs training");
        System.out.println("super-set: 4 sets, 12-16 reps, 3:00 break");
        equipment.forLegs();
        useTreadmill();
    }

    private void useTreadmill() {
        System.out.println("run on a treadmill after main exercise");
    }
}
