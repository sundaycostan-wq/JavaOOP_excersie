package pet;

public class Dog extends Pet {
    String favoriteToy;

    public Dog(String name, int age, String favoriteToy) {
        super(name, "Dog", age);
        this.favoriteToy = favoriteToy;
    }

    public int ageInHumanYears() {
        return age * 7;
    }
}