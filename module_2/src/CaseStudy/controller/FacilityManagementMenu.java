package CaseStudy.controller;

import CaseStudy.service.FacilityService;
import CaseStudy.utils.CheckKey;

public class FacilityManagementMenu {
    public static void facilityManagementMenu(){
        FacilityService facilityService = new FacilityService();
        while (true) {
            System.out.println("---Facility Management Menu---");
            System.out.println("- 1 to Display list Facility");
            System.out.println("- 2 to Add new Facility");
            System.out.println("- 3 to Display list facility maintenance");
            System.out.println("- 4 to Delete Facility");
            System.out.println("- 5 to Mark maintenaned facility");
            System.out.println("- 0 to Return main menu");

            int choose = CheckKey.checkKey();
            if (choose == -1){
                continue;
            }
            switch (choose) {
                case 1:
                    facilityService.displayFacility();
                    return;
                case 2:
                    facilityService.addNewFacility();
                    return;
                case 3:
                    facilityService.displayFacilityNeedMaintenance();
                    return;
                case 4:
                    facilityService.deleteFacility();
                    return;
                case 5:
                    facilityService.markMaintainedFacility();
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
