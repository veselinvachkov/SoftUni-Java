package Java_Fundamentals_2023.Exercises04;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        matrix(n);
    }
    public static void matrix(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
