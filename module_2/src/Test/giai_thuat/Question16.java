package Test.giai_thuat;

import java.util.ArrayList;
import java.util.List;

public class Question16 {
    //Cho mảng a chứa các số nguyên
    //Xây dựng mảng b là prefix của mảng a cụ thể theo công thức:
    //  b[0]   = a[0]
    //  b[1]   = a[0] + a[1]
    //  b[2]   = a[0] + a[1] + a[2]
    //  ...
    //  b[n - 1] = a[0] + a[1] + ... + a[n - 1]
    //với n là độ dài của mảng a.
    public static void main(String[] args) {
        System.out.println(prefixSums(new int[]{1,2,3}));
        System.out.println(prefixSums(new int[]{1,4,3}));
        System.out.println(prefixSums(new int[]{2,1,5}));
        System.out.println(prefixSums(new int[]{1,5,7}));
        System.out.println(prefixSums(new int[]{1,2,3,4,0}));
    }
    public static List<Integer> prefixSums(int[] arr){
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            list.add(sum);
        }
        return list;
    }
}
