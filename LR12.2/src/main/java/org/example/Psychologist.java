package org.example;

import java.util.List;

public class Psychologist {
    private int id;
    private String name;
    private String specialization;
    private int rating;
    private List<Integer> clientRatings;

    public Psychologist(int id, String name, String specialization, int rating, List<Integer> clientRatings) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.rating = rating;
        this.clientRatings = clientRatings;
    }

    public double getAverageRating() {
        if (clientRatings == null || clientRatings.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (int r : clientRatings) {
            sum += r;
        }
        return sum / clientRatings.size();
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public List<Integer> getClientRatings() {
        return clientRatings;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Имя: " + name + ", Специализация: " + specialization +
                ", Рейтинг: " + rating + String.format(", Средний балл: %.2f", getAverageRating());
    }
}