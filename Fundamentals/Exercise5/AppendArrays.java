package Java_Fundamentals_2023.Exercises05;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> arr1 = Arrays
                .stream(input.split("\\|"))
                .collect(Collectors.toList());

        Collections.reverse(arr1);

        System.out.println(arr1.toString()
                .replace("[", "")
                .replace("]", "")
                .trim()
                .replaceAll(",", "")
                .replaceAll("\\s+", " "));

    }
}
