package b12_java_collection_framework.excercise.product_manager;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListProduct {
    private static LinkedList<Product> list = new <Product> LinkedList();
    public static void addItem(int id, String name, double price){
        list.add(new Product(id, name, price));
    }
    public static void removeItem(int index){
        if (idIndex(index) == -1){
            System.out.println("Không kiếm được sản phẩm có ID " + index);
        }else {
            list.remove(idIndex(index));
            System.out.println("Đã xóa sản phẩm có ID " + index);
        }
    }
    public static void showAllItem(){
        print(list);
    }
    public static void print(LinkedList<Product> printList){
        for(Product product : printList){
            System.out.println(product.getId() + " - " + product.getName() + " : " + product.getPrice());
        }
    }
    private static int idIndex(int id){
        for (int i = 0; i < list.size(); i++){
            if (id == list.get(i).getId()){
                return i;
            }
        }
        return -1;
    }
    public static void searchByName(String name){
        LinkedList<Product> searchList = new LinkedList<>();
        for (Product product : list){
            if (product.getName().toLowerCase().contains(name.toLowerCase())){
                searchList.add(product);
            }
        }
        if (searchList.size() == 0){
            System.out.println("Không tìm thấy sản phẩm chứa từ khóa " + name);
        }else {
            System.out.println("Danh sách sản phẩm phù hợp với từ khóa tìm kiếm : " + name + "");
            print(searchList);
        }
    }
    public static void editItemAtId(int id){
        if (idIndex(id) == -1){
            System.out.println("Không kiếm được sản phẩm có ID " + id);
        }else {
            String newName;
            Double newPrice;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Mời bạn nhập TÊN mới cho sản phẩm có ID " + id);
            newName = scanner.nextLine();
            System.out.println("Mời bạn nhập GÍA mới cho sản phẩm có ID " + id);
            newPrice = Double.parseDouble(scanner.nextLine());

            list.set(idIndex(id), new Product(id, newName, newPrice));
            System.out.println("Đã cập nhật thông tin cho sản phẩm có ID " + id);
        }
    }
    public static void ascendingOrder(){
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int)(o1.getPrice() - o2.getPrice());
            }
        });
        System.out.println("Sắp xếp theo giá tăng dần");
        print(list);
    }
    public static void descendingOrder(){
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int)(o2.getPrice() - o1.getPrice());
            }
        });
        System.out.println("Sắp xếp theo giá giảm dần");
        print(list);
    }
}
