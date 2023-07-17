package b19_string_and_regex.excercise.validate_class_name;

public class ValidateClassNameTest {
    public static void main(String[] args) {
        String[] list = {"C0223G", "A0323K", "M0318G", "P0323A", "sgnwr", "â002"};
        for (String string : list){
            ValidateClassName.vailidate(string);
        }
    }
}
