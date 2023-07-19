package CaseStudy.controller;

import CaseStudy.utils.CheckKey;

public class M14BookingManagementMenu {
    public static void bookingManagementMenu(){
        while (true) {
            System.out.println("---Booking Management Menu---");
            System.out.println("- 1 to Add new Booking");
            System.out.println("- 2 to Display list of Booking");
            System.out.println("- 3 to Create new Contract");
            System.out.println("- 4 to Display list of Contract");
            System.out.println("- 5 to Edit Contract");
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
