package event;


public class EventMain {
    public static void main(String[] args) {
        Seminar s = new Seminar("Tech Talk", "2025-03-10", "Hall A", 3);
        MusicalPerformance m = new MusicalPerformance("Jazz Night", "2025-05-15", "Auditorium", "John Mayer");
        s.displayDetails();
        m.displayDetails();
    }
}