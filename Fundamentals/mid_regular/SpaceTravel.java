package Java_Fundamentals_2023.mid_regular;

import java.util.Scanner;

public class SpaceTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] commands = scanner.nextLine().split("\\|\\|");
        int flue = Integer.parseInt(scanner.nextLine());
        int ammunition = Integer.parseInt(scanner.nextLine());
        boolean missionBreak = false;


        for (int i = 0; i < commands.length; i++){
            String[] commandParts = commands[i].trim().split(" ");
            String action = commandParts[0];
            if (missionBreak){
                break;
            }

            switch (action){
                case "Travel":
                    if (flue >= Integer.parseInt(commandParts[1])){
                        flue -= Integer.parseInt(commandParts[1]);
                        System.out.printf("The spaceship travelled %d light-years.\n", Integer.parseInt(commandParts[1]));
                    }else {
                        System.out.println("Mission failed.");
                        missionBreak = true;
                    }
                    break;
                case "Enemy":
                    if (ammunition >= Integer.parseInt(commandParts[1])){
                        ammunition -= Integer.parseInt(commandParts[1]);
                        System.out.printf("An enemy with %d armour is defeated.\n", Integer.parseInt(commandParts[1]));
                    }else if (Integer.parseInt(commandParts[1]) * 2 <= flue){
                        flue -= Integer.parseInt(commandParts[1]);
                        System.out.printf("An enemy with %d armour is outmaneuvered.\n", Integer.parseInt(commandParts[1]));
                    }else {
                        System.out.println("Mission failed.");
                        missionBreak = true;
                    }
                    break;
                case "Repair":
                    flue += Integer.parseInt(commandParts[1]);
                    ammunition += Integer.parseInt(commandParts[1]) * 2;
                    System.out.printf("Ammunitions added: %d.\n", Integer.parseInt(commandParts[1]) * 2);
                    System.out.printf("Fuel added: %d.\n", Integer.parseInt(commandParts[1]));
                    break;
                case "Titan":
                    System.out.println("You have reached Titan, all passengers are safe.");
                    missionBreak = true;
                    break;
            }
        }
    }
}
