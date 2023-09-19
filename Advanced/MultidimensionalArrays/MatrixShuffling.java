package Advanced.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] matrix = readMatrix(scanner);

        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("END")){
            if (command[0].equals("swap")){
                int command1 = Integer.parseInt(command[1]);
                int command2 = Integer.parseInt(command[2]);
                int command3 = Integer.parseInt(command[3]);
                int command4 = Integer.parseInt(command[4]);

                if (command1 > matrix.length){
                    System.out.println("Invalid input!");
                    command = scanner.nextLine().split(" ");
                    continue;
                }
                if (command2 > matrix[0].length){
                    System.out.println("Invalid input!");
                    command = scanner.nextLine().split(" ");
                    continue;
                }
                if (command3 > matrix.length){
                    System.out.println("Invalid input!");
                    command = scanner.nextLine().split(" ");
                    continue;
                }
                if (command4 > matrix[0].length){
                    System.out.println("Invalid input!");
                    command = scanner.nextLine().split(" ");
                    continue;
                }

                String swapNum = matrix[command1][command2];
                matrix[command1][command2] = matrix[command3][command4];
                matrix[command3][command4] = swapNum;

            }else {
                System.out.println("Invalid input!");
                command = scanner.nextLine().split(" ");
                continue;
            }

            print(matrix);

            command = scanner.nextLine().split(" ");
        }

    }

    private static String[][] readMatrix(Scanner scanner){
        int[] command = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = command[0];
        int columns = command[1];

        String[][] matrix = new String[rows][columns];

        for (int i = 0; i < rows; i++){
            String[] numbers = readArray(scanner);

            for (int j = 0; j < columns; j++){
                matrix[i][j] = numbers[j];
            }
        }
        return matrix;

    }
    private static String[] readArray(Scanner scanner){
        return  scanner.nextLine().split(" ");
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
