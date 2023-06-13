package Java_Fundamentals_2023.Exercises05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> arr1 = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> arr2 = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (arr1.size() != 0 && arr2.size() != 0){
            int firstPlayerCard = arr1.get(0);
            int secondPlayerCard = arr2.get(0);
            arr1.remove(0);
            arr2.remove(0);

            if (firstPlayerCard > secondPlayerCard) {
                arr1.add(firstPlayerCard);
                arr1.add(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                arr2.add(secondPlayerCard);
                arr2.add(firstPlayerCard);
            }
        }
        if (arr1.size() == 0){
            int sum = 0;
            for (int i = 0; i < arr2.size(); i++){
                sum += arr2.get(i);
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
        if (arr2.size() == 0){
            int sum = 0;
            for (int i = 0; i < arr1.size(); i++){
                sum += arr1.get(i);
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }
    }
}
