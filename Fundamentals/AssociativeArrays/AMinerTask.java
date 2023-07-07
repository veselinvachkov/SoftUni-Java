package Java_Fundamentals_2023.AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> countMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("stop")){
            int number = Integer.parseInt(scanner.nextLine());

            if (!countMap.containsKey(input)){
                countMap.put(input, number);
            }else {
                countMap.put(input, countMap.get(input) + number);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
