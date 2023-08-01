package Test.giai_thuat;

import java.util.*;

public class Question07 {
    //Viết hàm truyền vào một mảng 2 chiều (n x n) chứa các số nguyên bất kỳ
    //Hàm sẽ trả về 1 mảng (1 chiều )các số nguyên tố đã được sắp xếp tăng dần. Với các phần tử là các số nguyên tố xuất hiện trong mảng 2 chiều.
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,8,43}, {9,4,11,7}, {11,6,4,0}, {1,2,6,51}};
        int[][] arr2 = {{1,2,8,43}, {9,49,11,7}, {11,23,4,0}, {11,23,4,0}};
        int[][] arr3 = {{1,2,8,43}, {9,4,11,8}, {11,6,4,0}, {11,6,4,0}};
        int[][] arr4 = {{1,10,8,44}, {9,4,12,8}, {16,6,4,0}, {1,4,6,51}};
        int[][] arr5 = {{1,3,8,43}, {9,4,11,7}, {11,6,4,0}, {1,2,6,51}};

        System.out.println(sortList(arr1));
        System.out.println(sortList(arr2));
        System.out.println(sortList(arr3));
        System.out.println(sortList(arr4));
        System.out.println(sortList(arr5));
    }
    public static Set<Integer> sortList(int[][] arr){
        Set<Integer> integerSet = new TreeSet<>();
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (checkNum(arr[i][j])){
                    integerSet.add(arr[i][j]);
                }
            }
        }
        return integerSet;
    }
    public static Boolean checkNum(int number){
        if (number < 2){
            return false;
        } else if (number == 2) {
            return true;
        } else {
            for (int i = 2; i <= number/2; i++){
                if (number % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
