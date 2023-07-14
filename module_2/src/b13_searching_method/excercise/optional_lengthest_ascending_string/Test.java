package b13_searching_method.excercise.optional_lengthest_ascending_string;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //String for testing : 1235612894312598
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi ký tự cái đê");
        String string = scanner.nextLine();
        LongthestAscenthestString.longestAscendingString(string);
    }
}
