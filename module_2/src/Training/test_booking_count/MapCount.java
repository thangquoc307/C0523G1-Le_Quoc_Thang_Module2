package Training.test_booking_count;
import java.util.HashMap;
import java.util.Map;
public class MapCount {
    private static Map<String, Integer> bookingCount = new HashMap<>();
    public static void updateCount(String idCodeBooking){
        if (bookingCount.containsKey(idCodeBooking)){
            bookingCount.put(idCodeBooking, bookingCount.get(idCodeBooking) + 1);
        } else {
            bookingCount.put(idCodeBooking, 1);
        }
    }
    public static void show(){
        System.out.println(bookingCount);
    }
}
