package b3_array_and_method.excercise;

import java.util.Scanner;

public class Bt8Frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập vào chuỗi ký tự : ");
        String str = scanner.nextLine();
        System.out.println("Bạn muốn kiếm ký tự nào : ");
        char key = scanner.next().charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++){
            if(key == str.charAt(i)){
                count++;
            }
        }
        System.out.println("Ký tự : " + key + " xuất hiện " + count + " lần");
    }
}
