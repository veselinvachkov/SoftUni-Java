package Java_Basics;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String sugar = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0.0;

        switch (type) {
            case "Espresso":
                if ("Without".equals(sugar)){
                    totalPrice = count * 0.90 * 0.65;
                } else if ("Normal".equals(sugar)) {
                    totalPrice = count;
                } else if ("Extra".equals(sugar)) {
                    totalPrice = count * 1.20;
                }
                break;
            case "Cappuccino":
                if ("Without".equals(sugar)){
                    totalPrice = count * 0.65;
                } else if ("Normal".equals(sugar)) {
                    totalPrice = count * 1.2;
                } else if ("Extra".equals(sugar)) {
                    totalPrice = count * 1.60;
                }
                break;
            case "Tea":
                if ("Without".equals(sugar)){
                    totalPrice = count * 0.5 * 0.65;
                } else if ("Normal".equals(sugar)) {
                    totalPrice = count * 0.6;
                } else if ("Extra".equals(sugar)) {
                    totalPrice = count * 0.7;
                }
                break;
        }

        if ("Espresso".equals(type) && count >= 5){
            totalPrice = totalPrice * 0.75;
        }
        if (totalPrice > 15) {
            totalPrice = totalPrice * 0.8;
        }

        System.out.printf("You bought %d cups of %s for %.2f lv.", count, type, totalPrice);
    }
}
