package Advanced.DefiningClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CompanyRoster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Employee> employeesList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String name = tokens[0];
            double salary = Integer.parseInt(tokens[1]);
            String position = tokens[0];
            String department = tokens[0];

            Employee employee = null;
            switch (tokens.length){
                case 4:
                    employee = new Employee(name, salary,position,department);
                    break;
                case 5:
                    if (tokens[4].matches("\\d+")){
                        employee = new Employee(name,salary,position,department,Integer.parseInt(tokens[4]));
                    }else {
                        employee = new Employee(name,salary,position,department,tokens[4]);
                    }
                    break;
                case 6:
                    employee = new Employee(name,salary,position,department,tokens[4],Integer.parseInt(tokens[5]));
                    break;
            }
            employeesList.add(employee);
        }

        Map.Entry<String, List<Employee>> highestDepartment = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    double e1Avr = e1.getValue()
                            .stream()
                            .mapToDouble(Employee::getSalary)
                            .average()
                            .getAsDouble();
                    double e2Avr = e2.getValue()
                            .stream()
                            .mapToDouble(Employee::getSalary)
                            .average()
                            .getAsDouble();
                    return Double.compare(e2Avr, e1Avr);
                })
                .findFirst()
                .orElse(null);

        System.out.printf("Highest Average Salary: %s\n", highestDepartment);
        highestDepartment.getValue()
                .stream()
                .forEach(System.out::println);
    }
}
