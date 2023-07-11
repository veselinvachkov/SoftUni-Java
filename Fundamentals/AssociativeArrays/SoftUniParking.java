package Java_Fundamentals_2023.AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, String> parkingMap = new LinkedHashMap<>();


        for (int i = 0; i < n; i++){
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];
            String name = input[1];

            switch (command){
                case "register":
                    if (!parkingMap.containsKey(name)){
                        parkingMap.put(name, input[2]);
                        System.out.printf("%s registered %s successfully\n", name, input[2]);
                    }else {
                        System.out.printf("ERROR: already registered with plate number %s\n", input[2]);
                    }
                    break;

                case "unregister":
                    if (parkingMap.containsKey(name)){
                        parkingMap.remove(name);
                        System.out.printf("%s unregistered successfully\n", name);
                    } else {
                        System.out.printf("ERROR: user %s not found\n", name);
                    }
                    break;
            }
        }

        for (Map.Entry<String, String> entry : parkingMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }
}
