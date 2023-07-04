package b3_array_and_method.excercise;

import java.util.Scanner;

public class Bt3_1RemoveItem {
    public static void main(String[] args) {
        int[] arr = {1,3,4,56,7,8,4,5,6,8,9,56,4,3};
        print(arr);

        System.out.println("");
        System.out.print("Bạn muốn xóa số nào : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        print(remove(arr, num));

    }
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
    }
    public static int[] remove(int[] arr, int x){
        int index = -1;
        for (int i = 0; i < arr.length; i++){
            if (x == arr[i]){
                index = i;
                break;
            }
        }
        int[] newArr = new int[arr.length - 1];
        if (index == -1){
            return arr;
        }else {
            for (int i = 0; i < index; i++){
                newArr[i] = arr[i];
            }
            for (int i = index; i < newArr.length; i++){
                newArr[i] = arr[i + 1];
            }
        }
        return newArr;
    }
}
