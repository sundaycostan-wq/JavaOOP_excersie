package pet;


public class PetMain {
    public static void main(String[] args) {
        Dog d = new Dog("Buddy", 3, "Ball");
        Bird b = new Bird("Tweety", 2, 0.3);
        System.out.println(d.name + " is " + d.ageInHumanYears() + " in human years.");
        System.out.println(b.name + " wingspan: " + b.wingspan + "m");
    }
}