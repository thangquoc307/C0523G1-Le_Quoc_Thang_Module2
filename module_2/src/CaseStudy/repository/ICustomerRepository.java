package CaseStudy.repository;

import CaseStudy.model.Customer;

import java.util.ArrayList;

public interface ICustomerRepository {
    ArrayList<Customer> getCustomer();
    void addCustomer(Customer customer);
    void editCustomer(int index, Customer customer);
    void deleteCustomer(int index);

    int findCustomerById(String idCode);
    ArrayList<Customer> findCustomerByName(String name);
}
