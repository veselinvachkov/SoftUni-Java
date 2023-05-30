package Java_Fundamentals_2023.Exercise03;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int biggestCount = 0;
        int temCount = 0;
        int tempNumber = 0;
        for (int i = 0; i < numbers.length; i++){
            temCount = 0;

            for (int k = i; k < numbers.length; k++){
                if (numbers[i] == numbers[k]){
                    temCount++;
                }else {
                    break;
                }
                if (biggestCount < temCount){
                    biggestCount = temCount;
                    tempNumber = numbers[k];
                }
            }
        }
        for (int i = 0; i < biggestCount; i++){
            System.out.printf("%d ", tempNumber);
        }
    }
}
