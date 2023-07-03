package Java_Fundamentals_2023.ObjectsAndClasses.Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++){
            String[] input = scanner.nextLine().split(" ");
            String firstName = input[0];
            String secondName = input[1];
            Double grade = Double.parseDouble(input[2]);
            Student student = new Student(firstName, secondName, grade);
            students.add(student);
        }

        students.sort(Comparator.comparing(Student::getGrade)
                                                .reversed());
        for (Student student: students) {
            System.out.printf("%s %s: %.2f\n", student.getFirstName(), student.getSecondName(), student.getGrade());
        }
    }
}
