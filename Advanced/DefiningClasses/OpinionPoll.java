package Advanced.DefiningClasses;

import java.util.*;

public class OpinionPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> peopleList = new ArrayList<>();

        for (int i = 0; i < n; i++){
            String[] command = scanner.nextLine().split(" ");
            Person person = new Person(command[0], Integer.parseInt(command[1]));
            peopleList.add(person);
        }

        peopleList.stream()
                .filter(person -> person.getAge() > 30)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);
    }
}
