package Advanced.StacksAndQueues;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int result = getFibonacci(n);
        System.out.print(result);


        }
    private static int getFibonacci(int n) {
        if (n < 2) {
            return 1;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}
