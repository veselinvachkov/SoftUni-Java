package Java_Fundamentals_2023.Exercises01;

import java.util.Scanner;

public class PrintTheSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (number1 <= number2){
            System.out.printf("%d ",number1);
            sum += number1;
            number1++;
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
