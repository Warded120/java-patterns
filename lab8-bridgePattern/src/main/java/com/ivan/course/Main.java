package com.ivan.course;

import com.ivan.course.abstraction.refinedAbstraction.HeavyTraining;
import com.ivan.course.abstraction.refinedAbstraction.IntensiveTraining;
import com.ivan.course.implementation.concreteImplementation.AdvancedGymEquipment;
import com.ivan.course.implementation.concreteImplementation.BasicGymEquipment;

public class Main {
    public static void main(String[] args) {
        HeavyTraining basicHeavyTraining = new HeavyTraining(new BasicGymEquipment());
        HeavyTraining advancedHeavyTraining = new HeavyTraining(new AdvancedGymEquipment());
        IntensiveTraining basicIntensiveTraining = new IntensiveTraining(new BasicGymEquipment());
        IntensiveTraining advancedIntensiveTraining = new IntensiveTraining(new AdvancedGymEquipment());

        basicHeavyTraining.train();
        advancedHeavyTraining.train();
        basicIntensiveTraining.train();
        advancedIntensiveTraining.train();
    }
}