package CaseStudy.utils;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckKey {
    public static int checkKey(){
        System.out.print("The Number you choice : ");
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();

        String regex = "^[0-9]$";
        Pattern pattern = Pattern.compile(regex);
        Boolean checkedResult = pattern.matcher(choose).matches();

        if (checkedResult){
            return Integer.parseInt(choose);
        }else {
            System.err.println("Làm gì có chức năng '" + choose + "' bà noại");
            return -1;
        }
    }
}
