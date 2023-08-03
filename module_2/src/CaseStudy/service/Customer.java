package CaseStudy.service;
import CaseStudy.service.implement.ICustomer;
import CaseStudy.utils.CreateCustomer;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer implements ICustomer {
    @Override
    public void displayAllCustomer() {
        CaseStudy.repository.Customer customerRepository = new CaseStudy.repository.Customer();
        ArrayList<CaseStudy.model.Customer> customersList =  customerRepository.getCustomer();
        for (CaseStudy.model.Customer customer : customersList){
            System.out.println(customer);
        }
    }
    @Override
    public void addNewCustomer() {
        CaseStudy.repository.Customer customerRepository = new CaseStudy.repository.Customer();
        customerRepository.addCustomer(CreateCustomer.createCustomer(""));
    }
    @Override
    public void editCustomer() {
        CaseStudy.repository.Customer customerRepository = new CaseStudy.repository.Customer();
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
        CaseStudy.repository.Customer customerRepository = new CaseStudy.repository.Customer();
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
        CaseStudy.repository.Customer customerRepository = new CaseStudy.repository.Customer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập từ khóa tìm kiếm :");
        String searchName = scanner.nextLine();
        ArrayList<CaseStudy.model.Customer> list = customerRepository.findCustomerByName(searchName);
        for (CaseStudy.model.Customer customer : list){
            System.out.println(customer);
        }
    }
}
