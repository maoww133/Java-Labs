package org.example;

public class Main {
    public static void main(String[] args) {
        Product item = new Product("Ноутбук", 2450.50, 3);

        System.out.println("Товар: " + item.getName());
        System.out.printf("Цена за единицу: %.2f руб.%n", item.getPrice());
        System.out.println("Количество: " + item.getKolvo() + " шт.");

        System.out.printf("Общая стоимость: %.2f руб.%n", item.totalCost());

        item.setKolvo(5);
        item.setPrice(2300.00);

        System.out.println("Новое количество: " + item.getKolvo() + " шт.");
        System.out.printf("Новая цена: %.2f руб.%n", item.getPrice());
        System.out.printf("Новая общая стоимость: %.2f руб.%n", item.totalCost());
    }
}