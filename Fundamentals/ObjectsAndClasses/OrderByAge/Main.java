package Java_Fundamentals_2023.ObjectsAndClasses.OrderByAge;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        List<Person> peopleList = new ArrayList<>();

        while (!input[0].equals("End")){

            Person person = new Person(input[0], input[1], Integer.parseInt(input[2]));
            peopleList.add(person);

            input = scanner.nextLine().split(" ");
        }

        peopleList.sort(Comparator.comparing(Person::getAge));

        for (Person person: peopleList) {
            System.out.printf("%s with ID: %s is %d years old.\n", person.getName(), person.getId(), person.getAge());
        }

    }
}
