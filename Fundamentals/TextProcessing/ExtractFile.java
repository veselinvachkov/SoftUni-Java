package Java_Fundamentals_2023.TextProcessing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\\\");
        String newInput = input[input.length - 1];
        String name = newInput.split("\\.")[0];
        String extension = newInput.split("\\.")[1];

        System.out.println("File name: " + name);
        System.out.println("File extension: " + extension);

    }
}
