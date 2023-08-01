package Java_Fundamentals_2023.FinalExam;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class final_exam_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> followersMap = new LinkedHashMap<>();
        String[] input = scanner.nextLine().split(": ");
        while (!input[0].equals("Log out")){
            if (input[0].equals("New follower")){
                if (!followersMap.containsKey(input[1])){
                    followersMap.put(input[1], 0);
                }
            } else if (input[0].equals("Like")) {
                if (!followersMap.containsKey(input[1])){
                    followersMap.put(input[1], Integer.parseInt(input[2]));
                }else {
                    followersMap.put(input[1],followersMap.get(input[1]) + Integer.parseInt(input[2]));
                }
            }else if (input[0].equals("Comment")){
                if (!followersMap.containsKey(input[1])){
                    followersMap.put(input[1], 1);
                }else {
                    followersMap.put(input[1],followersMap.get(input[1]) + 1);
                }
            } else if (input[0].equals("Blocked")) {
                if (followersMap.containsKey(input[1])){
                    followersMap.remove(input[1]);
                }else {
                    System.out.println(input[1] + " doesn't exist.");
                }
            }

            input = scanner.nextLine().split(": ");
        }

        int countOfFollowers = followersMap.size();
        System.out.println(countOfFollowers + " followers");
        for (Map.Entry<String, Integer> entry : followersMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
