package CaseStudy.controller;

import CaseStudy.utils.CheckKey;

public class M15PromotionManagementMenu {
    public static void promotionManagementMenu(){
        while (true) {
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
                    return;
                case 2:
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
