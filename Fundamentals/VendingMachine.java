package Java_Fundamentals_2023.Exercises01;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = 0;
        double sum = 0;

        String command = scanner.nextLine();
        while (!command.equals("Start")){
            if (command.equals("0.1") || command.equals("0.2") || command.equals("0.5") || command.equals("1") || command.equals("2")){
                number = Double.parseDouble(command);
                sum += number;
            }else {
                System.out.printf("Cannot accept %s\n", command);
            }
            command = scanner.nextLine();
        }

        while (!command.equals("End")){
            command = scanner.nextLine();
            switch (command){
                case "Nuts":
                    if (sum < 2.0){
                        System.out.println("Sorry, not enough money");
                    }else {
                        System.out.println("Purchased Nuts");
                        sum -= 2.0;
                    }
                    break;
                case "Water":
                    if (sum < 0.7){
                        System.out.println("Sorry, not enough money");
                    }else {
                        System.out.println("Purchased Water");
                        sum -= 0.7;
                    }
                    break;
                case "Crisps":
                    if (sum < 1.5){
                        System.out.println("Sorry, not enough money");
                    }else {
                        System.out.println("Purchased Crisps");
                        sum -= 1.5;
                    }
                    break;
                case "Soda":
                    if (sum < 0.8){
                        System.out.println("Sorry, not enough money");
                    }else {
                        System.out.println("Purchased Soda");
                        sum -= 0.8;
                    }
                    break;
                case "Coke":
                    if (sum < 1.0){
                        System.out.println("Sorry, not enough money");
                    }else {
                        System.out.println("Purchased Coke");
                        sum -= 1.0;
                    }
                    break;

            }
        }
    }
}
