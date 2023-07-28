package b17_io_binary_file_and_serialization.excercise.product_manage_by_binary_file.controller;
import b17_io_binary_file_and_serialization.excercise.product_manage_by_binary_file.service.Service;

import java.util.Scanner;
public class Controller {
    public static void controller() {
        int choose = 0;
        System.out.println("Choose your action");
        System.out.println("- 1 : add new");
        System.out.println("- 2 : display");
        System.out.println("- 3 : search");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please nhập");
        try {
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    Service.add();
                    break;
                case 2:
                    Service.display();
                    break;
                case 3:
                    Service.search();
                    break;
                default:
                    System.err.println("nhập tào lao rớ ba");
                    break;
            }
        } catch (NumberFormatException e) {
            System.err.println("Nhập số vào bà noại");
        }
    }
}
