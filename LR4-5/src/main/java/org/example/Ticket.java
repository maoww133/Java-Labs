package org.example;

public class Ticket {
    private String event;
    private int seatNumber;
    private double price;

    public Ticket(String event, int seatNumber, double price) {
        this.event = event;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void applyDiscount(double percent) {
        if (percent > 0 && percent <= 100) {
            this.price -= this.price * (percent / 100.0);
        }
    }

    public void displayInfo() {
        System.out.printf("Событие: %s, Место: %d, Итоговая цена: %.2f руб.%n",
                event, seatNumber, price);
    }
}