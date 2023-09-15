package Advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<Integer> numbersQueue = new ArrayDeque<>();

        int[] commands = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] allNumbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int minValue = MAX_VALUE;
        for (int i = 0; i < commands[0]; i++) {
            numbersQueue.offer(allNumbers[i]);
            if (minValue > allNumbers[i]) {
                minValue = allNumbers[i];
            }
        }

        for (int i = 0; i < commands[1]; i++) {
            numbersQueue.poll();
        }

        if (numbersQueue.isEmpty()) {
            System.out.print("0");
        }

        boolean isFound = false;
        while (!numbersQueue.isEmpty()) {
            if (numbersQueue.pop() == commands[2]) {
                System.out.print("true");
                isFound = true;
            }
            if (!isFound && numbersQueue.isEmpty()) {
                System.out.print(minValue);
                break;
            }
        }
    }
}
