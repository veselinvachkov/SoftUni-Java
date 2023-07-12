package Java_Fundamentals_2023.TextProcessing;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        for (String word : input) {
            if (isValidUsername(word)){
                System.out.println(word);
            }
        }

    }

    public static boolean isValidUsername(String word){
        if (word.length() < 3 || word.length() > 16){
            return false;
        }

        for (char symbol : word.toCharArray()) {
            if (!Character.isLetter(symbol) && symbol!= '-' && symbol != '_'){
                return false;
            }
        }
        return true;
    }
}
