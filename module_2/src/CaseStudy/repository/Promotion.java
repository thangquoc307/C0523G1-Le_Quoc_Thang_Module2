package CaseStudy.repository;
import CaseStudy.model.Customer;
import CaseStudy.repository.implement.IPromotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Promotion implements IPromotion {
    @Override
    public Map<String, String> displayCustomerUseService() {
        Booking bookingRepository = new Booking();
        ArrayList<CaseStudy.model.Booking> bookingList = bookingRepository.displayBooking();
        Map<String, String> mapCustomer = new HashMap<>();

        for (CaseStudy.model.Booking booking : bookingList){
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
