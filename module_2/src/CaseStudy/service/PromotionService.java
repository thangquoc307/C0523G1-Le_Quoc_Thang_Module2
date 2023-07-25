package CaseStudy.service;
import CaseStudy.model.Customer;
import CaseStudy.repository.CustomerRepository;
import CaseStudy.repository.PromotionRepository;
import java.util.Map;
public class PromotionService implements IPromotionService {
    @Override
    public void displayCustomerUseService() {
        CustomerRepository customerRepository = new CustomerRepository();
        PromotionRepository promotionRepository = new PromotionRepository();
        Map<String, String> mapPromotion = promotionRepository.displayCustomerUseService();

        for (String key : mapPromotion.keySet()){
            Customer customer = customerRepository.getCustomerById(key);
            System.out.println("Khách hàng " + customer.getName());
            System.out.println("--- Các dịch vụ đã sử dụng ---");
            System.out.println(mapPromotion.get(key));
        }
    }
    @Override
    public void displayCustomerGetVoucher() {

    }
}
