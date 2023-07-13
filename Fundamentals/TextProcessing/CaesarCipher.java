package Java_Fundamentals_2023.TextProcessing;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < input.length(); i++){
            char symbol = input.charAt(i);
            int currentNum = symbol + 3;

            char newSymbol = (char) currentNum;
            text.append(newSymbol);
        }
        System.out.println(text);
    }
}
