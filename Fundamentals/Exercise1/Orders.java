package Java_Fundamentals_2023.Exercises01;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int N = Integer.parseInt(scanner.nextLine());
        double globalPrice = 0;

        for (int i = 0; i < N; i++){
            double price = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int counter = Integer.parseInt(scanner.nextLine());
            double localPrice = days * counter * price;
            globalPrice += localPrice;
            System.out.printf("The price for the coffee is: $%.2f\n", localPrice);

        }
        System.out.printf("Total: $%.2f", globalPrice);
    }
}
