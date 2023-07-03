package Java_Fundamentals_2023.ObjectsAndClasses.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        List<Vehicle> vehiclesList = new ArrayList<>();

        double averageCarHp = 0;
        double averageTruckHp = 0;
        Double carCount = 0.0;
        Double truckCount = 0.0;


        while (!input[0].equals("End")){

            if (input[0].equals("car")){
                averageCarHp += Double.parseDouble(input[3]);
                carCount++;
                input[0] = "Car";
            } else if (input[0].equals("truck")) {
                averageTruckHp += Double.parseDouble(input[3]);
                truckCount++;
                input[0] = "Truck";
            }

            Vehicle vehicle = new Vehicle(input[0], input[1], input[2], Integer.parseInt(input[3]));
            vehiclesList.add(vehicle);
            input = scanner.nextLine().split(" ");
        }

        String input2 = scanner.nextLine();
        while (!input2.equals("Close the Catalogue")){
            for (Vehicle vehicle: vehiclesList) {
                if (input2.equals(vehicle.getModel())){
                    System.out.printf("Type: %s\nModel: %s\nColor: %s\nHorsepower: %d\n", vehicle.getType(), vehicle.getModel(), vehicle.getColor(), vehicle.getHp());
                }
            }

            input2 = scanner.nextLine();
        }

        if (carCount == 0 && truckCount == 0){
            averageCarHp = 0.0;
            averageTruckHp = 0.0;
        }else if (carCount == 0){
            averageCarHp = 0.0;
            averageTruckHp = averageTruckHp / truckCount;
        } else if (truckCount == 0) {
            averageTruckHp = 0.0;
            averageCarHp = averageCarHp / carCount;
        }else {
            averageCarHp = averageCarHp / carCount;
            averageTruckHp = averageTruckHp / truckCount;
        }

        System.out.printf("Cars have average horsepower of: %.2f.\n", averageCarHp);
        System.out.printf("Trucks have average horsepower of: %.2f.", averageTruckHp);
    }
}
