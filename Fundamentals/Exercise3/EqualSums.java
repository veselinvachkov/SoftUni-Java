package Java_Fundamentals_2023.Exercise03;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean isEqual = false;

        for (int i = 0; i < numbers.length; i++){
            int leftSum = 0;
            int rightSum = 0;

            for (int j = i + 1; j < numbers.length; j++){
                rightSum += numbers[j];
            }
            for (int k = 0; k < i; k++){
                leftSum += numbers[k];
            }

            if (leftSum == rightSum){
                System.out.printf("%d", i);
                isEqual = true;
                break;
            }
        }
        if (!isEqual){
            System.out.println("no");
        }
    }
}
