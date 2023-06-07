package Java_Fundamentals_2023.Exercises04;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("END")){
            int number = Integer.parseInt(input);
            int tempNumber1 = number;
            int tempNumber2 = 0;
            for (int i = input.length() - 1; i >= 0; i--){
                if (i != 0){
                    tempNumber2 += Math.pow(10, i) * (tempNumber1 % 10);
                    tempNumber1 /= 10;
                }else {
                    tempNumber2 += tempNumber1 % 10;
                }

            }

            if (tempNumber2 == number){
                System.out.println("true");
            }else {
                System.out.println("false");
            }

            input = scanner.nextLine();
        }
    }
}
