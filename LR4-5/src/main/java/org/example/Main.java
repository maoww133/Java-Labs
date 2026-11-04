package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Билет со скидкой");
        System.out.println("2 - Массив гор");
        System.out.println("3 - Фильтрация книг по Enum Language");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                Ticket ticket = new Ticket("Концерт оркестра", 42, 120.0);
                System.out.println("Информация о билете до скидки:");
                ticket.displayInfo();

                ticket.applyDiscount(15);
                System.out.println("\nИнформация о билете после скидки:");
                ticket.displayInfo();
            }

            case 2 -> {
                Mountain[] mountains = {
                        new Mountain("Эверест", 8848.86, "Китай"),
                        new Mountain("Чогори", 8611.0, "Китай"),
                        new Mountain("Канченджанга", 8586.0, "Индия"),
                        new Mountain("Эльбрус", 5642.0, "Россия"),
                        new Mountain("Монблан", 4808.0, "Франция"),
                        new Mountain("Килиманджаро", 5895.0, "Танзания")
                };

                System.out.println("Список всех гор:");
                for (Mountain m : mountains) {
                    System.out.printf("- %-15s | Высота: %7.2f м | Страна: %s%n",
                            m.getName(), m.getHeight(), m.getCountry());
                }

                Mountain highest = mountains[0];
                double totalHeight = 0;

                for (Mountain m : mountains) {
                    if (m.getHeight() > highest.getHeight()) {
                        highest = m;

                    }
                    totalHeight += m.getHeight();
                }

                double averageHeight = totalHeight / mountains.length;

                System.out.println("\nРезультаты:");
                System.out.printf("Самая высокая гора: %s (%.2f м)%n", highest.getName(), highest.getHeight());
                System.out.println(highest);
                System.out.printf("Средняя высота всех гор: %.2f м%n", averageHeight);
            }

            case 3 -> {
                Book[] books = {
                        new Book("Война и мир", Language.RUSSIAN),
                        new Book("1984", Language.ENGLISH),
                        new Book("Маленький принц", Language.FRENCH),
                        new Book("Убить пересмешника", Language.ENGLISH),
                        new Book("Фауст", Language.GERMAN)
                };

                System.out.println("Книги на английском языке:");
                for (Book b : books) {
                    if (b.getLanguage() == Language.ENGLISH) {
                        System.out.println(b.getTitle());
                    }
                }
            }

            default -> System.out.println("Выберите от 1 до 3.");
        }

        scanner.close();
    }

    }
