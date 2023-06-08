package Java_Fundamentals_2023.Exercises05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> listOfIntegers = Arrays
                .stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("end")){

            if (command[0].equals("Delete")){
                for (int i = 0; i < listOfIntegers.size(); i++){
                    if (listOfIntegers.get(i) == Integer.parseInt(command[1])){
                        listOfIntegers.remove(i);
                    }
                }
            } else if (command[0].equals("Insert")) {
                listOfIntegers.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
            }

            command = scanner.nextLine().split(" ");
        }

        for (int i = 0; i < listOfIntegers.size(); i++){
            System.out.printf("%d ", listOfIntegers.get(i));
        }
    }
}
