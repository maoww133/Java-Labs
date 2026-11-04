package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File fileF = new File("f_task2.txt");
        Scanner console = new Scanner(System.in);

        System.out.println("Введите 10 целых чисел:");
        try (FileWriter writer = new FileWriter(fileF)) {
            for (int i = 0; i < 10; i++) {
                System.out.print("Число " + (i + 1) + ": ");
                int number = console.nextInt();
                writer.write(number + " ");
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
            return;
        }

        System.out.println("\nЧисла из файла:");
        int count = 0;
        try (Scanner fileScanner = new Scanner(fileF)) {
            while (fileScanner.hasNextInt()) {
                int val = fileScanner.nextInt();
                System.out.print(val + " ");

                if (val % 10 == 0 && val % 5 != 0) {
                    count++;
                }
            }
            System.out.println();
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
        }

        System.out.println("Количество чисел, кратных 10 и не кратных 5: " + count);
        System.out.println("(Пояснение: любое целое число, делящееся на 10, делится и на 5, поэтому таких чисел 0)");
    }
}