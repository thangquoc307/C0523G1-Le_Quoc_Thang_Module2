package CaseStudy.utils;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.regex.Pattern;
public class CheckCode {
    private static String employeeCodeRegex = "^NV-[0-9]{4}$";
    private static String customerCodeRegex = "^KH-[0-9]{4}$";
    private static String idCard = "^([0-9]{9}|[0-9]{12})$";
    private static String time = "^[0-3][0-9]/[0-1][0-9]/[1-2][0-9]{3}$";
    private static String telephone = "^0[0-9]{9}$";
    private static String email = "^.+@.+\\.com\\.?";
    private static String number = "^[0-9]+\\.?[0-9]*$";
    private static String education = "^Trung Cấp$|^Cao Đẳng$|^Đại Học$|^Sau Đại Học$";

    private static String employeeType = "^Lễ Tân$|^Phục Vụ$|^Chuyên Viên$|^Giám Sát$|^Quản Lý$|^Giám Đốc$";
    private static String customerType = "^Diamond$|^Platinum Gold$|^Silver$|^Member$";
    private static String facilityVilla = "^SVVL-[0-9]{4}$";
    private static String facilityHouse = "^SVHO-[0-9]{4}$";
    private static String facilityRoom = "^SVRO-[0-9]{4}$";
    private static String rentType = "^Năm$|^Tháng$|^Ngày$|^Giờ$";
    private static String standard = "^[1-5]$";
    private static String level = "^[1-9][0-9]*$";
    private static boolean checkCode(String regex, String text){
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(text).matches();
    }
    public static boolean checkEmployeeCode(String text){
        return checkCode(employeeCodeRegex, text);
    }
    public static boolean checkCustomerCode(String text){
        return checkCode(customerCodeRegex, text);
    }
    public static boolean checkIDCard(String text){
        return checkCode(idCard, text);
    }
    public static boolean time(String text){
            try{
                String[] list = text.split("/");
                LocalDate.of(Integer.parseInt(list[2]),Integer.parseInt(list[1]),Integer.parseInt(list[0]));
                return true;
            } catch (DateTimeException e){
                System.out.println("Làm gì có ngày này bà noại");
                return false;
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Nhập sai format kìa");
                return false;
            }
    }
    public static boolean checkTelephoneNumber(String text){
        return checkCode(telephone, text);
    }
    public static boolean checkEmail(String text){
        return checkCode(email, text);
    }
    public static boolean checkEmployeeType(String text){
        return checkCode(employeeType, text);
    }
    public static boolean checkCustomerType(String text){
        return checkCode(customerType, text);
    }
    public static boolean checkEducation(String text){
        return checkCode(education, text);
    }
    public static boolean checkNumber(String text){
        return checkCode(number, text);
    }
    public static int checkFacility(String text){
        ArrayList<Boolean> list = new ArrayList<>();
        list.add(checkCode(facilityVilla, text));
        list.add(checkCode(facilityHouse, text));
        list.add(checkCode(facilityRoom, text));
        return list.indexOf(true);
    }
    public static boolean checkRentType(String text){
        return checkCode(rentType, text);
    }
    public static boolean checkStandard(String text){
        return checkCode(standard, text);
    }
    public static boolean checkLevel(String text){
        return checkCode(level, text);
    }
}
