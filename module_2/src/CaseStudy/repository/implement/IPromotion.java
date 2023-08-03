package CaseStudy.repository.implement;
import CaseStudy.model.Customer;
import java.util.ArrayList;
import java.util.Map;

public interface IPromotion {
    Map<String, String> displayCustomerUseService();
    ArrayList<Customer> displayCustomerGetVoucher();
}
