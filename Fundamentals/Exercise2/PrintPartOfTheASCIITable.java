package Java_Fundamentals_2023.Exercises02;

import java.util.Scanner;

public class PrintPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        for (int i = n1; i <= n2; i++){
            System.out.printf((char)i + " ");
        }

    }
}
