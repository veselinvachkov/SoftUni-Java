package Java_Fundamentals_2023.AssociativeArrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input;

        Map<String, Integer> items = new LinkedHashMap<>();
        Map<String, Integer> junk = new LinkedHashMap<>();
        boolean isFound = false;

        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);

        while (!isFound){
            input = scanner.nextLine().split(" ");

            for (int i = 0; i < input.length; i += 2){
                int count = Integer.parseInt(input[i]);
                String name = input[i + 1].toLowerCase();

                if (name.equals("shards") || name.equals("fragments") || name.equals("motes")){
                    items.put(name, items.get(name) + count);
                }else {
                    if (!junk.containsKey(name)){
                        junk.put(name, count);
                    }else {
                        junk.put(name, junk.get(name) + count);
                    }
                }

                for (Map.Entry<String, Integer> entry : items.entrySet()) {
                    if (entry.getValue() >= 250){
                        if (entry.getKey().equals("shards")){
                            System.out.println("Shadowmourne obtained!");
                        } else if (entry.getKey().equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else if (entry.getKey().equals("motes")) {
                            System.out.println("Dragonwrath obtained!");
                        }

                        items.put(entry.getKey(), entry.getValue() - 250);
                        isFound = true;
                        break;
                    }
                }

                if (isFound){
                    break;
                }
            }
        }
        for (Map.Entry<String ,Integer> entry : items.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        for (Map.Entry<String ,Integer> entry : junk.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
