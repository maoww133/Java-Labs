package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        File file = new File("f_task5.txt");
        Random random = new Random();

        try (FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < 10; i++) {
                writer.write((random.nextInt(100) + 1) + " ");
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
            return;
        }

        int count = 0;
        System.out.println("Числа из файла:");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                int val = scanner.nextInt();
                System.out.print(val + " ");
                if (val > 80) {
                    count++;
                }
            }
            System.out.println();
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
        }

        System.out.println("Количество чисел, больших 80: " + count);
    }
}