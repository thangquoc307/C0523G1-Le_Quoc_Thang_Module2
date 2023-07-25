package CaseStudy.repository;
import CaseStudy.model.Booking;
import CaseStudy.model.Customer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PromotionRepository implements IPromotionRepository{
    @Override
    public Map<String, String> displayCustomerUseService() {
        BookingRepository bookingRepository = new BookingRepository();
        ArrayList<Booking> bookingList = bookingRepository.displayBooking();
        Map<String, String> mapCustomer = new HashMap<>();

        for (Booking booking : bookingList){
            String key = booking.getCustomerCode();
            if (mapCustomer.containsKey(key)) {
                mapCustomer.put(key, mapCustomer.get(key) + "\n- " + booking.getBookingCode());
            } else {
                mapCustomer.put(key, "- " + booking.getBookingCode());
            }
        }
        return mapCustomer;
    }

    @Override
    public ArrayList<Customer> displayCustomerGetVoucher() {
        return null;
    }
}
