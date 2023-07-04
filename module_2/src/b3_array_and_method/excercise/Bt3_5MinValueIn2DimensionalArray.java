package b3_array_and_method.excercise;

import java.util.Scanner;

public class Bt3_5MinValueIn2DimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời nhập vào số lượng phần tử trong mảng : ");
        int length = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[length];

        for (int i = 0; i < length; i++){
            System.out.print("Mời nhập vào phần tử thứ " + (i + 1) + " : ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        print(arr);
        System.out.println("");
        System.out.println("Min of Array : " + min(arr));
    }
    public static void print(int[]arr){
        System.out.print("Mảng : ");
        for (int i = 0; i < arr.length; i++){
                    System.out.print(" " + arr[i]);
            }
        }
    public static int min(int[]arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
