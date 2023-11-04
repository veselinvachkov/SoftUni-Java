package PastProjects.OOP.Inheritance.hello;

public class Australian extends BasePerson {

    public Australian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Hey, mate";
    }

}
