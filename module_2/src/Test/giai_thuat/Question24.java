package Test.giai_thuat;

import java.util.ArrayList;
import java.util.List;

public class Question24 {
    //Hãy liệt kê các giá trị trong mảng 1 chiều các số nguyên có chữ số đầu tiên là chữ số lẻ
    public static void main(String[] args) {
        System.out.println(checkLong(new Long[] {13L, 4456L, 723424L, 234234L, 534234L}));
        System.out.println(checkLong(new Long[] {22343534L, 42312312L, 7235345L}));
        System.out.println(checkLong(new Long[] {22343534L, 42312312L, 7235345L, 15L, 1354323L}));
        System.out.println(checkLong(new Long[] {42343534L, 12312312L, 6235345L, 54342321321L}));
        System.out.println(checkLong(new Long[] {22343534L, 42312312L, 6235345L}));

    }
    public static List<Long> checkLong(Long[] arr){
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            Boolean check = Integer.parseInt((arr[i] + "").charAt(0) + "") % 2 == 1;
            if (check){
                list.add(arr[i]);
            }
        }
        return list;
    }
}
