import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Символы строки в столбик через цикл for");
        System.out.println("2. Извлечение имени пользователя из email");
        System.out.println("3. Отчет по сотрудникам");
        System.out.println("4. Регулярные выражения (четное количество цифр между 'a')");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> {
                String text = "JavaDeveloper";
                System.out.println("Исходная строка: " + text);
                System.out.println("Результат:");
                for (int i = 0; i < text.length(); i++) {
                    System.out.println(text.charAt(i));
                }
            }

            case 2 -> {
                //String email = "user@domain.com";
                String email = scanner.nextLine();
                String username = email.substring(0, email.indexOf('@'));
                System.out.println("Имя пользователя: " + username);
            }

            case 3 -> {
                Employee[] employees = {
                        new Employee("Иванов И.И.", 1250.50),
                        new Employee("Петров П.П.", 890.00),
                        new Employee("Сидорова А.С.", 2400.755),
                        new Employee("Ковалев В.Н.", 1500.20)
                };

                Report.generateReport(employees);
            }

            case 4 -> {
                String input = "a1a a12a a123a a1234a a12345a";
                System.out.println("Исходная строка: " + input);

                String regex = "\\ba(\\d{2})+a\\b";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(input);

                System.out.println("Найденные подстроки:");
                boolean found = false;
                while (matcher.find()) {
                    System.out.println(matcher.group());
                    found = true;
                }

                if (!found) {
                    System.out.println("Совпадений нет");
                }
            }

            default -> System.out.println("Введите число от 1 до 4");
        }

        scanner.close();
    }
}

class Employee {
    private String fullname;
    private double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }
}

class Report {
    public static void generateReport(Employee[] employees) {
        System.out.printf("%-15s | %15s%n", "Сотрудник", "Зарплата");

        for (Employee emp : employees) {
            System.out.printf("%-15s | %15.2f%n", emp.getFullname(), emp.getSalary());
        }
    }
}