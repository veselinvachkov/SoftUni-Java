package Advanced.SetsAndMapsAdvanced;

import java.util.*;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> plateNumbers = new ArrayList<>();

        String[] input = scanner.nextLine().split(", ");
        while (!input[0].equals("END")){

            switch (input[0]){
                case "IN":
                    if (plateNumbers.contains(input[1])){
                        input = scanner.nextLine().split(", ");
                        continue;
                    }else {
                        plateNumbers.add(input[1]);
                    }
                    break;
                case "OUT":
                    if (plateNumbers.contains(input[1])){
                        plateNumbers.remove(input[1]);
                    }else {
                        input = scanner.nextLine().split(", ");
                        continue;
                    }
                    break;
            }

            input = scanner.nextLine().split(", ");
        }

        if (plateNumbers.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            for (String plate: plateNumbers) {
                System.out.println(plate);
            }
        }
    }
}
