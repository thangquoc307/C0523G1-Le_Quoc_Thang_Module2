package CaseStudy.controller;

import CaseStudy.utils.CheckKey;

public class FuramaController {
    public static void displayMainMenu(){
        while (true) {
            System.out.println("---Main Menu---");
            System.out.println("- 1 to Employee Management");
            System.out.println("- 2 to Customer Management");
            System.out.println("- 3 to Facility Management");
            System.out.println("- 4 to Booking Management");
            System.out.println("- 5 to Promotion Management");
            System.out.println("- 6 to Exit");

            int choose = CheckKey.checkKey();
            if (choose == -1){
                continue;
            }
            switch (choose) {
                case 1:
                    EmployeeManagementMenu.employeeManagementMenu();
                    break;
                case 2:
                    CustomerManagementMenu.customerManagementMenu();
                    break;
                case 3:
                    FacilityManagementMenu.facilityManagementMenu();
                    break;
                case 4:
                    BookingManagementMenu.bookingManagementMenu();
                    break;
                case 5:
                    PromotionManagementMenu.promotionManagementMenu();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Làm gì có chức năng '" + choose + "' bà noại");
                    break;
            }
        }
    }
}
