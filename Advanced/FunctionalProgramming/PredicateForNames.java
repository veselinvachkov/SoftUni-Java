package Advanced.FunctionalProgramming;

import java.time.chrono.MinguoChronology;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Predicate<String> lengthCheck = s -> s.length() > n;
        List<String> namesArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        namesArr.removeIf(lengthCheck);
        namesArr.forEach(System.out::println);

    }
}
