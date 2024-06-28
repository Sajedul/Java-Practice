package org.rahatcode.Inheritance;

public class Bird extends Animal {

    private int wings;

    public Bird(String name, String color, int lage, boolean hastale, int wings) {
        super(name, color, lage, hastale);
        this.wings = wings;
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println("eating finished");
    }

    public void fly()
    {
        System.out.println(this.getName() + "is flying");
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
}
