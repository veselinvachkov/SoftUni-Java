package Advanced.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstDiagonal = 0;
        int secondDiagonal = 0;

        int[][] matrix = readMatrix(scanner);
        for (int i = 0; i < matrix.length; i++){
            firstDiagonal += matrix[i][i];

            for (int j = matrix.length - 1 - i; j >= 0;){
                secondDiagonal += matrix[i][j];
                break;
            }
        }

        int difference = Math.abs(firstDiagonal - secondDiagonal);
        System.out.println(difference);
    }

    private static int[][] readMatrix(Scanner scanner){
        int command = Integer.parseInt(scanner.nextLine());;

        int rows = command;

        int[][] matrix = new int[rows][rows];

        for (int i = 0; i < rows; i++){
            int [] numbers = readArray(scanner);

            for (int j = 0; j < rows; j++){
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
}
