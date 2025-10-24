package travel;

public class TravelMain {
    public static void main(String[] args) {
        TravelService t = new TravelService();
        t.searchFlights();
        t.bookReservation();
    }
}