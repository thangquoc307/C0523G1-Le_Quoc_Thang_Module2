package CaseStudy.controller;

import CaseStudy.utils.CheckKey;

public class M141NewBookingMenu {
    public static void newBookingMenu(){
        while (true) {
            System.out.println("---New Booking Menu---");
            System.out.println("- 1 to Add new House");
            System.out.println("- 2 to Add new Villa");
            System.out.println("- 3 to Add new Room");
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
