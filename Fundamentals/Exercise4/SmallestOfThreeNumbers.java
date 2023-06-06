package Java_Fundamentals_2023.Exercises04;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smallestNUmber = smallestOfThree();
        System.out.println(smallestNUmber);

    }

    public  static int smallestOfThree(){
        Scanner scanner = new Scanner(System.in);
        int smallestNum = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++){
            int input = Integer.parseInt(scanner.nextLine());
            if (input < smallestNum){
                smallestNum = input;
            }
        }
        return smallestNum;
    }
}
