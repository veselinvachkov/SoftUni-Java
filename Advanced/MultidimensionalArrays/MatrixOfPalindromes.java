package Advanced.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] matrix = readMatrix(scanner);
        print(matrix);

    }
    private static String[][] readMatrix(Scanner scanner){
        int[] command = readArray(scanner);

        int rows = command[0];
        int columns = command[1];

        String[][] matrix = new String[rows][columns];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                char character1 = (char) ('a' + i);
                char character2 = (char) ('a' + i + j);
                matrix[i][j] = String.format("%c%c%c", character1, character2, character1);
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

    public static void print(String[][] matrix){
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
