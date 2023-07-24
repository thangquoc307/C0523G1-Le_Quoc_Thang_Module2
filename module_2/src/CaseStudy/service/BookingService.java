package CaseStudy.service;
import CaseStudy.model.Booking;
import CaseStudy.model.Contractor;
import CaseStudy.model.Customer;
import CaseStudy.model.IFacility;
import CaseStudy.repository.BookingRepository;
import CaseStudy.repository.CustomerRepository;
import CaseStudy.repository.FacilityRepository;
import CaseStudy.utils.CheckAvailableService;
import CaseStudy.utils.CreateBooking;
import CaseStudy.utils.CreateContractor;
import CaseStudy.utils.ReadAndWriteData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class BookingService implements IBookingService{
    @Override
    public void addNewVillaBooking() {
        addNewBooking("VL", true);

    }

    @Override
    public void addNewHouseBooking() {
        addNewBooking("HO", true);

    }

    @Override
    public void addNewRoomBooking() {
        addNewBooking("RO", false);
    }

    @Override
    public void displayBooking() {
        BookingRepository bookingRepository = new BookingRepository();
        FacilityRepository facilityRepository = new FacilityRepository();
        CustomerRepository customerRepository = new CustomerRepository();

        ArrayList<Booking> bookingList = bookingRepository.displayBooking();
        for (Booking booking : bookingList){
            IFacility service = facilityRepository.getFacilityById(booking.getServiceCode());
            Customer customer = customerRepository.getCustomerById(booking.getCustomerCode());
            System.out.println("(" + booking.getCheckInDate() + " - " + booking.getCheckOutDate() + ") " + service.getServiceName() + " - Khách hàng : " + customer.getName());
        }
    }
    private void addNewBooking(String typeDislay, Boolean hasContractor) {
        BookingRepository bookingRepository = new BookingRepository();
        FacilityRepository facilityRepository = new FacilityRepository();

        Scanner scanner = new Scanner(System.in);
        LocalDate checkInDate = CreateBooking.checkDate("Check In");
        LocalDate checkOutDate;
        while (true) {
            checkOutDate = CreateBooking.checkDate("Check Out");
            if (checkOutDate.isAfter(checkInDate)){
                break;
            }
            System.out.println("Ngày trả phòng phải sau ngày thuê chớ ba");
        }
        ArrayList<IFacility> availableService = CheckAvailableService.checkAvailableService(checkInDate, checkOutDate, typeDislay);
        if (availableService.size() == 0){
            System.out.println("Không còn dịch vụ nào trong khoảng thời gian " + checkInDate + " - " + checkOutDate);
            return;
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
                return;
            } else if (CheckAvailableService.checkInputAvalableService(availableService, serviceCode)){
                break;
            } else {
                System.out.println("Vui lòng chọn những mã dịch vụ Available hiển thị trên màn hình, bỏ trống nếu bạn muốn thoát");
            }
        }
        String customerCode = CreateBooking.checkCustomer();
        if (customerCode == ""){
            return;
        }
        IFacility service = facilityRepository.getFacilityById(serviceCode);
        String bookingCode = checkInDate + "-" + serviceCode;
        System.out.println("Bạn đã đăng kí : '" + service.getServiceName()  + "' \n- Từ : " + checkInDate + "\n- Đến : " +checkOutDate);
        Booking booking = new Booking(bookingCode, checkInDate, checkOutDate, customerCode, serviceCode);

        ArrayList<Booking> bookingList = new ArrayList<>();
        bookingList.add(booking);
        bookingRepository.createBooking(bookingList);
        if (hasContractor){
            ReadAndWriteData readAndWriteData = new ReadAndWriteData();
            ArrayList<String> stringList = new ArrayList<>();

            Contractor contractor = CreateContractor.createContractor(bookingCode, checkInDate, checkOutDate, customerCode, serviceCode);
            stringList.add(contractor.toSave());
            readAndWriteData.write("CaseStudy/data/contractor.csv", stringList, true);
        }
    }
    public int getBookingByCode(ArrayList<Booking> list, String code){
        for(int i = 0; i < list.size(); i++){
            if (code.equals(list.get(i).getBookingCode())){
                return i;
            }
        }
        return -1;
    }
}
