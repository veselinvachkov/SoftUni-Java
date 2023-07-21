package Java_Fundamentals_2023.RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = ">>(?<Name>[A-Za-z]+)<<(?<Price>[1-9]+\\.?[0-9]*)!(?<Count>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        double totalMoney = 0;

        String input = scanner.nextLine();
        System.out.println("Bought furniture:");
        while (!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String name = matcher.group("Name");
                double price = Double.parseDouble(matcher.group("Price"));
                int count = Integer.parseInt(matcher.group("Count"));
                totalMoney += price*count;

                System.out.println(name);
            }

            input = scanner.nextLine();
        }
        System.out.printf("Total money spend: %.2f", totalMoney);
    }
}
