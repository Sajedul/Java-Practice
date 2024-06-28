package com.practice;

public class Main {
    public static void main(String[] args) {

        StaticField obj1 = new StaticField();
        StaticField obj2 = new StaticField();
        StaticField obj3 = new StaticField();

        // Accessing static field
        System.out.println("Static Counter: " + StaticField.staticCounter); // Output: 3

        // Accessing instance fields
        System.out.println("Instance Counter of obj1: " + obj1.instanceCounter); // Output: 1
        System.out.println("Instance Counter of obj2: " + obj2.instanceCounter); // Output: 1
        System.out.println("Instance Counter of obj3: " + obj3.instanceCounter); // Output: 1

        //calling static method without creating object
        StaticMethod.staticMethod();
        // we do not able to call staticMethod.instanceMethod()
        // we need to create object to call non-static method
        StaticMethod obj = new StaticMethod();
        obj.instanceMethod();


        // Creating an instance of the static nested class
        StaticClass.StaticNestedClass staticNested = new StaticClass.StaticNestedClass();
        staticNested.display();

        // Creating an instance of the outer class
        StaticClass outer = new StaticClass();

        // Creating an instance of the non-static nested class (inner class)
        StaticClass.InnerClass inner = outer.new InnerClass();
        inner.display();

        //StaticMethodOverriding ??

        }

}