package CaseStudy.repository.implement;
import CaseStudy.model.Booking;
import CaseStudy.model.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface IPromotion {
    Map<String, String> displayCustomerUseService();
    Map<Integer, List<Booking>> displayCustomerGetVoucher();
}
