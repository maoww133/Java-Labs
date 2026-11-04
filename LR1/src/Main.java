import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задание 1");
        System.out.print("Введите катет a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите катет b: ");
        double b = scanner.nextDouble();

        double c = Math.sqrt(a * a + b * b);
        System.out.printf("Гипотенуза c = %.2f\n\n", c);

        System.out.println("Задание 2");
        System.out.print("Введите целое число для проверки: ");
        int n = scanner.nextInt();

        if (n % 3 == 0 || n % 7 == 0) {
            System.out.println("Число " + n + " кратно 3 или 7.\n");
        } else {
            System.out.println("Число " + n + " НЕ кратно ни 3, ни 7.\n");
        }

        System.out.println("Задание 3");
        System.out.print("Введите целое неотрицательное число: ");
        int num = scanner.nextInt();

        if (num == 0) {
            System.out.println("Двоичное представление: 0");
        } else {
            int temp = num;
            String binary = "";
            while (temp > 0) {
                int rem = temp % 2;
                binary = rem + binary;
                temp = temp / 2;
            }
            System.out.println("Двоичное представление: " + binary);
        }

        scanner.close();
    }
}