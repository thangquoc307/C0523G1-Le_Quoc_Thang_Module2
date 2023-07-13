package mvc.service;

import mvc.model.Customer;
import mvc.repository.CustomerRepository;
import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerService {
    public static LinkedList<Customer> list = CustomerRepository.showList();
    public static void showList(){
        print(list);
    }
    private static void print(LinkedList listPrint){
        for (int i = 0; i < listPrint.size(); i++) {
            Customer customer = (Customer) listPrint.get(i);
            System.out.println("ID: " + customer.getId() + " - " + customer.getName());
            System.out.println("Age : " + customer.getAge());
            System.out.println("TypeCustomer : " + customer.getTypeCustomer());
            System.out.println("");
        }
    }
    public static void addCustomer(){
        int id;
        String name;
        int age;
        String typeCustomer;
        Scanner scanner = new Scanner(System.in);
//
        while (true){
            System.out.println("Mời bạn nhập ID");
            id = Integer.parseInt(scanner.nextLine());
            if (findId(id) == -1){
                break;
            }
            System.out.println("ID này đã tồn tại mời bạn nhập ID khác");
        }
        System.out.println("Mời bạn nhập tên");
        name = scanner.nextLine();
        while (true){
            System.out.println("Mời bạn nhập tuổi");
            age = Integer.parseInt(scanner.nextLine());
            if (age > 0){
                break;
            }
            System.out.println("Ai tuổi âm ba, chưa sinh ra à, nhập lại cái");
        }
        System.out.println("Mời bạn nhập level khách hàng");
        typeCustomer = scanner.nextLine();
        list.addLast(new Customer(id, name, age, typeCustomer));
    }
    public static void deleteCustomer(int index){
        if (findId(index) == -1){
            System.out.println("Không có ID nào rớ hết");
        }else {
            CustomerRepository.deleteCustomer(findId(index));
            System.out.println("Xóa được rồi nghe");
        }
    }
    public static void searchCustomer(String nameSearch){
        LinkedList searchList = CustomerRepository.seachCustomer(nameSearch);
        print(searchList);
    }


    private static int findId(Integer id){
        for(int i = 0; i < list.size(); i++){
            if (id == list.get(i).getId()){
                return i;
            }
        }
        return -1;
    }
}
