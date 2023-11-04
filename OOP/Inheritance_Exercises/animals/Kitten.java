package PastProjects.OOP.Inheritance_Exercises.animals;

public class Kitten extends Cat{
    private final static String KITTEN_GENDER = "Female";
    public Kitten(String name, int age, String... gender) {
        super(name, age, KITTEN_GENDER);
    }
    public String produceSound(){
        return "Meow";
    }
}
