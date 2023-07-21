package Java_Fundamentals_2023.Mid_Exam_Preparation;

import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;


public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int numberLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        int specialStudentLectures = 0;
        double highestBonus = MIN_VALUE;

        for (int i = 0; i < n; i++){
            int countOfAttendances = Integer.parseInt(scanner.nextLine());
            double totalBonus = (double) countOfAttendances / numberLectures * (5 + additionalBonus);


            if (totalBonus > highestBonus){
                highestBonus = totalBonus;
                specialStudentLectures = countOfAttendances;
            }
        }
        System.out.printf("Max Bonus: %d.\n", (int) Math.ceil(highestBonus));
        System.out.printf("The student has attended %d lectures.", specialStudentLectures);
    }
}
