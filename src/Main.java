import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int size = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер таблицы умножения:");
        size = scanner.nextInt();
    //    Random random = new Random();

        int[] [] numbers = new int[size] [size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                numbers[i][j] = (i + 1) * (j + 1);
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
       size /= 2;
        //numbers = new int [size] [size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                numbers[i][j] = (i + 1) * (j + 1);
                System.out.print(numbers[i][j] + " ");
            }

        }

    }

}

/* Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int n = scanner.nextInt();

*/