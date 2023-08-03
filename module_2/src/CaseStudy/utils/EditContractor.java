package CaseStudy.utils;

import CaseStudy.model.Contractor;
import CaseStudy.model.IFacility;
import CaseStudy.repository.Booking;
import CaseStudy.repository.Facility;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class EditContractor {
    public static ArrayList editContractor(CaseStudy.model.Booking booking){
        Scanner scanner = new Scanner(System.in);
        Facility facilityRepository = new Facility();
        ArrayList resultList = new ArrayList<>();

        LocalDate checkInDate = CreateBooking.checkDate("Check In Mới");
        LocalDate checkOutDate;
        while (true) {
            checkOutDate = CreateBooking.checkDate("Check Out Mới");
            if (checkOutDate.isAfter(checkInDate)){
                break;
            }
            System.err.println("Ngày trả phòng phải sau ngày thuê chớ ba");
        }

        ArrayList<IFacility> availableService = checkAvailableServiceEdit(checkInDate, checkOutDate, booking.getServiceCode().substring(2, 4), booking);
        if (availableService.size() == 0){
            System.err.println("Không còn dịch vụ nào trong khoảng thời gian " + checkInDate + " - " + checkOutDate);
            return resultList;
        } else {
            System.out.println("Các dịch vụ mà bạn có thể chọn : ");
            for (IFacility facility : availableService){
                System.out.println(facility);
            }
        }
        String serviceCode;
        System.out.println("Mời chọn mã dịch vụ. Để trống nếu không muốn tiếp tục Booking");
        while (true) {
            serviceCode = scanner.nextLine().toUpperCase();
            if (serviceCode.equals("")){
                return resultList;
            } else if (CheckAvailableService.checkInputAvalableService(availableService, serviceCode)){
                break;
            } else {
                System.err.println("Vui lòng chọn những mã dịch vụ Available hiển thị trên màn hình, bỏ trống nếu bạn muốn thoát");
            }
        }
        String customerCode = CreateBooking.checkCustomer();
        if (customerCode == ""){
            return resultList;
        }
        IFacility service = facilityRepository.getFacilityById(serviceCode);
        String bookingCode = checkInDate + "-" + serviceCode;
        System.out.println("Bạn đã đăng kí : '" + service.getServiceName()  + "' \n- Từ : " + checkInDate + "\n- Đến : " +checkOutDate);
        CaseStudy.model.Booking editBooking = new CaseStudy.model.Booking(bookingCode, checkInDate, checkOutDate, customerCode, serviceCode);

        Contractor editContractor = CreateContractor.createContractor(editBooking.getBookingCode(), editBooking.getCheckInDate(), editBooking.getCheckOutDate(), editBooking.getCustomerCode(), editBooking.getServiceCode());

        resultList.add(editBooking);
        resultList.add(editContractor);
        return resultList;
    }
    private static ArrayList<IFacility> checkAvailableServiceEdit(LocalDate checkIn, LocalDate checkOut, String type, CaseStudy.model.Booking editBooking){
        Booking bookingRepository = new Booking();
        Facility facilityRepository = new Facility();
        ArrayList<CaseStudy.model.Booking> bookingOverlapTime = new ArrayList<>();
        ArrayList<IFacility> facilitiesReturn = new ArrayList<>();

        ArrayList<CaseStudy.model.Booking> currentBooking = bookingRepository.customDisplayBooking(type);
        currentBooking.remove(editBooking);
        ArrayList<IFacility> facilities;

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
}
