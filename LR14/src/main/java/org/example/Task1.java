package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("app_info.txt");

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Название: Telegram\n");
            writer.write("Категория: Мессенджер и социальная платформа\n");
            writer.write("Разработчик: Павел Дуров\n");
            writer.write("Особенности: Сквозное шифрование, каналы, боты и облачное хранилище.\n");
            System.out.println("Файл успешно записан.\n");
        } catch (IOException e) {
            System.err.println("Ошибка записи файла: " + e.getMessage());
        }

        System.out.println("Имя файла: " + file.getName());
        System.out.println("Абсолютный путь: " + file.getAbsolutePath());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Существует: " + file.exists());
        System.out.println("Доступен для чтения: " + file.canRead());
        System.out.println("Доступен для записи: " + file.canWrite());
        System.out.println();


        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}