package Java_Fundamentals_2023.ObjectsAndClasses.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<People> peopleList = new ArrayList<>();

        for (int i = 0; i < n;i++){
            String input = scanner.nextLine();
            String name = input.split(" ")[0];
            int age = Integer.parseInt(input.split(" ")[1]);
            People person = new People(name, age);

            peopleList.add(person);

        }

        for (People person: peopleList) {
            if (person.getAge() > 30){
                System.out.println(person.toString());
            }
        }
    }
}
