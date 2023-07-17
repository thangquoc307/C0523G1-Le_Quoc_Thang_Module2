package b19_string_and_regex.excercise.validate_class_name;

import java.util.regex.Pattern;

public class ValidateClassName {
    private static final String CLASS_NAME_REGEX = "^[CAP][0-9]{4}[GHIK]$";
    public static void vailidate(String className){
        Boolean result = Pattern.compile(CLASS_NAME_REGEX).matcher(className).matches();
        if (result){
            System.out.println("Tên lớp '" + className + "' hợp lệ");
        }else {
            System.out.println("Tên lớp '" + className + "' không hợp lệ");
        }
    }
}
