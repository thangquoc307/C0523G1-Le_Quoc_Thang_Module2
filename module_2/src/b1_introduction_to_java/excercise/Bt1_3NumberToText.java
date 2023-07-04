package b1_introduction_to_java.excercise;

import java.util.Scanner;

public class Bt1_3NumberToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vô số 4 chữ số thôi nghe :3 nhiều hơn ko biêt code : ");
        int number = scanner.nextInt();
        String numberString = String.valueOf(number);
        String text = "";

        for (int i = 0; i < numberString.length(); i++){
            char x = numberString.charAt(i);
            if (x != '0'){
                switch (x){
                    case '1':
                        if(numberString.length() - i == 2){
                            text += "mười";
                        }else {
                            text += "một ";
                        }
                        break;
                    case '2':
                        text += "hai ";
                        break;
                    case '3':
                        text += "ba ";
                        break;
                    case '4':
                        text += "bốn ";
                        break;
                    case '5':
                        text += "năm ";
                        break;
                    case '6':
                        text += "sáu ";
                        break;
                    case '7':
                        text += "bảy ";
                        break;
                    case '8':
                        text += "tám ";
                        break;
                    case '9':
                        text += "chín ";
                        break;
                }
                switch (numberString.length() - i){
                    case 4:
                        text += "nghìn ";
                        break;
                    case 3:
                        text += "trăm ";
                        break;
                    case 2:
                        if(numberString.length() - i != 2){
                            text += "mươi ";
                        }
                        break;
                }
            }
        }
        System.out.println(text);
    }
}
