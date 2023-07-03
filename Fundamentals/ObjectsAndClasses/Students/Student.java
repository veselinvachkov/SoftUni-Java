package Java_Fundamentals_2023.ObjectsAndClasses.Students;

public class Student {
    private String firstName;
    private String secondName;
    private Double grade;

    public Student(String firstName, String secondName, Double grade) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.grade = grade;
    }

    public Double getGrade() {
        return grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }



}
