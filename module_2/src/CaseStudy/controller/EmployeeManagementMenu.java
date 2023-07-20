package CaseStudy.controller;

import CaseStudy.service.EmployeeService;
import CaseStudy.service.Service;
import CaseStudy.utils.CheckKey;

public class EmployeeManagementMenu {
    public static void employeeManagementMenu(){
        EmployeeService employeeService = new EmployeeService();

        while (true) {
            System.out.println("---Employee Management Menu---");
            System.out.println("- 1 to Display list Employees");
            System.out.println("- 2 to Add new Employee");
            System.out.println("- 3 to Edit Employee");
            System.out.println("- 4 to Delete Employee");
            System.out.println("- 5 to Search by name Employee");
            System.out.println("- 0 to Return main menu");

            int choose = CheckKey.checkKey();
            if (choose == -1){
                continue;
            }
            switch (choose) {
                case 1:
                    employeeService.displayAllEmployee();
                    return;
                case 2:
                    employeeService.addNewEmployee();
                    return;
                case 3:
                    employeeService.editEmployee();
                    return;
                case 4:
                    employeeService.deleteEmployee();
                    return;
                case 5:
                    employeeService.searchEmployeeByName();
                    return;
                case 0:
                    FuramaController.displayMainMenu();
                    return;
                default:
                    System.err.println("Làm gì có chức năng '" + choose + "' bà noại");
                    break;
            }
        }
    }
}
