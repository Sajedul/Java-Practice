package org.rahatcode.Inheritance;

public class Animal {
    private String name;
    private String color;
    private  int lage;
    private  boolean hastale;

    public Animal(String name, String color, int lage, boolean hastale) {
        this.name = name;
        this.color = color;
        this.lage = lage;
        this.hastale = hastale;
    }

    public void eat (String food)
    {
        System.out.println("Eating" + food);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLage() {
        return lage;
    }

    public void setLage(int lage) {
        this.lage = lage;
    }

    public boolean isHastale() {
        return hastale;
    }

    public void setHastale(boolean hastale) {
        this.hastale = hastale;
    }
}
