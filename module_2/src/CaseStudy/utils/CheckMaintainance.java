package CaseStudy.utils;

import CaseStudy.repository.Booking;
import CaseStudy.repository.Facility;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class CheckMaintainance {
    public static void checkMaintainance(){
        Facility facilityRepository = new Facility();
        Booking bookingRepository = new Booking();
        Map<String, LocalDate> listMaintainance = facilityRepository.getMaintainanceHistory();
        ArrayList<CaseStudy.model.Booking> bookingList = bookingRepository.displayBooking();

        Map<String, Integer> listFacilityUseTime = new HashMap<>();

        for (CaseStudy.model.Booking booking : bookingList){
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
            System.err.println("- Lần bảo trì gần nhất : " + maintainance);
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
