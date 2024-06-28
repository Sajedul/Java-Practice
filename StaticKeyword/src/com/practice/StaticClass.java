package com.practice;

public class StaticClass {
    private static int staticVar = 10;
    private int instanceVar = 20;

    // Static nested class
    public static class StaticNestedClass {
        public void display() {
            // Can access static members of the outer class
            System.out.println("Static variable from OuterClass: " + staticVar);

            // Cannot access instance members of the outer class directly
            // System.out.println("Instance variable from OuterClass: " + instanceVar); // Compilation error
        }
    }

    // Non-static nested class (inner class)
    public class InnerClass {
        public void display() {
            // Can access both static and instance members of the outer class
            System.out.println("Static variable from OuterClass: " + staticVar);
            System.out.println("Instance variable from OuterClass: " + instanceVar);
        }
    }
}
