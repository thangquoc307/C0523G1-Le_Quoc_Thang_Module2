package CaseStudy.service;
import CaseStudy.service.implement.IEmployee;
import CaseStudy.utils.CreateEmployee;
import java.util.ArrayList;
import java.util.Scanner;
public class Employee implements IEmployee {

    @Override
    public void displayAllEmployee() {
        CaseStudy.repository.Employee employeeRepository = new CaseStudy.repository.Employee();
        ArrayList<CaseStudy.model.Employee> employeeList = employeeRepository.getEmployee();
        for (CaseStudy.model.Employee employee : employeeList){
            System.out.println(employee);
        }
    }
    @Override
    public void addNewEmployee() {
        CaseStudy.repository.Employee employeeRepository = new CaseStudy.repository.Employee();
        employeeRepository.addEmployee(CreateEmployee.createEmployee(""));
    }
    @Override
    public void editEmployee() {
        CaseStudy.repository.Employee employeeRepository = new CaseStudy.repository.Employee();
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
        CaseStudy.repository.Employee employeeRepository = new CaseStudy.repository.Employee();
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
        CaseStudy.repository.Employee employeeRepository = new CaseStudy.repository.Employee();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập từ khóa tìm kiếm :");
        String searchName = scanner.nextLine();
        ArrayList<CaseStudy.model.Employee> list = employeeRepository.findEmployeeByName(searchName);
        for (CaseStudy.model.Employee employee : list){
            System.out.println(employee);
        }
    }
}
