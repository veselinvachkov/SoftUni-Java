package Java_Fundamentals_2023.Exercises04;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        vowelsCount(input);
    }

    public static void vowelsCount(String input){
        String[] arr1 = input.split("");
        int count = 0;
        for (int i = 0; i < input.length(); i++){
            if (arr1[i].equals("a") || arr1[i].equals("e") || arr1[i].equals("i") || arr1[i].equals("o") || arr1[i].equals("u")){
                count++;
            }
            if (arr1[i].equals("A") || arr1[i].equals("E") || arr1[i].equals("I") || arr1[i].equals("O") || arr1[i].equals("U")){
                count++;
            }
        }
        System.out.println(count);
    }
}
