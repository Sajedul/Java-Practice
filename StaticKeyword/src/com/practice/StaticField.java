package com.practice;

public class StaticField {
    // A static field
    static int staticCounter = 0;

    // An instance field
    int instanceCounter = 0;

    // Constructor to increment counters
    public StaticField() {
        staticCounter++;
        instanceCounter++;
    }

}
