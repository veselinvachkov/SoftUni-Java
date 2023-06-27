package Java_Fundamentals_2023.ObjectsAndClasses.OpinionPoll;

public class People {
    private String name;
    private Integer age;

    public People(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String toString(){
        return this.name + " - " + this.age;
    }
}
