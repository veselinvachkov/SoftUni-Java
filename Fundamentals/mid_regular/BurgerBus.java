package Java_Fundamentals_2023.mid_regular;

import java.util.Scanner;

public class BurgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cityCounter = 0;
        double totalMoney = 0;


        int numberCities = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberCities; i++){
            cityCounter++;
            double cityMoney = 0;
            String cityNAme = scanner.nextLine();
            double ownerIncome = Double.parseDouble(scanner.nextLine());
            double ownerExpenses = Double.parseDouble(scanner.nextLine());

            if (cityCounter % 3 == 0 && cityCounter % 5 != 0){
                ownerExpenses *= 1.5;
            } else if (cityCounter % 5 == 0) {
                ownerIncome = ownerIncome * 0.9;
            }

            cityMoney = ownerIncome - ownerExpenses;
            System.out.printf("In %s Burger Bus earned %.2f leva.\n", cityNAme, cityMoney);
            totalMoney += cityMoney;
        }

        System.out.printf("Burger Bus total profit: %.2f leva.\n", totalMoney);

    }
}
