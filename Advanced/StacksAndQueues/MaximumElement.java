package Advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumElement {
    private static final int MIN_NUMBER = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();

        int prevMaxNum = 0;
        int maxNumber = MIN_NUMBER;
        for (int i = 0; i < times; i++){
            int[] command = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (command[0] == 1){
                if (maxNumber < command[1]){
                    prevMaxNum = maxNumber;
                    maxNumber = command[1];
                }
                numbersStack.push(command[1]);
            }
            if (command[0] == 2){
                if (maxNumber == numbersStack.pop()){
                    maxNumber = prevMaxNum;
                }
            }
            if (command[0] == 3){
                if (numbersStack.contains(maxNumber)){
                    System.out.println(maxNumber);
                }
            }
        }
    }
}
