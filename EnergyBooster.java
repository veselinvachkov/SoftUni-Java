package Java_Basics;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        double price = 0;


        switch (fruit){
            case "Watermelon":
                if ("small".equals(size)){
                    price = count * 2.0 * 56.0;
                } else if ("big".equals(size)) {
                    price = count * 5.0 * 28.70;
                }
                break;
            case "Mango":
                if ("small".equals(size)){
                    price = count * 2.0 * 36.66;
                } else if ("big".equals(size)) {
                    price = count * 5.0 * 19.60;
                }
                break;
            case "Pineapple":
                if ("small".equals(size)){
                    price = count * 2.0 * 42.10;
                } else if ("big".equals(size)) {
                    price = count * 5.0 * 24.80;
                }
                break;
            case "Raspberry":
                if ("small".equals(size)){
                    price = count * 2.0 * 20.0;
                } else if ("big".equals(size)) {
                    price = count * 5.0 * 15.20;
                }
                break;
        }
        if (price >= 400 && price <= 1000){
            price = price * 0.85;
        } else if (price > 1000) {
            price = price * 0.5;
        }
        System.out.printf("%.2f lv.", price);
    }
}
