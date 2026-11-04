package org.example;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println("Попытка создать школу с отрицательным числом студентов:");
            School invalidSchool = new School("Гимназия №1", "ул. Ленина, 15", -50, 20, 9.2);
        } catch (InvalidSchoolDataException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        } finally {
            System.out.println("Блок finally: проверка инициализации завершена.\n");
        }

        School school = null;
        try {
            school = new School("Средняя школа № 42", "пр-т Победителей, 10", 0, 35, 8.7);
            school.displayInfo();
            System.out.println();
        } catch (InvalidSchoolDataException e) {
            System.out.println("Ошибка создания: " + e.getMessage());
            return;
        }

        try {
            school.enrollStudent("Иван Иванов");
            school.enrollStudent("Мария Петрова");

            System.out.println("\nПопытка повторного зачисления:");
            school.enrollStudent("Иван Иванов");
        } catch (EnrollmentException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        } finally {
            System.out.println("Блок finally: этап зачисления завершен.\n");
        }

        try {
            school.expelStudent("Мария Петрова");

            System.out.println("\nПопытка отчислить отсутствующего ученика:");
            school.expelStudent("Алексей Сидоров");
        } catch (StudentNotFoundException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        } finally {
            System.out.println("Блок finally: этап отчисления завершен.\n");
        }

        school.displayInfo();
    }
}