package reservation;
public class ReservationMain {
    public static void main(String[] args) {
        ResortReservation resort = new ResortReservation(1, "David", "2025-04-10", 305);
        RailwayReservation train = new RailwayReservation(2, "Emma", "2025-04-12", "B12");
        System.out.println("Resort room: " + resort.roomNumber);
        System.out.println("Train seat: " + train.seatNumber);
    }
}