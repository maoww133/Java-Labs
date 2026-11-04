import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Выберите задание:");
        System.out.println("1 - Задание 1 (Случайный массив, поиск элементов с двумя искомыми цифрами)");
        System.out.println("2 - Задание 2 (Случайная матрица, элементы равные сумме индексов)");
        System.out.print("Введите номер: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                int size = 10 + random.nextInt(6);
                int[] arr = new int[size];

                for (int i = 0; i < arr.length; i++) {
                    arr[i] = 10 + random.nextInt(990);
                }

                int targetDigit = Math.abs(arr[0]) % 10;
                System.out.println("Размер массива: " + size);
                System.out.println("Первый элемент: " + arr[0] + "  .Искомая цифра: " + targetDigit);

                System.out.print("Элементы массива: ");
                for (int x : arr) {
                    System.out.print(x + " ");
                }
                System.out.println();

                System.out.println("\nРезультаты (порядковые номера с 1):");
                boolean foundAny = false;
                for (int i = 0; i < arr.length; i++) {
                    int count = countDigitOccurrences(arr[i], targetDigit);

                    if (count == 2) {
                        System.out.printf("Порядковый номер: %d (индекс %d), Значение: %d%n", (i + 1), i, arr[i]);
                        foundAny = true;
                    }
                }

                if (!foundAny) {
                    System.out.println("Элементов, содержащих цифру " + targetDigit + " ровно 2 раза, не найдено.");
                }
            }

            case 2 -> {
                int rows = 4;
                int cols = 5;
                int[][] matrix = new int[rows][cols];

                int maxIndexSum = (rows - 1) + (cols - 1);
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        matrix[i][j] = random.nextInt(maxIndexSum + 2);
                    }
                }


                System.out.println("Сгенерированная матрица:");
                for (int[] row : matrix) {
                    for (int val : row) {
                        System.out.printf("%3d ", val);
                    }
                    System.out.println();
                }

                System.out.println("\nЭлементы, совпадающие с суммой их индексов (matrix[i][j] == i + j):");
                boolean found = false;
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (matrix[i][j] == (i + j)) {
                            System.out.printf("Элемент [%d][%d] = %d (сумма индексов: %d + %d = %d)%n",
                                    i, j, matrix[i][j], i, j, (i + j));
                            found = true;
                        }
                    }
                }

                if (!found) {
                    System.out.println("Совпадений не найдено.");
                }
            }

            default -> System.out.println("Введите 1 или 2.");
        }

        scanner.close();
    }

    // Подсчет вхождений искомой цифры в числе
    private static int countDigitOccurrences(int number, int targetDigit) {
        int num = Math.abs(number);
        if (num == 0) {
            return targetDigit == 0 ? 1 : 0;
        }

        int count = 0;
        while (num > 0) {
            if (num % 10 == targetDigit) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}