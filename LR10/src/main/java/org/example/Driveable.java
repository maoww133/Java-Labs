package org.example;

public interface Driveable {
    void drive();
    void brake();
    int getSpeed();

    static void showDriveRules() {
        System.out.println("ПДД: соблюдайте скоростной режим и дистанцию.");
    }
}