package Test.giai_thuat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question05 {
    //Xếp hàng theo chiều cao tăng dần:
    //Một nhóm người đứng thành hàng trong công viên. Giữa họ có một số cây không thể di chuyển
    //Giá trị “-1” đại diện cho cây trong công viên.
    public static void main(String[] args) {
        int[] arr1 = {-1, 150, 190, 170, -1, -1, 160, 180};
        int[] arr2 = {-1, 150, 165, 170, -1, -1, 160, 180};
        int[] arr3 = {150, -1, 190, 170, -1, -1, 160, 180};
        int[] arr4 = {-1, 150, 190, 170, -1, -1, 160, -1};
        int[] arr5 = {-1, 150, -1, 170, -1, -1, 160, 180};


        printArr(sortByHeight(arr1));
        printArr(sortByHeight(arr2));
        printArr(sortByHeight(arr3));
        printArr(sortByHeight(arr4));
        printArr(sortByHeight(arr5));
    }
    public static int[] sortByHeight(int[] arr){
        List<Integer> list = new ArrayList<>();
        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != -1){
                list.add(arr[i]);
                index.add(i);
            }
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++){
            arr[index.get(i)] = list.get(i);
        }
        return arr;
    }
    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
