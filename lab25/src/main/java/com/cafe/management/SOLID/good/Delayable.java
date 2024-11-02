package com.cafe.management.SOLID.good;

import java.time.LocalDate;

// Interface segregation
public interface Delayable {
    void delay(LocalDate newDate);
}
