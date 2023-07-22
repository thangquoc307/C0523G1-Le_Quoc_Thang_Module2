package CaseStudy.service;
import CaseStudy.model.Employee;
import CaseStudy.repository.EmployeeRepository;
import CaseStudy.utils.CreateEmployee;
import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeService implements IEmployeeService{

    @Override
    public void displayAllEmployee() {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        ArrayList<Employee> employeeList = employeeRepository.getEmployee();
        for (Employee employee : employeeList){
            System.out.println(employee);
        }
    }
    @Override
    public void addNewEmployee() {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        employeeRepository.addEmployee(CreateEmployee.createEmployee(""));
    }
    @Override
    public void editEmployee() {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập ID nhân viên cần thay đổi :");
        String idCodeEdit = scanner.nextLine().toUpperCase();
        int index = employeeRepository.findEmployeeById(idCodeEdit);
        if (index == -1){
            System.out.println("Không tìm thấy nhân viên có ID : " + idCodeEdit);
        }else {
            employeeRepository.editEmployee(index, CreateEmployee.createEmployee(idCodeEdit));
        }
    }
    @Override
    public void deleteEmployee() {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập ID nhân viên cần xóa :");
        String idCodeEdit = scanner.nextLine().toUpperCase();
        int index = employeeRepository.findEmployeeById(idCodeEdit);
        if (index == -1){
            System.out.println("Không tìm thấy nhân viên có ID : " + idCodeEdit);
        }else {
            employeeRepository.deleteEmployee(index);
        }
    }
    @Override
    public void searchEmployeeByName() {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập từ khóa tìm kiếm :");
        String searchName = scanner.nextLine();
        ArrayList<Employee> list = employeeRepository.findEmployeeByName(searchName);
        for (Employee employee : list){
            System.out.println(employee);
        }
    }
}
