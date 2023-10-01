package Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.reverse(numbers);

        int n = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> checkNum = s -> s % n == 0;

        numbers.removeIf(checkNum);

        numbers.forEach(s -> System.out.print(s + " "));


    }
}
