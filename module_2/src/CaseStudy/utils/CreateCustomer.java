package CaseStudy.utils;

import CaseStudy.repository.CustomerRepository;
import java.time.LocalDate;
import java.util.Scanner;
public class CreateCustomer {
    public static CaseStudy.model.Customer createCustomer(String idCodeEdit) {
        CustomerRepository customerRepository = new CustomerRepository();
        Scanner scanner = new Scanner(System.in);
        String codeID;
        String name;
        LocalDate birthday;
        boolean isman;
        String isMaleString;
        String iDCard;
        String telephone;
        String email;
        String customerType;
        String adress;
        String sub = "";
        if (idCodeEdit != ""){
            sub = " MỚI";
        }
        if (idCodeEdit == "") {
            while (true) {
                System.out.println("Mời nhập vào ID khách hàng : ID là KH-YYYY với Y là số");
                codeID = scanner.nextLine().toUpperCase();
                if (!CheckCode.checkCustomerCode(codeID)) {
                    System.err.println("Nhập sai format rồi ba, ID là KH-YYYY với Y là số");
                    continue;
                }
                if (customerRepository.findCustomerById(codeID) != -1) {
                    System.err.println("Mã ID đã được sử dụng, hãy kiếm 1 mã khác");
                    continue;
                }
                break;
            }
        } else {
            codeID = idCodeEdit;
        }
        System.out.println("Mời nhập vào TÊN" + sub + " khách hàng :");
        name = StandardizedName.standardizedName(scanner.nextLine());
        while (true) {
            System.out.println("Mời nhập vào Ngày/Tháng/Năm sinh" + sub + " :");
            String birthdayString = scanner.nextLine();
            if (!CheckCode.time(birthdayString)) {
                System.err.println("Ngày phải nhập theo format DD/MM/YYYY");
                continue;
            }
            birthday = CheckDate.stringToDate(birthdayString);
            if (!CheckDate.checkAge(birthday)) {
                System.err.println("Chưa đủ 18 tuổi bạn ei, trả điện thoại cho mẹ đi cháu");
                continue;
            }
            break;
        }
        while (true){
            System.out.println("Nhập vào giới tính" + sub + ", Nam-1/Nữ-2");
            isMaleString = scanner.nextLine();
            if (CheckCode.checkIsMale(isMaleString)){
                break;
            }
            System.err.println("Chi rớ ba nhập 1 hoặc 2 thôi");
        }
        isman = Integer.parseInt(isMaleString) == 1;
        while (true) {
            System.out.println("Mời nhập số căn cước công dân" + sub);
            iDCard = scanner.nextLine();
            if (CheckCode.checkIDCard(iDCard)) {
                break;
            }
            System.err.println("Căn cước công dân phải là dãy số 9 hoặc 12 chữ số");
        }
        while (true) {
            System.out.println("Mời nhập số điện thoại" + sub);
            telephone = scanner.nextLine();
            if (CheckCode.checkTelephoneNumber(telephone)) {
                break;
            }
            System.err.println("Số điện thoại phải gồm 10 chữ ố bắt đầu bằng số 0");
        }
        while (true) {
            System.out.println("Mời nhập vào email" + sub);
            email = scanner.nextLine();
            if (CheckCode.checkEmail(email)) {
                break;
            }
            System.err.println("Sai format Email rồi ba");
        }
        while (true) {
            System.out.println("Mời nhập vào hạng khách hàng" + sub + " : Diamond, Platinum Gold, Silver, Member");
            customerType = StandardizedName.standardizedName(scanner.nextLine());
            if (CheckCode.checkCustomerType(customerType)) {
                break;
            }
            System.err.println("Làm gì có cái hạng '" + customerType + "' ba");
        }
        System.out.println("Mời nhập vào địa chỉ thường trú" + sub + " :");
        adress = scanner.nextLine();
        return new CaseStudy.model.Customer(codeID, name, birthday, isman, iDCard, telephone, email, customerType, adress);
    }
}