package org.example;

public class Main {
    public static void main(String[] args) {
        Driveable.showDriveRules();
        System.out.println();

        Driveable[] vehicles = new Driveable[5];
        vehicles[0] = new Sedan("Toyota Camry", 90);
        vehicles[1] = new Sedan("BMW 3", 110);
        vehicles[2] = new Sedan("Audi A4", 100);
        vehicles[3] = new Suv("Toyota Land Cruiser", 80);
        vehicles[4] = new Suv("BMW X5", 95);

        for (Driveable v : vehicles) {
            v.drive();
            System.out.println("Текущая скорость: " + v.getSpeed() + " км/ч");
            v.brake();

            if (v instanceof Parkable p) {
                p.park();
                System.out.println("Статус парковки (isParked): " + p.isParked());
            }
        }
    }
}