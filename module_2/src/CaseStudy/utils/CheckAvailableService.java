package CaseStudy.utils;
import CaseStudy.model.IFacility;
import CaseStudy.repository.Booking;
import CaseStudy.repository.Facility;
import java.time.LocalDate;
import java.util.ArrayList;

public class CheckAvailableService {
    public static ArrayList<IFacility> checkAvailableService(LocalDate checkIn, LocalDate checkOut, String type){
        Booking bookingRepository = new Booking();
        Facility facilityRepository = new Facility();

        ArrayList<CaseStudy.model.Booking> currentBooking = bookingRepository.customDisplayBooking(type);
        ArrayList<CaseStudy.model.Booking> bookingOverlapTime = new ArrayList<>();
        ArrayList<IFacility> facilities;
        ArrayList<IFacility> facilitiesReturn = new ArrayList<>();

        for (CaseStudy.model.Booking booking : currentBooking){
            if (!CheckDate.checkOverlapTime(checkIn, checkOut, booking.getCheckInDate(), booking.getCheckOutDate())){
                bookingOverlapTime.add(booking);
            }
        }

        if (type.equals("VL")){
            facilities = facilityRepository.displayVilla();
        } else if (type.equals("HO")) {
            facilities = facilityRepository.displayHouse();
        } else {
            facilities = facilityRepository.displayRoom();
        }
        for (IFacility facility : facilities){
            if (!bookingOverlapTime.contains(new CaseStudy.model.Booking(facility.getServiceCode()))){
                facilitiesReturn.add(facility);
            }
        }
        return facilitiesReturn;
    }
    public static Boolean checkInputAvalableService(ArrayList<IFacility> list, String code){
        for (IFacility facility : list){
            if (facility.getServiceCode().equals(code)){
                return true;
            }
        }
        return false;
    }
}
