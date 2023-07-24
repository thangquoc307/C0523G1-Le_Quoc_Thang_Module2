package CaseStudy.utils;
import CaseStudy.model.Contractor;
import CaseStudy.repository.FacilityRepository;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class CreateContractor {
    public static Contractor createContractor(String bookingCode, LocalDate checkInDate, LocalDate checkOutDate, String customerCode, String serviceCode){
        FacilityRepository facilityRepository = new FacilityRepository();

        Double pricePerDay = facilityRepository.getFacilityById(serviceCode).serviceFeePerDay();
        Long days = ChronoUnit.DAYS.between(checkInDate, checkOutDate);
        Double price = pricePerDay * days;
        Double deposite = price * 10/100;

        Contractor contractor = new Contractor(bookingCode, checkInDate, checkOutDate, customerCode, serviceCode, price, deposite);
        System.out.println("Theo chính sách resort. Căn hộ và Villa cần có hợp đồng đảm bảo : ");
        System.out.println("- Mã hợp đồng : " + contractor.getContractorCode() );
        System.out.println("- Tổng chi phí : " + RoundDouble.roundDouble(price) + " VND cho " + days + " ngày");
        System.out.println("- Tiền cọc 10% : " + RoundDouble.roundDouble(deposite));

        return contractor;
    }
}
