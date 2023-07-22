package CaseStudy.utils;

import CaseStudy.model.Room;
import java.util.Scanner;
public class CreateRoom {
    public static Room createRoom(String serviceCode){
        Scanner scanner = new Scanner(System.in);
        String serviceName;
        Double area;
        Double price;
        int capacity;
        String rentType;
        String freeService;

        System.out.println("Mời nhập vào tên dịch vụ : ");
        serviceName = StandardizedName.standardizedServiceName(scanner.nextLine());
        while (true){
            System.out.println("Mời nhập vào diện tích sử dụng (m2)");
            String line = scanner.nextLine();
            if (!CheckCode.checkNumber(line)){
                System.out.println("Nhập số vào ba ơi");
                continue;
            }
            area = Double.parseDouble(line);
            if (area < 30){
                System.out.println("Diện tích sử dụng phải lớn hơn 30m2");
                continue;
            }
            break;
        }
        while (true){
            System.out.println("Mời nhập vào giá thuê");
            String line = scanner.nextLine();
            if (!CheckCode.checkNumber(line)){
                System.out.println("Nhập số vào ba ơi");
                continue;
            }
            price = Double.parseDouble(line);
            if (price < 0){
                System.out.println("Giá tiền có free đâu ba");
                continue;
            }
            break;
        }
        while (true){
            System.out.println("Mời nhập vào sức chứa");
            String line = scanner.nextLine();
            if (!CheckCode.checkNumber(line)){
                System.out.println("Nhập số vào ba ơi");
                continue;
            }
            capacity = Integer.parseInt(line);
            if (capacity < 0 || capacity > 20){
                System.out.println("Nhà này chứa được tối đa 20 người thôi bro");
                continue;
            }
            break;
        }
        while (true){
            System.out.println("Mời nhập vào kiểu thuê : Năm, Tháng, Ngày, Giờ");
            rentType = StandardizedName.standardizedName(scanner.nextLine());
            if (!CheckCode.checkRentType(rentType)){
                System.out.println("Nhập sai format kiểu thuê : Năm, Tháng, Ngày, Giờ");
                continue;
            }
            break;
        }
        System.out.println("Mời nhập vào tên dịch vụ đi kèm : ");
        freeService = scanner.nextLine();

        return new Room(serviceCode, serviceName, area, price, capacity, rentType, freeService);
    }
}
