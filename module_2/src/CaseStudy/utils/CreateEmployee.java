package CaseStudy.utils;

import CaseStudy.repository.Employee;
import java.time.LocalDate;
import java.util.Scanner;
public class CreateEmployee {
    public static CaseStudy.model.Employee createEmployee(String idCodeEdit){
        Employee employeeRepository = new Employee();
        Scanner scanner = new Scanner(System.in);
        String id;
        String name;
        LocalDate birthdayLocalTime;
        Boolean isMan;
        String isMaleString;
        String idCard;
        String telephoneNumber;
        String email;
        String education;
        String employeeType;
        Double salary;
        String sub = "";
        if (idCodeEdit != ""){
            sub = " MỚI";
        }
        if (idCodeEdit == ""){
            while (true) {
                System.out.println("Mời nhập vào ID nhân viên : ID là NV-YYYY với Y là số");
                id = scanner.nextLine().toUpperCase();
                if (!CheckCode.checkEmployeeCode(id)) {
                    System.err.println("Nhập sai format rồi ba, ID là NV-YYYY với Y là số");
                    continue;
                }
                if (employeeRepository.findEmployeeById(id) != -1) {
                    System.err.println("Mã ID đã được sử dụng, hãy kiếm 1 mã khác");
                    continue;
                }
                break;
            }
        }else {
            id = idCodeEdit;
        }
        System.out.println("Mời nhập vào TÊN" + sub + " nhân viên :");
        name = StandardizedName.standardizedName(scanner.nextLine());
        while (true) {
            System.out.println("Mời nhập vào Ngày/Tháng/Năm sinh" + sub + " :");
            String birthday = scanner.nextLine();
            if(!CheckCode.time(birthday)){
                System.err.println("Ngày phải nhập theo format DD/MM/YYYY");
                continue;
            }
            birthdayLocalTime = CheckDate.stringToDate(birthday);
            if(!CheckDate.checkAge(birthdayLocalTime)){
                System.err.println("Chưa đủ 18 tuổi bạn ei, nhận vào ở tù á");
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
        isMan = Integer.parseInt(isMaleString) == 1;
        while (true){
            System.out.println("Mời nhập số căn cước công dân" + sub);
            idCard = scanner.nextLine();
            if (CheckCode.checkIDCard(idCard)){
                break;
            }
            System.err.println("Căn cước công dân phải là dãy số 9 hoặc 12 chữ số");
        }
        while (true){
            System.out.println("Mời nhập số điện thoại" + sub);
            telephoneNumber = scanner.nextLine();
            if (CheckCode.checkTelephoneNumber(telephoneNumber)){
                break;
            }
            System.err.println("Số điện thoại phải gồm 10 chữ ố bắt đầu bằng số 0");
        }
        while (true) {
            System.out.println("Mời nhập vào email" + sub);
            email = scanner.nextLine();
            if(CheckCode.checkEmail(email)){
                break;
            }
            System.err.println("Sai format Email rồi ba");
        }
        while (true){
            System.out.println("Mời nhập vào trình độ học vấn" + sub + " : Trung Cấp, Cao Đẳng, Đại Học, Sau Đại Học");
            education = StandardizedName.standardizedName(scanner.nextLine());
            if (CheckCode.checkEducation(education)){
                break;
            }
            System.err.println("Làm gì có cái trình độ '" + education + "' ba");
        }
        while (true){
            System.out.println("Mời nhập vào vị trí" + sub + " : Lễ Tân, Phục Vụ, Chuyên Viên, Giám Sát, Quản Lý, Giám Đốc");
            employeeType = StandardizedName.standardizedName(scanner.nextLine());
            if (CheckCode.checkEmployeeType(employeeType)){
                break;
            }
            System.err.println("Làm gì có vị trí '" + employeeType + "' ba");
        }
        while (true) {
            System.out.println("Mời nhập vào mức lương" + sub);
            String stringSalary = scanner.nextLine();
            if (CheckCode.checkNumber(stringSalary)){
                salary = Double.parseDouble(stringSalary);
                break;
            }
            System.out.println("Nhập sai lương rồi ba");
        }
        return new CaseStudy.model.Employee(id, name, birthdayLocalTime, isMan, idCard, telephoneNumber, email, education, employeeType, salary);
    }
}
