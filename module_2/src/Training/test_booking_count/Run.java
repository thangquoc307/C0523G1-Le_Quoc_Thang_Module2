package Training.test_booking_count;

public class Run {
    public static void main(String[] args) {
        Booking booking1 = new Booking("Dịch vụ 1");
        Booking booking2 = new Booking("Dịch vụ 2");
        Booking booking3 = new Booking("Dịch vụ 2");
        Booking booking4 = new Booking("Dịch vụ 1");
        Booking booking5 = new Booking("Dịch vụ 5");
        Booking booking6 = new Booking("Dịch vụ 6");
        Booking booking7 = new Booking("Dịch vụ 6");
        MapCount.show();

    }
}
