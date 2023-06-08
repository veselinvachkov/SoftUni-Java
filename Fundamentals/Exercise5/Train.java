package Java_Fundamentals_2023.Exercises05;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Integer> trainList = Arrays
                .stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")){
            if (command[0].equals("Add")){
                trainList.add(Integer.parseInt(command[1]));
            }else {
                for (int i = 0; i < trainList.size(); i++){
                    int currentNumber = trainList.get(i) + Integer.parseInt(command[0]);
                    if (currentNumber <= maxCapacity){
                        trainList.set(i, currentNumber);
                        break;
                    }
                }
            }
            command = scanner.nextLine().split(" ");
        }
        for (int i = 0; i < trainList.size(); i++){
            System.out.printf("%d ", trainList.get(i));
        }
    }
}
