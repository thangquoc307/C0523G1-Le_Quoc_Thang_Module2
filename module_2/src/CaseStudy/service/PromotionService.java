package CaseStudy.service;
import CaseStudy.model.Booking;
import CaseStudy.model.Customer;
import CaseStudy.model.IFacility;
import CaseStudy.repository.CustomerRepository;
import CaseStudy.repository.FacilityRepository;
import CaseStudy.repository.PromotionRepository;
import CaseStudy.service.implement.IPromotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class PromotionService implements IPromotion {
    @Override
    public void displayCustomerUseService() {
        CustomerRepository customerRepository = new CustomerRepository();
        PromotionRepository promotionRepository = new PromotionRepository();
        Map<String, String> mapPromotion = promotionRepository.displayCustomerUseService();

        for (String key : mapPromotion.keySet()){
            CaseStudy.model.Customer customer = customerRepository.getCustomerById(key);
            System.out.println("Khách hàng " + customer.getName());
            System.out.println("--- Các dịch vụ đã sử dụng ---");
            System.out.println(mapPromotion.get(key));
        }
    }
    @Override
    public void displayCustomerGetVoucher() {
        PromotionRepository promotionRepository = new PromotionRepository();
        CustomerRepository customerRepository = new CustomerRepository();
        FacilityRepository facilityRepository = new FacilityRepository();
        Map<Integer, List<Booking>> map = promotionRepository.displayCustomerGetVoucher();
        System.out.println("--- Danh sách khách Booking sớm các tháng ---");
        for (Integer key : map.keySet()){
            String month = ("" + key).substring(4, 6);
            String year = ("" + key).substring(0, 4);
            String title = "Tháng " + month + " năm " + year;
            System.out.println("\n-----" + title + "-----");
            List<Booking> list = map.get(key);
            for (int i = 0; i < list.size(); i++){
                System.out.println("Hạng " + (i + 1));
                Booking booking = list.get(i);
                IFacility facility = facilityRepository.getFacilityById(booking.getServiceCode());
                Customer customer = customerRepository.getCustomerById(booking.getCustomerCode());
                System.out.println(" - Khách hàng : " + customer.getName());
                System.out.println(" - Dịch vụ : " + facility.getServiceName());
                System.out.println(" - Thời gian Booking : " + booking.getCheckInDate());
            }
        }
    }
}
