package CaseStudy.controller;

import CaseStudy.service.Booking;
import CaseStudy.service.Contact;
import CaseStudy.utils.CheckKey;

public class BookingManagementMenu {
    public static void bookingManagementMenu(){
        while (true) {
            Contact contactService = new Contact();
            System.out.println("---Booking Management Menu---");
            System.out.println("- 1 to Add new Booking");
            System.out.println("- 2 to Display list of Booking");
            System.out.println("- 3 to Display list of Contract");
            System.out.println("- 4 to Edit Contract");
            System.out.println("- 0 to Return main menu");

            int choose = CheckKey.checkKey();
            if (choose == -1){
                continue;
            }
            switch (choose) {
                case 1:
                    NewBookingMenu.newBookingMenu();
                    return;
                case 2:
                    Booking bookingService = new Booking();
                    bookingService.displayBooking();
                    return;
                case 3:
                    contactService.displayAllContract();
                    return;
                case 4:
                    contactService.editContract();
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
