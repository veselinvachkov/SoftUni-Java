package Java_Fundamentals_2023.Exercises01;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= num; i++){
            for (int j = i; j > 0; j--){
                System.out.printf("%d ", i);
            }
            System.out.println();
        }
    }
}
