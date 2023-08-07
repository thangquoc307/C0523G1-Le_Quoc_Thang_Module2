package CaseStudy.service;
import CaseStudy.repository.CustomerRepository;
import CaseStudy.service.implement.ICustomer;
import CaseStudy.utils.CreateCustomer;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService implements ICustomer {
    @Override
    public void displayAllCustomer() {
        CustomerRepository customerRepository = new CustomerRepository();
        ArrayList<CaseStudy.model.Customer> customersList =  customerRepository.getCustomer();
        for (CaseStudy.model.Customer customer : customersList){
            System.out.println(customer);
        }
    }
    @Override
    public void addNewCustomer() {
        CustomerRepository customerRepository = new CustomerRepository();
        customerRepository.addCustomer(CreateCustomer.createCustomer(""));
    }
    @Override
    public void editCustomer() {
        CustomerRepository customerRepository = new CustomerRepository();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập ID khách hàng cần thay đổi :");
        String idCodeEdit = scanner.nextLine().toUpperCase();
        int index = customerRepository.findCustomerById(idCodeEdit);
        if (index == -1){
            System.out.println("Không tìm thấy khách hàng có ID : " + idCodeEdit);
        }else {
            customerRepository.editCustomer(index, CreateCustomer.createCustomer(idCodeEdit));
        }
    }
    @Override
    public void deleteCustomer() {
        CustomerRepository customerRepository = new CustomerRepository();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập ID khách hàng cần xóa :");
        String idCodeEdit = scanner.nextLine().toUpperCase();
        int index = customerRepository.findCustomerById(idCodeEdit);
        if (index == -1){
            System.out.println("Không tìm thấy khách hàng có ID : " + idCodeEdit);
        }else {
            customerRepository.deleteCustomer(index);
        }
    }

    @Override
    public void searchCustomerByName() {
        CustomerRepository customerRepository = new CustomerRepository();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập từ khóa tìm kiếm :");
        String searchName = scanner.nextLine();
        ArrayList<CaseStudy.model.Customer> list = customerRepository.findCustomerByName(searchName);
        for (CaseStudy.model.Customer customer : list){
            System.out.println(customer);
        }
    }
}
