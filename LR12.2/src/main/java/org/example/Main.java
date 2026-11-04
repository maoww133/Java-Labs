package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void printPsychologists(List<Psychologist> psychologists, int rating) {
        System.out.println("Психологи с рейтингом = " + rating);
        for (Psychologist p : psychologists) {
            if (p.getRating() == rating) {
                System.out.println(p);
            }
        }
    }

    public static void main(String[] args) {
        List<Psychologist> psychologists = new ArrayList<>();

        psychologists.add(new Psychologist(1, "Анна Смирнова", "Семейный психолог", 4, Arrays.asList(5, 5, 4, 5)));       // ср = 4.75
        psychologists.add(new Psychologist(2, "Борис Кузнецов", "Гештальт-терапевт", 3, Arrays.asList(4, 4, 4, 4)));      // ср = 4.00
        psychologists.add(new Psychologist(3, "Владислав Волков", "Когнитивно-поведенческий", 2, Arrays.asList(2, 3, 3))); // ср = 2.67
        psychologists.add(new Psychologist(4, "Дарья Морозова", "Детский психолог", 3, Arrays.asList(5, 4, 5, 5)));       // ср = 4.75
        psychologists.add(new Psychologist(5, "Елена Васильева", "Клинический психолог", 3, Arrays.asList(3, 4, 3, 4)));   // ср = 3.50

        System.out.println("1. Психологи со средним рейтингом > 3:");
        for (Psychologist p : psychologists) {
            if (p.getAverageRating() > 3.0) {
                System.out.println(p);
            }
        }

        System.out.println("\n2. Повышение рейтинга психологов со ср. рейтингом >= 4:");
        for (Psychologist p : psychologists) {
            if (p.getAverageRating() >= 4.0) {
                p.setRating(p.getRating() + 1);
                System.out.println("Повышен рейтинг для: " + p.getName() + " -> Новый рейтинг: " + p.getRating());
            }
        }

        System.out.println("\n3. Метод printPsychologists:");
        printPsychologists(psychologists, 4);

        System.out.println("\n4. Упорядоченный список (по убыванию среднего рейтинга, при совпадении по имени):");
        psychologists.sort(Comparator
                .comparingDouble(Psychologist::getAverageRating)
                .reversed()
                .thenComparing(Psychologist::getName));

        for (Psychologist p : psychologists) {
            System.out.printf("ID: %d , Имя: %-18s , Средний рейтинг: %.2f\n",
                    p.getId(), p.getName(), p.getAverageRating());
        }
    }
}