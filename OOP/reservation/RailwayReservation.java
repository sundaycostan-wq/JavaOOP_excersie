package reservation;

public class RailwayReservation extends Reservation {
    String seatNumber;

    public RailwayReservation(int reservationID, String customerName, String date, String seatNumber) {
        super(reservationID, customerName, date);
        this.seatNumber = seatNumber;
    }
}