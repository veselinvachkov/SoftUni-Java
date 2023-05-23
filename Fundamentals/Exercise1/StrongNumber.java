package Java_Fundamentals_2023.Exercises01;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int oldNum = num;

        int sum = 1;
        int sum1 = 0;

        while (num > 0) {
            int temp = num % 10;
            num = num / 10;
            while (temp > 0) {
                sum = temp * sum;
                temp--;
            }

            sum1+= sum;
            sum = 1;

        }
        if (oldNum == sum1){
            System.out.print("yes");
        }else {
            System.out.print("no");
        }
    }
}
