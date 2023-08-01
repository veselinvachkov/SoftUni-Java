package Java_Fundamentals_2023.FinalExam;

import java.util.Scanner;

public class final_exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String spell = scanner.nextLine();

        String[] commands = scanner.nextLine().split(" ");
        commands[0] = commands[0].toLowerCase();

        while (!commands[0].equals("abracadabra")){
            switch (commands[0]){
                case "abjuration":
                    spell = spell.toUpperCase();
                    System.out.println(spell);
                    break;
                case "necromancy":
                    spell = spell.toLowerCase();
                    System.out.println(spell);
                    break;
                case "illusion":
                    if (Integer.parseInt(commands[1]) >= 0 && Integer.parseInt(commands[1]) <= spell.length() - 1) {
                        char tempChar = commands[2].charAt(0);
                        spell = spell.replace(spell.charAt(Integer.parseInt(commands[1])), tempChar);
                        System.out.println("Done!");
                    } else {
                        System.out.println("The spell was too weak.");
                    }
                    break;
                case "divination":
                    spell = spell.replace(commands[1].toLowerCase(), commands[2]);
                    spell = spell.replace(commands[1].toUpperCase(), commands[2]);

                    System.out.println(spell);
                    break;
                case "alteration":
                    if (spell.contains(commands[1])){
                        spell = spell.replaceAll(commands[1], "");
                        System.out.println(spell);
                    }
                    break;
                default:
                    System.out.println("The spell did not work!");
                    break;
            }
            commands = scanner.nextLine().split(" ");
            commands[0] = commands[0].toLowerCase();
        }

    }
}
