package pet;

public class Bird extends Pet {
    double wingspan;

    public Bird(String name, int age, double wingspan) {
        super(name, "Bird", age);
        this.wingspan = wingspan;
    }
}