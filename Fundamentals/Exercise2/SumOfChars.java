package Java_Fundamentals_2023.Exercises02;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (n > 0){
            int tempInt = scanner.nextLine().charAt(0);
            sum += tempInt;
            n--;
        }

        System.out.printf("The sum equals: %d", sum);
    }
}
