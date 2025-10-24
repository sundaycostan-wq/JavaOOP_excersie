package event;

public class MusicalPerformance extends Event {
    String performer;

    public MusicalPerformance(String name, String date, String location, String performer) {
        super(name, date, location);
        this.performer = performer;
    }
}