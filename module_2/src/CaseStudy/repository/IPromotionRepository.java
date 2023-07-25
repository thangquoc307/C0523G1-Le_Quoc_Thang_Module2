package CaseStudy.repository;
import CaseStudy.model.Customer;
import java.util.ArrayList;
import java.util.Map;

public interface IPromotionRepository {
    Map<String, String> displayCustomerUseService();
    ArrayList<Customer> displayCustomerGetVoucher();
}
