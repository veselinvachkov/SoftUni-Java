package Java_Fundamentals_2023.Exercise03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")){
            if (command[0].equals("swap")){
                int tempNum = numbers[Integer.parseInt(command[1])];
                numbers[Integer.parseInt(command[1])] = numbers[Integer.parseInt(command[2])];
                numbers[Integer.parseInt(command[2])] = tempNum;
            }
            if (command[0].equals("multiply")){
                int sum = numbers[Integer.parseInt(command[1])] * numbers[Integer.parseInt(command[2])];
                numbers[Integer.parseInt(command[1])] = sum;
            }
            if (command[0].equals("decrease")){
                for (int i = 0; i < numbers.length; i++){
                    numbers[i]--;
                }
            }
            command = scanner.nextLine().split(" ");
        }
        for (int i = 0; i < numbers.length; i++){
            System.out.printf("%d", numbers[i]);
            if (i < numbers.length - 1){
                System.out.print(", ");
            }
        }
    }
}
