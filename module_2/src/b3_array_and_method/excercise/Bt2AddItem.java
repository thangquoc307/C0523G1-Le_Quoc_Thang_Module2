package b3_array_and_method.excercise;

import java.util.Scanner;

public class Bt2AddItem {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        print(arr);

        System.out.println("");
        System.out.print("Bạn muốn thêm số nào : ");
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        System.out.print("Ở vị trí nào : ");
        int ind = Integer.parseInt(scanner.nextLine());

        print(add(arr, num, ind));

    }
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
    }
    public static int[] add(int[] arr, int num, int ind) {
        int[] newArr = new int[arr.length + 1];
        if (ind < 0 || ind > arr.length){
            return arr;
        }else {
            for (int i = 0; i < ind; i++) {
                newArr[i] = arr[i];
            }
            newArr[ind] = num;
            for (int i = ind + 1; i < newArr.length; i++) {
                newArr[i] = arr[i - 1];
            }
            return newArr;
        }
    }
}

