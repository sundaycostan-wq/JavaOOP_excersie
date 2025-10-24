package dog;

public class DogMian {

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        System.out.println("Dog Name: " + dog.getName());
        System.out.println("Dog Breed: " + dog.getBreed());

        dog.setName("Max");
        dog.setBreed("Labrador");

        System.out.println("Updated Dog Name: " + dog.getName());
        System.out.println("Updated Dog Breed: " + dog.getBreed());
    }
}
