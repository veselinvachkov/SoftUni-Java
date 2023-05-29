package Java_Fundamentals_2023.Exercise03;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++){
            numbers[i] = Integer.parseInt(scanner.nextLine());
            sum += numbers[i];
        }
        for (int i = 0; i < n; i++){
            System.out.printf("%d ", numbers[i]);
        }
        System.out.printf("\n%d", sum);
    }
}
