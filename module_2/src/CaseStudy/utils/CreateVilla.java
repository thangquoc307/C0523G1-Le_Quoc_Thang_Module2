package CaseStudy.utils;
import CaseStudy.model.Villa;
import java.util.Scanner;

public class CreateVilla {
    public static Villa createVilla(String serviceCode){
        Scanner scanner = new Scanner(System.in);
        String serviceName;
        Double area;
        Double price;
        int capacity;
        String rentType;
        String standard;
        Double poorArea;
        int level;

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
        while (true){
            System.out.println("Mời nhập vào tiêu chuẩn : 1-5 sao");
            standard = StandardizedName.standardizedName(scanner.nextLine());
            if (!CheckCode.checkStandard(standard)){
                System.out.println("Nhập sai format tiêu chuẩn : 1-5 sao");
                continue;
            }
            standard += " Sao";
            break;
        }
        while (true){
            System.out.println("Mời nhập vào diện tích bể bơi (m2)");
            String line = scanner.nextLine();
            if (!CheckCode.checkNumber(line)){
                System.out.println("Nhập số vào ba ơi");
                continue;
            }
            poorArea = Double.parseDouble(line);
            if (poorArea < 30){
                System.out.println("Diện tích bể bơi phải lớn hơn 30m2");
                continue;
            }
            break;
        }
        while (true){
            System.out.println("Mời nhập vào số tầng của căn hộ");
            String levelString = scanner.nextLine();
            if (!CheckCode.checkLevel(levelString)){
                System.out.println("Nhập số tầng gì mà " + levelString + " vậy ba");
                continue;
            }
            level = Integer.parseInt(levelString);
            break;
        }
        return new Villa(serviceCode, serviceName, area, price, capacity, rentType, standard, poorArea, level);
    }
}
