package PastProjects.OOP.Inheritance_Exercises.animals;

import java.util.Optional;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void setName(String name) {
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException(
                   "Invalid input!");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0){
            throw new IllegalArgumentException(
                    "Invalid input!");
        }
        this.age = age;
    }

    public void setGender(String gender) {
        if (gender == null || gender.isBlank()){
            throw new IllegalArgumentException (
                    "Invalid input!");
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String produceSound(){
        return "Sound";
    }
}
