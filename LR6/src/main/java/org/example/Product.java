package org.example;

public class Product {
    private String name;
    private double price;
    private int kolvo;

    public Product(String name, double price, int kolvo) {
        this.name = name;
        this.price = price;
        this.kolvo = kolvo;
    }

    public double totalCost() {
        return price * kolvo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public int getKolvo() {
        return kolvo;
    }

    public void setKolvo(int kolvo) {
        if (kolvo >= 0) {
            this.kolvo = kolvo;
        }
    }
}