package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        File file = new File("cpu_temp.txt");
        Scanner console = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Введите 15 вещественных значений температуры процессора (например, 45.5):");
        try (FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < 15; i++) {
                System.out.print("Значение " + (i + 1) + ": ");
                double temp = console.nextDouble();
                writer.write(temp + " ");
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
            return;
        }

        double sum = 0.0;
        int count = 0;
        try (Scanner fileScanner = new Scanner(file).useLocale(Locale.US)) {
            while (fileScanner.hasNextDouble()) {
                sum += fileScanner.nextDouble();
                count++;
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
        }

        if (count > 0) {
            double average = sum / count;
            System.out.printf(Locale.US, "\nСчитано значений: %d. Средняя температура процессора: %.2f °C\n", count, average);
        }
    }
}