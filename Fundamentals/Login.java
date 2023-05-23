package Java_Fundamentals_2023.Exercises01;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        int tryCount = 0;

        String password = new StringBuffer(username).reverse().toString();

        while (tryCount <= 4){
            if (tryCount == 4){
                System.out.printf("User %s blocked!", username);
                break;
            }

            String passwordTry = scanner.nextLine();

            if (passwordTry.equals(password)){
                System.out.printf("User %s logged in", username);
                break;
            }

            if (tryCount <= 2){
                System.out.println("Incorrect password. Try again.");
            }

            tryCount++;
        }
    }
}
