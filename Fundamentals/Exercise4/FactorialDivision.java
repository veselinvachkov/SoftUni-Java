package Java_Fundamentals_2023.Exercises04;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        double firstSum = calculation(num1);
        double secondSum = calculation(num2);
        double division = firstSum / secondSum;
        System.out.printf("%.2f", division);
    }

    public static double calculation(int num){
        double sum = 1.0;
        for (int i = 1; i <= num; i++){
            sum *= i;
        }
        return sum;
    }
}
