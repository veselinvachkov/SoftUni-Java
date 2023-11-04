package PastProjects.OOP.Inheritance_Exercises.animals;

public class Tomcat extends Cat{
    private final static String TOMCAT_GENDER = "Male";
    public Tomcat(String name, int age, String... gender) {
        super(name, age, TOMCAT_GENDER);
    }
    public String produceSound(){
        return "MEOW";
    }
}
