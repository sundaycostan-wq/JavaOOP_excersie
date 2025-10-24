package event;

public class Seminar extends Event {
    int numberOfSpeakers;

    public Seminar(String name, String date, String location, int numberOfSpeakers) {
        super(name, date, location);
        this.numberOfSpeakers = numberOfSpeakers;
    }
}