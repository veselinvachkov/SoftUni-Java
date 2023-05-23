package Java_Fundamentals_2023.Exercises02;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = 255;
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++){
            int tempWater = Integer.parseInt(scanner.nextLine());
            if (tempWater <= capacity){
                capacity-=tempWater;
            }else {
                System.out.println("Insufficient capacity!");
            }
        }

        int totalUsed = 255 - capacity;
        System.out.println(totalUsed);
    }
}
