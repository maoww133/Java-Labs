package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File fileF = new File("f_task3.txt");
        File fileG = new File("g_task3.txt");
        File fileH = new File("h_task3.txt");

        Random random = new Random();
        try (FileWriter writerF = new FileWriter(fileF)) {
            for (int i = 0; i < 20; i++) {
                writerF.write(random.nextInt(100) + " ");
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл f: " + e.getMessage());
            return;
        }

        try (Scanner scanner = new Scanner(fileF);
             FileWriter writerG = new FileWriter(fileG);
             FileWriter writerH = new FileWriter(fileH)) {

            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num % 12 == 0 && num % 4 != 0) {
                    writerG.write(num + " ");
                } else {
                    writerH.write(num + " ");
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка обработки файлов: " + e.getMessage());
        }

        System.out.println("Распределение чисел по файлам g_task3.txt и h_task3.txt завершено.");
    }
}