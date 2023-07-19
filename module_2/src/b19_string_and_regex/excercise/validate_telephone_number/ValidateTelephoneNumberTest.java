package b19_string_and_regex.excercise.validate_telephone_number;

public class ValidateTelephoneNumberTest {
    public static void main(String[] args) {
        String[] list = {"(84)-(0978489648)", "(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};
        for (String string : list){
            ValidateTelephoneNumber.vailidate(string);
        }
    }
}
