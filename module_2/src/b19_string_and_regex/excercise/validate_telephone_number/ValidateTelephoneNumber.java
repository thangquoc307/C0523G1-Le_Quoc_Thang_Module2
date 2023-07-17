package b19_string_and_regex.excercise.validate_telephone_number;

import java.util.regex.Pattern;

public class ValidateTelephoneNumber {
    private static final String CLASS_NAME_REGEX = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";
    public static void vailidate(String telephoneNumber){
        Boolean result = Pattern.compile(CLASS_NAME_REGEX).matcher(telephoneNumber).matches();
        if (result){
            System.out.println("Số điện thoại '" + telephoneNumber + "' hợp lệ");
        }else {
            System.out.println("Số điện thoại '" + telephoneNumber + "' không hợp lệ");
        }
    }
}
