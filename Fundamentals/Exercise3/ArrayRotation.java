package Java_Fundamentals_2023.Exercise03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++){
            int tempNum = numbers[0];
            for (int index = 0; index < numbers.length - 1; index++){
                numbers[index] = numbers[index + 1];
            }
            numbers[numbers.length-1] = tempNum;
        }
        for (int i = 0; i < numbers.length; i++){
            System.out.printf("%d ", numbers[i]);
        }


    }
}
