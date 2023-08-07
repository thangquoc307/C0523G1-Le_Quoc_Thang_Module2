package CaseStudy.repository;
import CaseStudy.model.Booking;
import CaseStudy.model.Customer;
import CaseStudy.repository.implement.IPromotion;

import java.util.*;

public class PromotionRepository implements IPromotion {
    @Override
    public Map<String, String> displayCustomerUseService() {
        BookingRepository bookingRepository = new BookingRepository();
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
    public Map<Integer, List<Booking>> displayCustomerGetVoucher() {
        BookingRepository booking = new BookingRepository();
        List<Booking> bookingList = booking.displayBooking();
        Map<Integer, List<Booking>> map = new TreeMap<>();

        for (Booking bookingSlot : bookingList){
            int key = bookingSlot.getCheckInDate().getMonthValue() + bookingSlot.getCheckInDate().getYear() * 100;
            if (map.containsKey(key)){
                map.get(key).add(bookingSlot);
            } else {
                List<Booking> bookingMonth = new ArrayList<>();
                bookingMonth.add(bookingSlot);
                map.put(key, bookingMonth);
            }
        }
        Map<Integer, List<Booking>> rankList = new TreeMap<>();
        for (Integer key : map.keySet()){
            List<Booking> listBookingMonth = new ArrayList<>();
            List<Booking> listMap = map.get(key);
            Collections.sort(listMap, new Comparator<Booking>() {
                @Override
                public int compare(Booking o1, Booking o2) {
                    return o1.getCheckInDate().getDayOfMonth() - o2.getCheckInDate().getDayOfMonth();
                }
            });
            for (int i = 0; i < 3 && i < listMap.size(); i++){
                listBookingMonth.add(listMap.get(i));
            }
            rankList.put(key, listBookingMonth);
        }
        return rankList;
    }

}
