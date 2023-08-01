package Java_Fundamentals_2023.FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class final_exam_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regex = "([\\%\\$])(?<command>[A-Z][a-z][a-z]+)\\1: \\[(?<num1>[0-9]+)\\]\\|\\[(?<num2>[0-9]+)\\]\\|\\[(?<num3>[0-9]+)\\]\\|";
        Pattern pattern = Pattern.compile(regex);
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < n; i++){
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                char num1 = (char) Integer.parseInt(matcher.group("num1"));
                char num2 = (char) Integer.parseInt(matcher.group("num2"));
                char num3 = (char) Integer.parseInt(matcher.group("num3"));

                str.append(num1);
                str.append(num2);
                str.append(num3);

                System.out.println(matcher.group("command") + ": " + str);
            }else{
                System.out.println("Valid message not found!");
            }
            str.setLength(0);
        }

    }
}
