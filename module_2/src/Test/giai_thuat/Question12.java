package Test.giai_thuat;

import java.util.ArrayList;
import java.util.List;

public class Question12 {
    //Để chúc mừng ngày 8/3, các bạn học sinh lớp 12A3 dự định tổ chức dã ngoại đến biển Nha Trang và lớp sẽ đi bằng taxi.
    //Các bạn trong lớp được chia thành n nhóm, mỗi nhóm thứ i gồm x bạn (1 ≤ x ≤ 4 vì mỗi chiếc taxi chở tối đa 4 hành khách).
    public static void main(String[] args) {
        System.out.println("Tổng số xe sử dụng : " + divTaxi(new int[] {1,2,4,3,3}));
        System.out.println("Tổng số xe sử dụng : " + divTaxi(new int[] {1,2,4,2,3}));
        System.out.println("Tổng số xe sử dụng : " + divTaxi(new int[] {4,2,4,3,3}));
        System.out.println("Tổng số xe sử dụng : " + divTaxi(new int[] {1,2,4,3,1,2}));
        System.out.println("Tổng số xe sử dụng : " + divTaxi(new int[] {2,2,4,3,2,3,1,1,1,1,1}));
    }
    public static int divTaxi(int[] arr){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }

        int carCap4 = 0;
        int carInsert4 = 0;

        while (list.contains(4)){
            int index = list.indexOf(4);
                list.remove(index);
                carCap4++;
        }
        while (list.contains(3) && list.contains(1)){
            int index3 = list.indexOf(3);
            int index1 = list.indexOf(1);
            list.remove(index3);
            list.remove(index1);
            carInsert4++;
        }
        while (true){
            int indexFirst = list.indexOf(2);
            int indexLast = list.lastIndexOf(2);

            if (indexFirst != indexLast && indexFirst != -1 && indexLast != -1){
                list.remove(indexLast);
                list.remove(indexFirst);
                carInsert4++;
            } else {
                break;
            }
        }
        while (list.contains(3)){
            int index3 = list.indexOf(3);
            list.remove(index3);
            carInsert4++;
        }
        while (list.contains(2)){
            int index2 = list.indexOf(2);
            list.remove(index2);
            if (list.contains(1)){
                int index1 = list.indexOf(1);
                list.remove(index1);
            }
            if (list.contains(1)){
                int index1 = list.indexOf(1);
                list.remove(index1);
            }
            carInsert4++;
        }
        while (list.contains(1)) {
            int index1 = list.indexOf(1);
            list.remove(index1);
            if (list.contains(1)) {
                int index1bonus = list.indexOf(1);
                list.remove(index1);
            }
            if (list.contains(1)) {
                int index1bonus = list.indexOf(1);
                list.remove(index1);
            }
            if (list.contains(1)) {
                int index1bonus = list.indexOf(1);
                list.remove(index1);
            }
            carInsert4++;
        }
        return carCap4 + carInsert4;
    }
}
