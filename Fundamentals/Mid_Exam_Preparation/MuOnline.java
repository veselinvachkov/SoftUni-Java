package Java_Fundamentals_2023.Mid_Exam_Preparation;

import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split("\\|");
        int health = 100;
        int bitcoins = 0;
        int roomCount = 0;
        boolean died = false;

        for (int i = 0; i <= command.length; i++){
            if (died){
                break;
            }
            if (i == command.length){
                System.out.println("You've made it!");
                System.out.printf("Bitcoins: %d\n", bitcoins);
                System.out.printf("Health: %d\n", health);
                break;
            }

            switch (command[i].split(" ")[0]){
                case "potion":
                    roomCount++;
                    int healedAmount = Integer.parseInt(command[i].split(" ")[1]);
                    if (healedAmount + health <= 100){
                        health += healedAmount;
                        System.out.printf("You healed for %d hp.\n", healedAmount);
                        System.out.printf("Current health: %d hp.\n", health);
                    }else {
                        healedAmount = 100 - health;
                        health = 100;
                        System.out.printf("You healed for %d hp.\n", healedAmount);
                        System.out.printf("Current health: %d hp.\n", health);

                    }
                    break;
                case "chest":
                    roomCount++;
                    int bitcoinCount = Integer.parseInt(command[i].split(" ")[1]);
                    bitcoins += bitcoinCount;
                    System.out.printf("You found %d bitcoins\n", bitcoinCount);
                    break;
                default:
                    roomCount++;
                    String monsterName = command[i].split(" ")[0];
                    int minusHealth = Integer.parseInt(command[i].split(" ")[1]);
                    if (health - minusHealth <= 0){
                        System.out.printf("You died! Killed by %s.\n", monsterName);
                        System.out.printf("Best room: %d", roomCount);
                        died = true;
                    }else {
                        health -= minusHealth;
                        System.out.printf("You slayed %s.\n", monsterName);
                    }
                    break;
            }
        }
    }
}
