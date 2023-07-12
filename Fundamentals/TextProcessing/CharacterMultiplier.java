package Java_Fundamentals_2023.TextProcessing;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] names = input.split("\\s+");

        String firstText = names[0];
        String secondText = names[1];

        int minLength = Math.min(firstText.length(), secondText.length());
        int maxLength = Math.max(firstText.length(), secondText.length());

        int sum = 0;
        for (int index = 0; index < minLength; index++) {
            sum += (firstText.charAt(index) * secondText.charAt(index));
        }

        if (maxLength == minLength) {
            System.out.println(sum);
            return;
        }

        sum = getLeftSymbols(firstText, secondText, minLength, maxLength, sum);

        System.out.println(sum);

    }

    private static int getLeftSymbols(String firstText, String secondText, int minLength, int maxLength, int sum) {
        if (maxLength == firstText.length()) {
            for (int index = minLength; index < firstText.length(); index++) {
                sum += firstText.charAt(index);
            }
        } else {
            for (int index = minLength; index < secondText.length(); index++) {
                sum += secondText.charAt(index);
            }
        }
        return sum;
    }
}