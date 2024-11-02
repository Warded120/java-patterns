package com.ivan.course.pureFabrication;

import java.util.Random;

// Pure fabrication
public class Rand {
    private final static Random random = new Random();

    public static boolean random(double probability) {
        if (probability < 0 || probability > 1) {
            throw new IllegalArgumentException("Probability must be between 0 and 1");
        }
        return random.nextDouble() < probability;
    }

}
