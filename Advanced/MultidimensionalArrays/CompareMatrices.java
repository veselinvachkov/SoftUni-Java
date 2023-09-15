package Advanced.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix1 = readMatrix(scanner);
        int[][] matrix2 = readMatrix(scanner);
        boolean areEqual = true;

        if (matrix1[0].length == matrix2[0].length && matrix1[1].length == matrix2[1].length){
            for (int i = 0; i < matrix1[0].length - 1; i++){
                for (int j = 0; j < matrix1[1].length; j++){
                    if (matrix1[i][j] != matrix2[i][j]){
                        areEqual = false;
                    }
                }
            }
        }else {
            areEqual = false;
        }

        if (areEqual){
            System.out.print("equal");
        }else {
            System.out.print("not equal");
        }

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

}
