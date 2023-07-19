package CaseStudy.controller;

import CaseStudy.utils.CheckKey;

public class M11EmployeeManagementMenu {
    public static void employeeManagementMenu(){
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
                    return;
                case 2:
                    return;
                case 3:
                    return;
                case 4:
                    return;
                case 5:
                    return;
                case 0:
                    M1MainMenu.mainMenu();
                    return;
                default:
                    System.err.println("Làm gì có chức năng '" + choose + "' bà noại");
                    break;
            }
        }
    }
}
