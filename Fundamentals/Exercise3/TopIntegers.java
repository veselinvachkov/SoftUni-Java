package Java_Fundamentals_2023.Exercise03;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();



        for (int i = 0; i < numbers.length; i++){
            int strongNum = numbers[i];
            boolean isBugger = true;

            for (int j = i + 1; j < numbers.length; j++){
                int numberAfter = numbers[j];
                if (strongNum <= numberAfter){
                    isBugger = false;
                    break;
                }
            }
            if (isBugger){
                System.out.printf("%d ", strongNum);
            }

        }
    }
}
