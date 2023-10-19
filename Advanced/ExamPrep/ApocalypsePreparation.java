package Advanced.ExamPrep;

import java.util.*;
import java.util.stream.Collectors;

public class ApocalypsePreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        ArrayDeque<Integer> queueTextile = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt) .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> stackMedicament = new ArrayDeque<>();
                Arrays.stream(scanner. nextLine().split("\\s+"))
                        .map(Integer::parseInt).forEach(stackMedicament::push);

        Map<Integer, String> itemsAndResources = new HashMap<>();
        itemsAndResources.put(30, "Patch");
        itemsAndResources.put(40, "Bandage");
        itemsAndResources.put(100, "MedKit");
        Map<String, Integer> createdItems = new TreeMap<>();

        int patchCount = 0;
        int bandageCount = 0;
        int medKitCount = 0;

        while (!queueTextile.isEmpty() && !stackMedicament.isEmpty()){
            int textileValue = queueTextile.poll();
            int medicamentValue = stackMedicament.pop();

            int sum = medicamentValue + textileValue;

            if (itemsAndResources.containsKey(sum)){

                switch (itemsAndResources.get(sum)){
                    case "Patch":
                        createdItems.put(itemsAndResources.get(sum), ++patchCount);
                        break;
                    case "Bandage":
                        createdItems.put(itemsAndResources.get(sum), ++bandageCount);
                        break;
                    case "MedKit":
                        createdItems.put(itemsAndResources.get(sum), ++medKitCount);
                        break;
                }

            } else if (sum > 100) {
                createdItems.put("MedKit", ++medKitCount);
                sum -= 100;
                int newNumber = stackMedicament.pop();
                stackMedicament.push(newNumber + sum);

            }else {
                stackMedicament.push(medicamentValue + 10);

            }
            createdItems = createdItems.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .collect(Collectors.toMap(
                            Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        }
        if (queueTextile.isEmpty() && stackMedicament.isEmpty()) {
            System.out.println("Textiles and medicaments are both empty.");
            createdItems.forEach((k, v) -> System.out.println(k + " - " + v));

        }else if (stackMedicament.isEmpty()){
            System.out.println("Medicaments are empty.");
            createdItems.forEach((k,v) -> System.out.println(k + " - " + v));
            System.out.print("Textiles left: ");
            queueTextile.forEach((e) -> {
                if (queueTextile.size() == 0) {
                    System.out.print(e);
                }else {
                    System.out.print(e + ", ");
                }
            });

        }  else {
            System.out.println("Textiles are empty.");
            createdItems.forEach((k, v) -> System.out.println(k + " - " + v));
            System.out.print("Medicaments left: ");
            stackMedicament.forEach((e) -> {
                if (stackMedicament.size() == 0) {
                    System.out.print(e);
                }else {
                    System.out.print(e + ", ");
                }
            });
        }
    }
}
