package CaseStudy.repository.implement;

import CaseStudy.model.Employee;

import java.util.ArrayList;

public interface IEmployee {
    ArrayList<Employee> getEmployee();
    void addEmployee(Employee employee);
    void editEmployee(int index, Employee employee);
    void deleteEmployee(int index);

    int findEmployeeById(String idCode);
    ArrayList<Employee> findEmployeeByName(String name);

}
