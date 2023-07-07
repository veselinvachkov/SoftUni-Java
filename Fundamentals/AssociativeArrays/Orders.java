package Java_Fundamentals_2023.AssociativeArrays;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        List<Double> price = new ArrayList<>();
        LinkedHashMap<String, Double> marketMap = new LinkedHashMap<>();

        int innerCount = 0;

        while (!input[0].equals("buy")){

            if (marketMap.containsKey(input[0])){
                marketMap.put(input[0], marketMap.get(input[0]) + Integer.parseInt(input[2]));
                for (Map.Entry<String, Double> entry : marketMap.entrySet()) {
                    if (entry.getKey().equals(input[0])){
                        break;
                    }
                    innerCount++;

                }
                price.set(innerCount, Double.parseDouble(input[1]));
                innerCount = 0;
            } else {
                marketMap.put(input[0], Double.parseDouble(input[2]));
                price.add(Double.parseDouble(input[1]));
            }

            input = scanner.nextLine().split(" ");
        }

        int count = 0;
        for (Map.Entry<String, Double> entry : marketMap.entrySet()) {
            marketMap.put(entry.getKey(), entry.getValue() * price.get(count));
            count++;
        }

        for (Map.Entry<String, Double> entry : marketMap.entrySet()) {
            System.out.printf("%s -> %.2f\n", entry.getKey(), entry.getValue());
        }

    }
}
