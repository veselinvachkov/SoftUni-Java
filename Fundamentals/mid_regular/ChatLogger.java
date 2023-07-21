package Java_Fundamentals_2023.mid_regular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ChatLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> chat = new ArrayList<>();

        String[] commands = scanner.nextLine().split(" ");

        while (!commands[0].equals("end")){
            switch (commands[0]){
                case "Chat":
                    chat.add(commands[1]);
                    break;
                case "Delete":
                    chat.remove(commands[1]);
                    break;
                case "Edit":
                    if (chat.contains(commands[1])){
                        int index = chat.indexOf(commands[1]);
                        chat.set(index, commands[2]);
                    }
                    break;
                case "Pin":
                    chat.remove(commands[1]);
                    chat.add(commands[1]);
                    break;
                case "Spam":
                    for (int i = 1; i < commands.length; i++){
                        chat.add(commands[i]);
                    }
                    break;
            }
            commands = scanner.nextLine().split(" ");
        }
        for (int i = 0; i < chat.size(); i++){
            System.out.println(chat.get(i));
        }
    }
}
