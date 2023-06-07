package Java_Fundamentals_2023.Exercises04;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumDigits;
        boolean secondProperty;

        for (int j = 0; j <= n; j++){
            secondProperty = false;
            sumDigits = 0;

            int i = j;
            while (i > 0){
                int tempDigit = i % 10;
                sumDigits += tempDigit;
                i /= 10;
                if (tempDigit % 2 == 1){
                    secondProperty = true;
                }
            }

            if (sumDigits % 8 == 0 && secondProperty){
                System.out.println(j);
            }
        }
    }
}
