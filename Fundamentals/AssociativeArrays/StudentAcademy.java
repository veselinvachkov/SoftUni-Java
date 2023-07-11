package Java_Fundamentals_2023.AssociativeArrays;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> nameGradeMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++){
            String name  = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (nameGradeMap.containsKey(name)) {
                List<Double> currentGrades = nameGradeMap.get(name);
                currentGrades.add(grade);
            }
            else {
                nameGradeMap.put(name, new ArrayList<>());
                nameGradeMap.get(name).add(grade);
            }
        }

        Map<String, Double> studentAverageGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : nameGradeMap.entrySet()) {
            String name = entry.getKey();
            List<Double> grades = entry.getValue();
            double averageGrade = getAverageGrade(grades);

            if (averageGrade >= 4.50){
                studentAverageGrade.put(name, averageGrade);
            }
        }
        studentAverageGrade.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }
    private static double getAverageGrade(List<Double> grades) {
        //{5, 4, 6, 2}
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
