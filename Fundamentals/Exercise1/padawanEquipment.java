package Java_Fundamentals_2023.Exercises01;

import java.util.Scanner;

public class padawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightsabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());

        double freeBelts =  Math.floor((float) countOfStudents / 6) * priceOfBelts;
        double totalPriceOfBelt = priceOfBelts * countOfStudents - freeBelts;
        int countOfLoghtsabers = (int) Math.ceil(countOfStudents * 1.1);
        double totalCost = totalPriceOfBelt + countOfLoghtsabers * priceOfLightsabers + countOfStudents * priceOfRobes;


        if (totalCost <= amountOfMoney){
            System.out.printf("The money is enough - it would cost %.2flv. \n", totalCost);
        }else {
            System.out.printf("George Lucas will need %.2flv more. \n", Math.abs(amountOfMoney - totalCost));
        }
    }
}
