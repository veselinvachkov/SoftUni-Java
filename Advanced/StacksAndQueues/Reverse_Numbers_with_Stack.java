package Advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Reverse_Numbers_with_Stack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] numbersArr = scanner.nextLine().split(" ");

        ArrayDeque<Integer> numStack = new ArrayDeque<>();

        for (int i = 0; i < numbersArr.length; i ++){
            numStack.push(Integer.parseInt(numbersArr[i]));
        }
        while (!numStack.isEmpty()){
            System.out.print(numStack.pop() + " ");
        }

    }
}
