package Java_Fundamentals_2023.Exercises02;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        int number = Integer.parseInt(scanner.nextLine());
        while (number > 0){
            int tempNum = number % 10;
            number = number / 10;
            sum+=tempNum;
        }
        System.out.println(sum);
    }
}
