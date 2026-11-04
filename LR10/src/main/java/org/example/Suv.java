package org.example;

public class Suv implements Driveable, Parkable {
    private String brand;
    private int speed;
    private boolean parked;

    public Suv(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        this.parked = false;
    }

    @Override
    public void drive() {
        this.parked = false;
        System.out.println("Внедорожник " + brand + " едет со скоростью " + speed + " км/ч");
    }

    @Override
    public void brake() {
        this.speed = 0;
        System.out.println("Внедорожник " + brand + " затормозил. Скорость: " + speed + " км/ч");
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void park() {
        this.speed = 0;
        this.parked = true;
        System.out.println("Внедорожник " + brand + " припаркован");
    }

    @Override
    public boolean isParked() {
        return parked;
    }

    public String getBrand() {
        return brand;
    }
}