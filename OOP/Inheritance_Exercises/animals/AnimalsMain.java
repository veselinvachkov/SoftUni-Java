package PastProjects.OOP.Inheritance_Exercises.animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<Animal> animalsList = new ArrayList<>();

        while (!line.equals("Beast!")){
            try {
                String[] commands = scanner.nextLine().split("\\s+");
                String name = commands[0];
                int age = Integer.parseInt(commands[1]);
                String gender = commands[2];

                switch (line){
                    case "Dog":
                        Dog dog = new Dog(name, age, gender);
                        animalsList.add(dog);
                        break;
                    case "Cat":
                        Cat cat = new Cat(name, age, gender);
                        animalsList.add(cat);
                        break;
                    case "Frog":
                        Frog frog = new Frog(name, age, gender);
                        animalsList.add(frog);
                        break;
                    case "Kitten":
                        Kitten kitten = new Kitten(name, age, gender);
                        animalsList.add(kitten);
                        break;
                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(name, age, gender);
                        animalsList.add(tomcat);
                        break;
                }
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }

            line = scanner.nextLine();
        }

        animalsList.forEach(a ->
                        System.out.printf(
                        a.getClass().getSimpleName() + "%n" + a.getName() + " " + a.getAge() + " " + a.getGender() + "%n" + a.produceSound() + "%n"));
    }
}
