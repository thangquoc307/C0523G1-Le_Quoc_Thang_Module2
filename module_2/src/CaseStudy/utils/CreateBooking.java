package CaseStudy.utils;
import CaseStudy.repository.Customer;
import java.time.LocalDate;
import java.util.Scanner;
public class CreateBooking {
    public static LocalDate checkDate(String action){
        Scanner scanner = new Scanner(System.in);
        String stringBooking;
        while (true){
            System.out.println("Mời bạn nhập vào ngày " + action + " : DD/MM/YYYY");
            stringBooking = scanner.nextLine();
            if (CheckCode.time(stringBooking)){
                break;
            }
        }
        return CheckDate.stringToDate(stringBooking);
    }
    public static String checkCustomer(){
        Customer customerRepository = new Customer();
        Scanner scanner = new Scanner(System.in);
        String customerID;
        while (true){
            System.out.println("Mời nhập vào mã Khách Hàng");
            customerID = scanner.nextLine().toUpperCase();

            if (customerRepository.findCustomerById(customerID) == -1){
                System.err.println("Có vẻ khách hàng này chưa đăng ký, xin mời đăng ký thông tin khách hàng trước khi sử dụng dịch vụ");
                return "";
            }else {
                CaseStudy.model.Customer currentCustomer = customerRepository.getCustomerById(customerID);
                System.out.println(currentCustomer.getCodeID() + " Xin chào " + currentCustomer.getName());
                return customerID;
            }
        }
    }
}
