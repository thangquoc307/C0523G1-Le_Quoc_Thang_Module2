package CaseStudy.service;
import CaseStudy.model.Customer;
import CaseStudy.repository.CustomerRepository;
import CaseStudy.utils.CreateCustomer;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService implements ICustomerService{
    @Override
    public void displayAllCustomer() {
        CustomerRepository customerRepository = new CustomerRepository();
        ArrayList<Customer> customersList =  customerRepository.getCustomer();
        for (Customer customer : customersList){
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
        ArrayList<Customer> list = customerRepository.findCustomerByName(searchName);
        for (Customer customer : list){
            System.out.println(customer);
        }
    }
}
