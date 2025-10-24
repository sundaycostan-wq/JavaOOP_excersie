package event;

public class Event {
    String name;
    String date;
    String location;

    public Event(String name, String date, String location) {
        this.name = name;
        this.date = date;
        this.location = location;
    }

    public void displayDetails() {
        System.out.println(name + " on " + date + " at " + location);
    }
}