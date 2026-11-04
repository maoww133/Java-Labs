package org.example;

public class Mountain {
    private String name;
    private double height;
    private String country;

    public Mountain(String name, double height, String country) {
        this.name = name;
        this.height = height;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
    return name +" " + height + " " + country;
    }
}