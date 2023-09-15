package Advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] commands = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();

        int[] allNumbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int minValue = MAX_VALUE;
        for (int i = 0; i < commands[0]; i ++){
            numbersStack.push(allNumbers[i]);
            if (minValue > allNumbers[i]){
                minValue = allNumbers[i];
            }
        }

        for (int i = 0; i < commands[1]; i ++){
            numbersStack.pop();
        }
        if (numbersStack.isEmpty()){
            System.out.print("0");
        }

        boolean isFound = false;
        while (!numbersStack.isEmpty()){
            if (numbersStack.pop() == commands[2]){
                System.out.print("true");
                isFound = true;
            }
            if (!isFound && numbersStack.isEmpty()){
                System.out.print(minValue);
                break;
            }
        }
    }
}
