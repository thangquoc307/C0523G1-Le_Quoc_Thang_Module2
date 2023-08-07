package Training.giai_thuat;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Question13 {
    //Viết phương thức trả về index số lớn thứ nhì trong mảng. Nếu không có số lớn nhì thì trả về -1. Nếu có nhiều số lớn nhì thì lấy vị trí của số đầu tiên.
    public static void main(String[] args) {
        System.out.println(secondLagerNum(new int[] {8,3,6,1,4,5}));
        System.out.println(secondLagerNum(new int[] {8,3,4,1,5,4}));
        System.out.println(secondLagerNum(new int[] {10,3,8,1,9,4,9}));
        System.out.println(secondLagerNum(new int[] {8,8,8,8,8}));
        System.out.println(secondLagerNum(new int[] {8,3,6,1,5,4,7}));

    }
    public static int secondLagerNum(int[] arr){
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < arr.length; i++){
            list.add(arr[i]);
            set.add(arr[i]);
        }
        if (set.size() < 2){
            return -1;
        } else {
            List<Integer> setList = new ArrayList<>(set);
            int secondNum = setList.get(setList.size() - 2);
            return list.indexOf(secondNum);
        }
    }
}
