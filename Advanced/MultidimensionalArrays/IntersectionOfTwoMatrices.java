package Advanced.MultidimensionalArrays;
import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        String[][] matrix1 = readMatrix(r,n,scanner);
        String[][] matrix2 = readMatrix(r,n,scanner);
        String[][] result = resultMatrix(matrix1, matrix2, r, n);

        print(result, r, n);

    }

    private static String[][] readMatrix(int r, int n, Scanner scanner){
        String[][] matrix = new String[r][n];
        for (int i = 0; i < r; i++){
            String[] numbers = scanner.nextLine().split(" ");
            for (int j = 0; j < n; j++){
                matrix[i][j] = numbers[j];
            }
        }
        return matrix;
    }

    private static String[][] resultMatrix(String[][] matrix1, String[][] matrix2, int r, int n){
        String[][] newMatrix = new String[r][n];
        for (int i = 0; i < r; i++){
            for (int j = 0; j < n; j++){
                if (matrix1[i][j].equals(matrix2[i][j])){
                    newMatrix[i][j] = matrix1[i][j];
                }else {
                    newMatrix[i][j] = "*";
                }
            }
        }
        return newMatrix;
    }

    public static void print(String[][] matrix, int r, int n){
        for (int i = 0; i < r; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
