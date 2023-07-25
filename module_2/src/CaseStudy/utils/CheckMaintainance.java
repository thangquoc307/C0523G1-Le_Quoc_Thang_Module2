package CaseStudy.utils;

import CaseStudy.model.Booking;
import CaseStudy.repository.BookingRepository;
import CaseStudy.repository.FacilityRepository;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class CheckMaintainance {
    public static void checkMaintainance(){
        FacilityRepository facilityRepository = new FacilityRepository();
        BookingRepository bookingRepository = new BookingRepository();
        Map<String, LocalDate> listMaintainance = facilityRepository.getMaintainanceHistory();
        ArrayList<Booking> bookingList = bookingRepository.displayBooking();

        Map<String, Integer> listFacilityUseTime = new HashMap<>();

        for (Booking booking : bookingList){
            if (!listMaintainance.containsKey(booking.getServiceCode())){
                listFacilityUseTime = addMapMaintainance(listFacilityUseTime, booking.getServiceCode());
            } else {
                LocalDate maintainanceDate = listMaintainance.get(booking.getServiceCode());
                if (maintainanceDate.isBefore(booking.getCheckOutDate())){
                    listFacilityUseTime = addMapMaintainance(listFacilityUseTime, booking.getServiceCode());
                }
            }
        }
        for (String key : listFacilityUseTime.keySet()){
            String maintainance;
            if (listMaintainance.get(key) == null){
                maintainance = "Chưa bảo trì lần nào";
            } else {
                maintainance = listMaintainance.get(key).toString();
            }

            System.out.println("Building " + key + " :  Đã sử dụng " + listFacilityUseTime.get(key) + " lần");
            System.out.println("- Lần bảo trì gần nhất : " + maintainance);
        }
    }

    private static Map<String, Integer> addMapMaintainance(Map<String, Integer> map, String idCode){
        if (map.containsKey(idCode)){
            map.put(idCode, map.get(idCode) + 1);
        } else {
            map.put(idCode, 1);
        }
        return map;
    }
}
