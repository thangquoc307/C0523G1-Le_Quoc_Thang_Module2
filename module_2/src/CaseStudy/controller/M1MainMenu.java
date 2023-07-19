package CaseStudy.controller;

import CaseStudy.utils.CheckKey;

public class M1MainMenu {
    public static void mainMenu(){
        while (true) {
            System.out.println("---Main Menu---");
            System.out.println("- 1 to Employee Management");
            System.out.println("- 2 to Customer Management");
            System.out.println("- 3 to Facility Management");
            System.out.println("- 4 to Booking Management");
            System.out.println("- 5 to Promotion Management");

            int choose = CheckKey.checkKey();
            if (choose == -1){
                continue;
            }
            switch (choose) {
                case 1:
                    M11EmployeeManagementMenu.employeeManagementMenu();
                    return;
                case 2:
                    M12CustomerManagementMenu.customerManagementMenu();
                    return;
                case 3:
                    M13FacilityManagementMenu.facilityManagementMenu();
                    return;
                case 4:
                    M14BookingManagementMenu.bookingManagementMenu();
                    return;
                case 5:
                    M15PromotionManagementMenu.promotionManagementMenu();
                    return;
                default:
                    System.err.println("Làm gì có chức năng '" + choose + "' bà noại");
                    break;
            }
        }
    }
}
