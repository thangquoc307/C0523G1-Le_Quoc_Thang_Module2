package CaseStudy.service;
import CaseStudy.repository.Customer;
import CaseStudy.service.implement.IPromotion;

import java.util.Map;
public class Promotion implements IPromotion {
    @Override
    public void displayCustomerUseService() {
        Customer customerRepository = new Customer();
        CaseStudy.repository.Promotion promotionRepository = new CaseStudy.repository.Promotion();
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

    }
}
