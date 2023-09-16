package Advanced.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int[] numbers = Arrays
                .stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        for (int i = 0; i < numbers[0]; i++){
            int[] num = Arrays
                    .stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int j = 0; j < num.length; j++){
                sum += num[j];
            }
        }

        System.out.println(sum);
    }
}
