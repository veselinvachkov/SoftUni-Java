package Advanced.MultidimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rotation  = Integer.parseInt(scanner.nextLine()
                .split("\\(")[1]
                .replaceAll("\\)",""));
        int rotationAngle = rotation % 360;

        String input = scanner.nextLine();
        List<String> words = new ArrayList<>();
        int maxLength = Integer.MIN_VALUE;

        while (!input.equals("END")){
            words.add(input);
            if (input.length() > maxLength){
                maxLength = input.length();
            }
            input = scanner.nextLine();
        }

        int rows = words.size();;
        int cols = maxLength;

        char[][] matrix = new char[rows][cols];

        fillMatrix(matrix, words);

        switch (rotationAngle){
            case 90:
                matrix = rotate90(matrix,rows, cols);
                break;
            case 180:
                matrix = rotate90(matrix,rows, cols);
                matrix = rotate90(matrix,rows, cols);
                break;
            case 270:
                matrix = rotate90(matrix,rows, cols);
                matrix = rotate90(matrix,rows, cols);
                matrix = rotate90(matrix,rows, cols);
                break;
        }

        print(matrix);



    }

    private static char[][] rotate90(char[][] matrix, int rows, int cols) {
        char[][] rotatedMatrix = new char[cols][rows];
        for (int i = 0; i < cols; i++){
            int colCounter = 0;
            for (int j = rows - 1; j >= 0; j--){
                rotatedMatrix[i][colCounter++] = matrix[rows][cols];
            }
        }

        return matrix;
    }

    private static void fillMatrix(char[][] matrix, List<String> words){
        for (int row = 0; row < matrix.length; row++){
            String currentWord = words.get(row);
            for (int col = 0; col < matrix[row].length; col++){
                if (col < currentWord.length()){
                    matrix[row][col] = currentWord.charAt(col);
                }
            }
        }
    }

    public static void print(char[][] matrix){
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
