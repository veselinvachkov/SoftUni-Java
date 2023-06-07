package Java_Fundamentals_2023.Exercises04;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int sum = sum(num1, num2) - num3;
        System.out.println(sum);


    }
    public static int sum(int num1, int num2){
        return num1 + num2;
    }
}
