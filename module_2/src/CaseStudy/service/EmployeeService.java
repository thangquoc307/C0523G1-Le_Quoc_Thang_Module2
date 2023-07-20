package CaseStudy.service;

import CaseStudy.model.PEmployee;
import CaseStudy.repository.EmployeeRepository;
import CaseStudy.utils.CheckAge;
import CaseStudy.utils.CheckCode;
import CaseStudy.utils.StandardizedName;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService{

    @Override
    public void displayAllEmployee() {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        ArrayList<PEmployee> employeeList = employeeRepository.getEmployee();
        for (PEmployee pEmployee : employeeList){
            System.out.println(pEmployee);
        }

    }

    @Override
    public void addNewEmployee() {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        Scanner scanner = new Scanner(System.in);
        String id;
        String name;
        LocalDate birthdayLocalTime;
        Boolean isMan;
        String idCard;
        String telephoneNumber;
        String email;
        String education;
        String employeeType;
        Double salary;

        while (true){
            System.out.println("Mời nhập vào ID nhân viên :");
            id = scanner.nextLine();
            Boolean boo = CheckCode.checkEmployeeCode(id);
            if (boo){break;}
            System.out.println("Nhập sai format rồi ba, ID là NV-YYYY với Y là số");
        }
        System.out.println("Mời nhập vào TÊN nhân viên :");
        name = StandardizedName.standardizedName(scanner.nextLine());
        while (true) {
            System.out.println("Mời nhập vào Ngày/Tháng/Năm sinh :");
            String birthday = scanner.nextLine();
            if(!CheckCode.time(birthday)){
                System.out.println("Ngày phải nhập theo format DD/MM/YYYY");
                continue;
            }
            birthdayLocalTime = CheckAge.stringToDate(birthday);
            if(!CheckAge.checkAge(birthdayLocalTime)){
                System.out.println("Chưa đủ 18 tuổi bạn ei");
                continue;
            }
            break;
        }
        System.out.println("Nhập vào giới tính, Nam-1/Nữ-2");
        isMan = Integer.parseInt(scanner.nextLine()) == 1;
        while (true){
            System.out.println("Mời nhập số căn cước công dân");
            idCard = scanner.nextLine();
            if (CheckCode.checkIDCard(idCard)){
                break;
            }
            System.out.println("Căn cước công dân phải là dãy số 9 hoặc 12 chữ số");
        }
        while (true){
            System.out.println("Mời nhập số điện thoại");
            telephoneNumber = scanner.nextLine();
            if (CheckCode.checkTelephoneNumber(telephoneNumber)){
                break;
            }
            System.out.println("Số điện thoại phải gồm 10 chữ ố bắt đầu bằng số 0");
        }
        while (true) {
            System.out.println("Mời nhập vào email");
            email = scanner.nextLine();
            if(CheckCode.checkEmail(email)){
                break;
            }
            System.out.println("Sai format Email rồi ba");
        }
        while (true){
            System.out.println("Mời nhập vào trình độ học vấn : Trung Cấp, Cao Đẳng, Đại Học, Sau Đại Học");
            education = StandardizedName.standardizedName(scanner.nextLine());
            if (CheckCode.checkEducation(education)){
                break;
            }
            System.out.println("Làm gì có cái trình độ '" + education + "' ba");
        }
        while (true){
            System.out.println("Mời nhập vào vị trí : Lễ Tân, Phục Vụ, Chuyên Viên, Giám Sát, Quản Lý, Giám Đốc");
            employeeType = StandardizedName.standardizedName(scanner.nextLine());
            if (CheckCode.checkEmployeeType(employeeType)){
                break;
            }
            System.out.println("Làm gì có vị trí '" + employeeType + "' ba");
        }
        while (true) {
            System.out.println("Mời nhập vào mức lương");
            String stringSalary = scanner.nextLine();
            if (CheckCode.checkSalary(stringSalary)){
                salary = Double.parseDouble(stringSalary);
                break;
            }
            System.out.println("Nhập sai lương rồi ba");
        }
        employeeRepository.addEmployee(new PEmployee(id, name, birthdayLocalTime, isMan, idCard, telephoneNumber, email, education, employeeType, salary));
    }

    @Override
    public void editEmployee() {

    }

    @Override
    public void deleteEmployee() {
    }

    @Override
    public void searchEmployeeByName() {

    }
}
