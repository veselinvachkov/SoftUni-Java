package Java_Fundamentals_2023.Exercises02;

import java.util.BitSet;
import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String biggestModel = "";
        double biggestKeg = 0.0;

        for (int i = 0; i < n; i++){

            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double keg1 = Math.PI * Math.pow(radius, 2) * height;
            if (keg1 >= biggestKeg) {
                biggestKeg = keg1;
                biggestModel = model;
            }
        }
        System.out.println(biggestModel);
    }
}
