package Java_Fundamentals_2023.AssociativeArrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> counterMap = new LinkedHashMap<>();
        String[] input = scanner.nextLine().split("");
        for (int i = 0; i < input.length; i++){
            if (input[i].equals(" ")){
                continue;
            }
            if (!counterMap.containsKey(input[i])){
                counterMap.put(input[i], 1);
            }else {
                counterMap.put(input[i], counterMap.get(input[i]) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry: counterMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
