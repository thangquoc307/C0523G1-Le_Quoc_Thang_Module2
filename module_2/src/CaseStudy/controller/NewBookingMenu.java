package CaseStudy.controller;
import CaseStudy.service.BookingService;
import CaseStudy.utils.CheckKey;
public class NewBookingMenu {
    public static void newBookingMenu(){
        BookingService bookingService = new BookingService();
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
                    bookingService.addNewHouseBooking();
                    return;
                case 2:
                    bookingService.addNewVillaBooking();
                    return;
                case 3:
                    bookingService.addNewRoomBooking();
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
