package Advanced.ExamPrep;

import java.util.Arrays;
import java.util.Scanner;

public class BlindManBuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] n = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        char[][] field = new char[n[0]][n[1]];

        int[] coordinates = fillMatrixAndGetCoordinates(field, scanner);
        int myRow = coordinates[0];
        int myCol = coordinates[1];
        int moves = 0;
        int touchesCount = 0;

        String command = scanner.nextLine();
        while (!command.equals("Finish")){

            int newColMinus = myCol - 1;
            int newColPlus = myCol + 1;
            int newRowMinus = myRow - 1;
            int newRowPlus = myRow + 1;

            switch (command){
                case "up":
                    if (canMove(field, myRow, myCol)) {
                        if (field[myRow][newColPlus] == 'P'){
                            touchesCount++;
                        }
                        moves++;
                        myCol++;
                    }else if (field[myRow][newColPlus] == 'O'){
                        break;
                    }
                    break;
                case "down":
                    if (canMove(field, myRow, myCol)) {
                        if (field[newRowPlus][myCol] == 'P'){
                            touchesCount++;
                        }
                        moves++;
                        myCol--;
                    } else if (field[myRow][newColMinus] == 'O') {
                        break;
                    }
                    break;
                case "right":
                    if (canMove(field, myRow, myCol)) {
                        if (field[myRow][newColPlus] == 'P'){
                            touchesCount++;
                        }
                        moves++;
                        myRow++;
                    } else if (field[newRowPlus][myCol] == 'O') {
                        break;
                    }
                    break;
                case "left":
                    if (canMove(field, myRow, myCol)) {
                        if (field[myRow][newColMinus] == 'P'){
                            touchesCount++;
                        }
                        moves++;
                        myRow--;
                    } else if (field[newRowMinus][myCol] == 'O') {
                        break;
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.println("Game over!");
        System.out.printf("Touched opponents: %d\n", touchesCount);
        System.out.printf("Moves made: %d", moves);



    }

    private static void printMatrix(char[][] field) {
        for (char[] row : field) {
            for (char symbol : row) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    private static boolean canMove(char[][] field, int myRow, int myCol) {
        return myRow >= 0 && myRow < field.length &&
                myCol >= 0 && myCol < field[myRow].length;
    }

    private static int[] fillMatrixAndGetCoordinates(char[][] field, Scanner scanner) {
        int[] coordinates = new int[2];

        for (int row = 0; row < field.length; row++) {
            char[] currentRow = scanner.nextLine().replaceAll(" ", "").toCharArray();
            field[row] = currentRow;

            for (int col = 0; col < currentRow.length; col++) {
                char symbol = currentRow[col];
                if (symbol == 'B') {
                    coordinates[0] = row;
                    coordinates[1] = col;
                    break;
                }
            }
        }
        return coordinates;
    }
}
