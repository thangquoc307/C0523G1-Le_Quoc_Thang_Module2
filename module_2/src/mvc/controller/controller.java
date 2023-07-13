package mvc.controller;

import mvc.model.Customer;
import mvc.repository.CustomerRepository;
import mvc.service.CustomerService;

import java.util.Scanner;

public class controller {
    public static void main(String[] args) {
        CustomerRepository listCustomer = new CustomerRepository();
        listCustomer.addCustomer(new Customer(1, "Thắng Thua", 30, "Super Vip"));
        listCustomer.addCustomer(new Customer(2, "Thắng Lợi", 32, "Vip"));
        listCustomer.addCustomer(new Customer(3, "Thắng cháy bánh xe", 40, "Hơi hơi Vip"));
        listCustomer.addCustomer(new Customer(4, "Bố Thắng", 90, "Cũng Vip"));
        listCustomer.addCustomer(new Customer(5, "Đứt Thắng", 66, "Tạm Vip"));
        listCustomer.addCustomer(new Customer(6, "Không biết bao giờ Thắng", 10, "Không Vip lắm"));
        listCustomer.addCustomer(new Customer(7, "Đường Thắng", 8, "Normal Vip"));
        listCustomer.addCustomer(new Customer(8, "Lê Văn Đỗ Thắng", 99, "Meta Vip"));
//Tạo Data có sẵn cho đỡ mệt

        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("---Welcome to Thắng bank---");
            System.out.println("Press 1 to show Customer List");
            System.out.println("Press 2 to add a new Customer");
            System.out.println("Press 3 to delete a Customer by their ID");
            System.out.println("Press 4 to search a Customer by their Name");
            System.out.println("Press 0 to Exit");
            System.out.println("--------");
            System.out.println("---Please Seletion---");
            int number = Integer.parseInt(scanner.nextLine());
            switch (number){
                case 1:
                    CustomerService.showList();
                    break;
                case 2:
                    CustomerService.addCustomer();
                    break;
                case 3:
                    System.out.println("Cho xin cái ID đứa ông muốn xóa cái");
                    int ID = Integer.parseInt(scanner.nextLine());
                    CustomerService.deleteCustomer(ID);
                    break;
                case 4:
                    System.out.println("Anh chai kiếm đứa tên gì");
                    String nameSearch = scanner.nextLine();
                    CustomerService.searchCustomer(nameSearch);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Làm gì có phím nớ bà nội");
                    break;
            }

        }

    }
}
