package Advanced.SetsAndMapsAdvanced;

import java.util.*;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Character, Integer> letters = new TreeMap<>();

        for (int i = 0; i < input.length(); i++){
            if (!letters.containsKey(input.charAt(i))){
                letters.put(input.charAt(i), 1);
            }else {
                letters.put(input.charAt(i), letters.get(input.charAt(i)) + 1);
            }
        }

        letters.forEach((key, value) -> System.out.printf("%c: %d time/s\n", key, value));
    }
}
