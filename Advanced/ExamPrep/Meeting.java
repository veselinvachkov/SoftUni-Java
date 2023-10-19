package Advanced.ExamPrep;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Meeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] males = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Deque<Integer> maleStack = new ArrayDeque<>();
        Arrays.stream(males).forEach(maleStack::push);
        int[] female = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Deque<Integer> femaleQueue = new ArrayDeque<>();
        Arrays.stream(female).forEach(femaleQueue::offer);

        int matchesCount = 0;

        while (!maleStack.isEmpty() && !femaleQueue.isEmpty()){

            if (femaleQueue.peek() <= 0){
                femaleQueue.poll();
            } else if (femaleQueue.peek() % 25 == 0) {
                femaleQueue.poll();
                femaleQueue.poll();
            }

            if (maleStack.peek() <= 0){
                maleStack.pop();
            }else if (maleStack.peek() % 25 == 0){
                maleStack.pop();
                maleStack.pop();
            }

            if (maleStack.peek() == femaleQueue.peek()){
                matchesCount++;
                maleStack.pop();
                femaleQueue.poll();
            }else {
                femaleQueue.poll();
                int tempMale = maleStack.pop();
                maleStack.push(tempMale - 2);
            }

        }

        System.out.printf("Matches: %d\n", matchesCount);
        if (maleStack.isEmpty()){
            System.out.println("Males left: none");
        }else {
            System.out.print("Males left: ");
            maleStack.forEach(e -> System.out.print(e + ", "));
        }
        if (femaleQueue.isEmpty()){
            System.out.println("Females left: none");
        }else {
            System.out.print("Females left: ");
            femaleQueue.forEach(e -> System.out.print(e + ", "));
        }


    }
}
