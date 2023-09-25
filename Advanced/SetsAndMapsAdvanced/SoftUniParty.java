package Advanced.SetsAndMapsAdvanced;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import static java.lang.Character.isDigit;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        HashSet<String> vipTable = new HashSet<>();
        HashSet<String> normalTable = new HashSet<>();

        while (!input.equals("PARTY")){
            if (isDigit(input.charAt(0))){
                if (vipTable.contains(input)){
                    input = scanner.nextLine();
                    continue;
                }else {
                    vipTable.add(input);
                }
            }else {
                if (normalTable.contains(input)){
                    input = scanner.nextLine();
                    continue;
                }else {
                    normalTable.add(input);
                }
            }
            input = scanner.nextLine();
        }
        while (!input.equals("END")){
            vipTable.remove(input);
            normalTable.remove(input);

            input = scanner.nextLine();
        }

        int count = vipTable.size() + normalTable.size();
        System.out.println(count);
        for (String table: vipTable) {
            System.out.println(table);
        }
        for (String table: normalTable) {
            System.out.println(table);
        }
    }
}
