package org.example;

public class Sedan implements Driveable, Parkable {
    private String brand;
    private int speed;
    private boolean parked;

    public Sedan(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        this.parked = false;
    }

    @Override
    public void drive() {
        this.parked = false;
        System.out.println("Седан " + brand + " едет со скоростью " + speed + " км/ч");
    }

    @Override
    public void brake() {
        this.speed = 0;
        System.out.println("Седан " + brand + " затормозил. Скорость: " + speed + " км/ч");
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void park() {
        this.speed = 0;
        this.parked = true;
        System.out.println("Седан " + brand + " припаркован на стоянке");
    }

    @Override
    public boolean isParked() {
        return parked;
    }

    public String getBrand() {
        return brand;
    }
}