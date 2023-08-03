package CaseStudy.repository.implement;

import CaseStudy.model.Customer;

import java.util.ArrayList;

public interface ICustomer {
    ArrayList<Customer> getCustomer();
    void addCustomer(Customer customer);
    void editCustomer(int index, Customer customer);
    void deleteCustomer(int index);

    int findCustomerById(String idCode);
    ArrayList<Customer> findCustomerByName(String name);
    Customer getCustomerById(String idCode);
}
