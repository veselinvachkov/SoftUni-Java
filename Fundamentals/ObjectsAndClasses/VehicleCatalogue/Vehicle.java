package Java_Fundamentals_2023.ObjectsAndClasses.VehicleCatalogue;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int hp;

    public Vehicle(String type, String model, String color, int hp){
        this.type = type;
        this.model =model;
        this.color = color;
        this.hp = hp;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHp() {
        return hp;
    }

}
