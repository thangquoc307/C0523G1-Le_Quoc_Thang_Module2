package CaseStudy.controller;

import CaseStudy.utils.CheckKey;

public class FacilityManagementMenu {
    public static void facilityManagementMenu(){
        while (true) {
            System.out.println("---Facility Management Menu---");
            System.out.println("- 1 to Display list Facility");
            System.out.println("- 2 to Add new Facility");
            System.out.println("- 3 to Display list facility maintenance");
            System.out.println("- 4 to Delete Facility");
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
