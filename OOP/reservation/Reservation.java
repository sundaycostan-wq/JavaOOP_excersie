package reservation;

public class Reservation {
    int reservationID;
    String customerName;
    String date;

    public Reservation(int reservationID, String customerName, String date) {
        this.reservationID = reservationID;
        this.customerName = customerName;
        this.date = date;
    }
}