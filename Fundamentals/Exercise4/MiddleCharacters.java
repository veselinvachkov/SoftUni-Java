package Java_Fundamentals_2023.Exercises04;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int length = input.length();
        middle(input, length);
    }

    public static void middle(String input, int length){

        if(length % 2 == 0){
            System.out.print(input.charAt(length/2 - 1));
            System.out.print(input.charAt(length/2));
        }else {
            System.out.println(input.charAt((int) Math.floor((double) length/2)));
        }
    }
}
