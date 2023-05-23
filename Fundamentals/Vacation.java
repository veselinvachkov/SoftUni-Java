package Java_Fundamentals_2023.Exercises01;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = 0.00;
        int studentsCount = Integer.parseInt(scanner.nextLine());
        String ticketType = scanner.nextLine();
        String day = scanner.nextLine();

        switch (ticketType){
            case "Students":
                switch (day){
                    case "Friday":
                        price = studentsCount * 8.45;
                        if (studentsCount >= 30){
                            price = price * 0.85;
                        }
                        break;
                    case "Saturday":
                        price = studentsCount * 9.80;
                        if (studentsCount >= 30){
                            price = price * 0.85;
                        }
                        break;
                    case "Sunday":
                        price = studentsCount * 10.46;
                        if (studentsCount >= 30){
                            price = price * 0.85;
                        }
                        break;
                }
                break;
            case "Business":
                switch (day){
                    case "Friday":
                        price = studentsCount * 10.90;
                        if (studentsCount >= 100){
                            price = price - 109;
                        }
                        break;
                    case "Saturday":
                        price = studentsCount * 15.60;
                        if (studentsCount >= 100){
                            price = price - 156;
                        }
                        break;
                    case "Sunday":
                        price = studentsCount * 16;
                        if (studentsCount >= 100){
                            price = price - 160;
                        }
                        break;
                }
                break;
            case "Regular":
                switch (day){
                    case "Friday":
                        price = studentsCount * 15;
                        if (studentsCount >= 10 && studentsCount <= 20){
                            price = price * 0.95;
                        }
                        break;
                    case "Saturday":
                        price = studentsCount * 20;
                        if (studentsCount >= 10 && studentsCount <= 20){
                            price = price * 0.95;
                        }
                        break;
                    case "Sunday":
                        price = studentsCount * 22.50;
                        if (studentsCount >= 10 && studentsCount <= 20){
                            price = price * 0.95;
                        }
                        break;
                }
                break;
        }
        System.out.printf("Total price: %.2f", price);
    }
}
