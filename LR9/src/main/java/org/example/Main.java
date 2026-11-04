package org.example;

public class Main {
    public static void main(String[] args) {
        Plant[] plants = new Plant[5];
        plants[0] = new Tree("Дуб", 18.5, "Лиственное дерево", 12.0);
        plants[1] = new Tree("Сосна", 22.0, "Хвойное дерево", 6.5);
        plants[2] = new Tree("Береза", 14.0, "Лиственное дерево", 5.0);
        plants[3] = new Flower("Орхидея", 0.4, "Комнатный цветок", "Розовый");
        plants[4] = new Flower("Папоротник", 0.8, "Многолетник", "Зеленый");

        for (Plant plant : plants) {
            plant.displayInfo();
            System.out.print("Полив: ");
            plant.water();
            System.out.println("Требования к свету: " + plant.getLightRequirements());
        }
    }
}