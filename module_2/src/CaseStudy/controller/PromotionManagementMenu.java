package CaseStudy.controller;

import CaseStudy.service.Promotion;
import CaseStudy.utils.CheckKey;

public class PromotionManagementMenu {
    public static void promotionManagementMenu(){
        while (true) {
            Promotion promotionService = new Promotion();
            System.out.println("---Promotion Management Menu---");
            System.out.println("- 1 to Display list customers use service");
            System.out.println("- 2 to Display list customers get voucher");
            System.out.println("- 0 to Return main menu");

            int choose = CheckKey.checkKey();
            if (choose == -1){
                continue;
            }
            switch (choose) {
                case 1:
                    promotionService.displayCustomerUseService();
                    return;
                case 2:
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
