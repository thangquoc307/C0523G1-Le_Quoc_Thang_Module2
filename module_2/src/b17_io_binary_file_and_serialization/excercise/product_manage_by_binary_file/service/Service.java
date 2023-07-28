package b17_io_binary_file_and_serialization.excercise.product_manage_by_binary_file.service;
import b17_io_binary_file_and_serialization.excercise.product_manage_by_binary_file.model.BinaryProduct;
import b17_io_binary_file_and_serialization.excercise.product_manage_by_binary_file.repository.Repository;

import java.util.Scanner;

public class Service {
    public static void add(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mời nhập mã sản phẩm");
            String id = scanner.nextLine();
            System.out.println("Mời nhập tên sản phẩm");
            String name = scanner.nextLine();
            System.out.println("Mời nhập giá sản phẩm");
            Double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Mời nhập nhà sản xuất");
            String manufaturer = scanner.nextLine();
            System.out.println("Mời nhập mô tả sản phẩm");
            String description = scanner.nextLine();
            Repository.add(new BinaryProduct(id, name, price, manufaturer,description));
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai format rồi ba");
        }
    }
    public static void display(){
        Repository.display();
    }
    public static void search(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập keyword để còn kiếm cái");
        String key = scanner.nextLine();
        Repository.search(key.toLowerCase());
    }
}
