package Java_Basics;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double Musala = 0;
        double Monblan = 0;
        double Kilimanjaro = 0;
        double K2 = 0;
        double Everest = 0;
        double allPeople = 0;

        while (n > 0) {
            int people = Integer.parseInt(scanner.nextLine());
            if (people <= 5) {
                Musala += people;
            } else if (people <= 12) {
                Monblan += people;
            }else if (people <= 25) {
                Kilimanjaro += people;
            }else if (people <= 40) {
                K2 += people;
            }else {
                Everest += people;
            }
            allPeople += people;
            n -= 1;
        }
        Musala = Musala / allPeople * 100.0;
        Kilimanjaro = Kilimanjaro / allPeople * 100.0;
        K2 = K2 / allPeople * 100.0;
        Everest = Everest / allPeople * 100.0;
        Monblan = Monblan / allPeople * 100.0;

        System.out.printf("%.2f%%\n", Musala);
        System.out.printf("%.2f%%\n", Monblan);
        System.out.printf("%.2f%%\n", Kilimanjaro);
        System.out.printf("%.2f%%\n", K2);
        System.out.printf("%.2f%%\n", Everest);
    }
}
