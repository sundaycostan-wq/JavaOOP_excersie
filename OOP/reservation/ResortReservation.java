package reservation;

public class ResortReservation extends Reservation {
    int roomNumber;

    public ResortReservation(int reservationID, String customerName, String date, int roomNumber) {
        super(reservationID, customerName, date);
        this.roomNumber = roomNumber;
    }
}