package Advanced.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = buildMatrix(scanner);
        print(matrix);

    }
    private static int[][] buildMatrix(Scanner scanner){
        String[] command = scanner.nextLine().split(", ");
        int n = Integer.parseInt(command[0]);
        String character = command[1];

        int[][] matrix = new int[n][n];
        int count = 0;

        if (character.equals("A")){
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    count += 1;
                    matrix[j][i] = count;
                }
            }
        }else if (character.equals("B")){
            for (int i = 0; i < n; i++){
                if (i % 2 == 0){
                    for (int j = 0; j < n; j++){
                        count += 1;
                        matrix[j][i] = count;
                    }
                }else {
                    for (int j = n - 1; j >= 0; j--){
                        count += 1;
                        matrix[j][i] = count;
                    }
                }
            }
        }

        return matrix;
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
