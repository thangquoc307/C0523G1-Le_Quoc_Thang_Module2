package Test.giai_thuat;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Question25 {
    //Hãy tìm giá trị trong mảng các số thực xa giá trị x nhất
    public static void main(String[] args) {
        printDouble(findX(new double[] {13.5, 4456.23423423, 723424.12, 234234.1, 534234.432}, 15.5));
        printDouble(findX(new double[] {22343534.12, 42312312.13, 7235345.154}, 42312312.12));
        printDouble(findX(new double[] {22343534.12, 42312312.13, 7235345.154}, 0));
        printDouble(findX(new double[] {22343534.12, 42312312.13, 7235345.154}, 7235350.154));
        printDouble(findX(new double[] {22343534.12, 42312312.13, 7235345.154, 0, -5}, 42312312.12));

    }
    public static Double findX(double[] arr, double number){
        double[] newArray = new double[arr.length];
        for (int i = 0; i < arr.length; i++){
            newArray[i] = Math.abs(arr[i] - number);
        }
        double max = newArray[0];
        int index = 0;
        for (int i = 0; i < newArray.length; i++){
            if (max < newArray[i]){
                max = newArray[i];
                index = i;
            }
        }
        return arr[index];
    }
    public static void printDouble(Double number){
        System.out.println(String.format("%.2f", number));
    }
}
