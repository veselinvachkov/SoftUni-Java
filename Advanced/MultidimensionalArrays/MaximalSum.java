package Advanced.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readMatrix(scanner);
        int[][] result = new int[matrix.length - 1][matrix[0].length - 2];
        int sum = 0;

        for (int i = 1; i < matrix.length; i++){
            for (int j = 1 ; j < matrix[0].length - 1; j++){
                sum += matrix[i][j];
                result[i - 1][j - 1] = matrix[i][j];
            }
        }
        System.out.println("Sum = " + sum);
        print(result);
    }
    private static int[][] readMatrix(Scanner scanner){
        int[] command = readArray(scanner);

        int rows = command[0];
        int columns = command[1];

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++){
            int [] numbers = readArray(scanner);

            for (int j = 0; j < columns; j++){
                matrix[i][j] = numbers[j];
            }
        }
        return matrix;

    }
    private static int[] readArray(Scanner scanner){
        return  Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static void print(int[][] matrix){
        int r = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < r; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
