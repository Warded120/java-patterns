package com.ivan.course.abstraction.refinedAbstraction;

import com.ivan.course.abstraction.Training;
import com.ivan.course.implementation.GymEquipment;

public class HeavyTraining extends Training {

    public HeavyTraining(GymEquipment equipment) {
        super(equipment);
    }

    @Override
    public void trainChest() {
        System.out.println("Heavy Chest training");
        System.out.println("3 sets, 6-8 reps, 3:00 break");
        equipment.forChest();
    }

    @Override
    public void trainBack() {
        System.out.println("Heavy Back training");
        System.out.println("4 sets, 6-8 reps, 3:00 break");
        equipment.forBack();
    }

    @Override
    public void trainBiceps() {
        System.out.println("Heavy Biceps training");
        System.out.println("3 sets, 10 reps, 2:30 break");
        equipment.forBiceps();
    }

    @Override
    public void trainTriceps() {
        System.out.println("Heavy Triceps training");
        System.out.println("3 sets, 8 reps, 2:30 break");
        equipment.forTriceps();
    }

    @Override
    public void trainShoulders() {
        System.out.println("Heavy Shoulders training");
        System.out.println("3 sets, 6-8 reps, 2:30 break");
        equipment.forShoulders();
    }

    @Override
    public void trainLegs() {
        System.out.println("Heavy Legs training");
        System.out.println("5 sets, 8-12 reps, 4:00 break");
        equipment.forLegs();
    }
}
