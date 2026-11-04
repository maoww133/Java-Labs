package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private String address;
    private int students;
    private int teachers;
    private double rating;
    private List<String> studentList;

    public School(String name, String address, int students, int teachers, double rating) throws InvalidSchoolDataException {
        if (students < 0) {
            throw new InvalidSchoolDataException("Ошибка: количество студентов не может быть отрицательным (" + students + ")");
        }
        if (teachers < 0) {
            throw new InvalidSchoolDataException("Ошибка: количество учителей не может быть отрицательным (" + teachers + ")");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidSchoolDataException("Ошибка: название школы не может быть пустым");
        }
        if (rating < 0 || rating > 10) {
            throw new InvalidSchoolDataException("Ошибка: рейтинг должен быть в диапазоне от 0 до 10");
        }

        this.name = name;
        this.address = address;
        this.students = students;
        this.teachers = teachers;
        this.rating = rating;
        this.studentList = new ArrayList<>();
    }

    public void enrollStudent(String studentName) throws EnrollmentException {
        if (studentName == null || studentName.trim().isEmpty()) {
            throw new EnrollmentException("Ошибка зачисления: имя ученика не указано");
        }
        if (studentList.contains(studentName)) {
            throw new EnrollmentException("Ошибка зачисления: ученик " + studentName + " уже зачислен в школу");
        }

        studentList.add(studentName);
        students++;
        System.out.println("Ученик " + studentName + " успешно зачислен. Всего учащихся: " + students);
    }

    public void expelStudent(String studentName) throws StudentNotFoundException {
        if (!studentList.contains(studentName)) {
            throw new StudentNotFoundException("Ошибка отчисления: ученик " + studentName + " не найден в списках школы");
        }

        studentList.remove(studentName);
        students--;
        System.out.println("Ученик " + studentName + " успешно отчислен. Всего учащихся: " + students);
    }

    public void displayInfo() {
        System.out.println("Школа: " + name + ", Адрес: " + address + " , Учащихся: " + students + " , Учителей: " + teachers + " , Рейтинг: " + rating);
    }

    public int getStudents() {
        return students;
    }
}