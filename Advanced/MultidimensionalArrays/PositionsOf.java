package Advanced.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] RxN = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int r = RxN[0];
        int n = RxN[1];
        int[][] matrix = new int[r][n];
        boolean notFound = true;

        for (int i = 0; i < r; i++){
            int[] numbers = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int j = 0; j < n; j++){
                matrix[i][j] = numbers[j];
            }
        }

        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < r; i++){
            for (int j = 0; j < n; j++){
                if (matrix[i][j] == num){
                    System.out.println(i + " " + j);
                    notFound = false;
                }
            }
        }

        if (notFound){
            System.out.print("not found");
        }
    }
}
