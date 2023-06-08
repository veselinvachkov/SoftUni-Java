package Java_Fundamentals_2023.Exercises05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> names = new ArrayList<>();

        for (int i = 0; i < n; i++){
            String[] command = scanner.nextLine().split(" ");

            if (names.contains(command[0])){
                if (command[2].equals("going!")){
                    System.out.printf("%s is already in the list!\n", command[0]);
                } else if (command[2].equals("not")) {
                    names.remove(command[0]);
                }
            }else {
                if (command[2].equals("going!")){
                    names.add(command[0]);
                } else if (command[2].equals("not")) {
                    System.out.printf("%s is not in the list!\n", command[0]);
                }
            }
        }

        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
    }
}
