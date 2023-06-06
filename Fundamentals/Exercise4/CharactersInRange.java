package Java_Fundamentals_2023.Exercises04;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String letter1 = scanner.nextLine();
        String letter2 = scanner.nextLine();

        charactersInBetween(letter1, letter2);

    }

    public static void charactersInBetween(String letter1, String letter2){

        int num1 = letter1.charAt(0);
        int num2 = letter2.charAt(0);

        for (int i = num1 + 1; i < num2; i++){
            char tempCharacter = (char) i;
            System.out.printf("%s ", tempCharacter);
        }
        for (int i = num2 + 1; i < num1; i++){
            char tempCharacter = (char) i;
            System.out.printf("%s ", tempCharacter);
        }
    }
}
