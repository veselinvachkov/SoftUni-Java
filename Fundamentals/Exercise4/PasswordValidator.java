package Java_Fundamentals_2023.Exercises04;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int validationsCount = 0;

        String input = scanner.nextLine();
        int length = input.length();

        validationsCount += lengthValidation(length);
        validationsCount += characterValidation(input, length);
        validationsCount += digitValidation(input, length);

        if (validationsCount == 3){
            System.out.println("Password is valid");
        }
    }

    public static int digitValidation(String input, int length){
        int count = 0;
        for (int i = 0; i < length; i++){
            if (Character.isDigit(input.charAt(i))){
                count++;
            }
        }
        if (count < 2){
            System.out.println("Password must have at least 2 digits");
            return 0;
        } else {
            return 1;
        }
    }
    public static int lengthValidation(int length){
        if (length < 6 || length > 10){
            System.out.println("Password must be between 6 and 10 characters");
            return 0;
        }else {
            return 1;
        }
    }
    public static int characterValidation(String input, int length){

        for (int i = 0; i < length; i++){
            if (!Character.isLetterOrDigit(input.charAt(i))){
                System.out.println("Password must consist only of letters and digits");
                return 0;
            }
        }
        return 1;
    }
}
