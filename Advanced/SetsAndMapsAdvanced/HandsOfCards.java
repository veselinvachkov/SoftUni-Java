package Advanced.SetsAndMapsAdvanced;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(": ");
        Map<String, Integer> playerPoints = new LinkedHashMap<>();
        Map<String, List<String>> playerCards = new LinkedHashMap<>();

        while (!"JOKER".equals(input[0])){

            String[] cards = input[1].split(", ");
            int totalPoints = 0;

            for (int i = 0; i < cards.length; i++){

                String[] symbols = cards[i].split("");
                int num = 0;
                if (playerCards.containsKey(input[0]) && playerCards.get(input[0]).contains(cards[i])){
                    continue;
                }

                if (!playerCards.containsKey(input[0])) {
                    playerCards.put(input[0], new ArrayList<>());
                }

                playerCards.get(input[0]).add(cards[i]);


                if (Character.isDigit(symbols[0].charAt(0))){
                    if (symbols.length > 2){
                        num = 10;
                    }else {
                        num = Integer.parseInt(symbols[0]);
                    }

                }else {
                    switch (symbols[0]){
                        case "J":
                            num = 11;
                            break;
                        case "Q":
                            num = 12;
                            break;
                        case "K":
                            num = 13;
                            break;
                        case "A":
                            num = 14;
                            break;
                    }
                }
                if (symbols.length > 2){
                    switch (symbols[2]) {
                        case "S":
                            num *= 4;
                            break;
                        case "H":
                            num *= 3;
                            break;
                        case "D":
                            num *= 2;
                            break;
                    }
                }else {
                    switch (symbols[1]) {
                        case "S":
                            num *= 4;
                            break;
                        case "H":
                            num *= 3;
                            break;
                        case "D":
                            num *= 2;
                            break;
                    }
                }

                totalPoints += num;
            }

            if (playerPoints.containsKey(input[0])){
                playerPoints.put(input[0], playerPoints.get(input[0]) + totalPoints);
            }else {
                playerPoints.put(input[0], totalPoints);
            }


            input = scanner.nextLine().split(": ");
        }

        for (Map.Entry entry: playerPoints.entrySet()) {
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue());
        }
    }
}
