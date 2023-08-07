package Training.test_booking_count;

public class Booking {
    private String idBooking;

    public Booking(String idBooking) {
        this.idBooking = idBooking;
        MapCount.updateCount(this.idBooking);
    }
}
