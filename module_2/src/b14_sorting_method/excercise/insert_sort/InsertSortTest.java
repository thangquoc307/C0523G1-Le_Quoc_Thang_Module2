package b14_sorting_method.excercise.insert_sort;

import java.util.Scanner;

public class InsertSortTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng cần Sort");
        int arrayLength = Integer.parseInt(scanner.nextLine());
        int[] list = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++){
            System.out.println("Nhập phần tử thứ " + (i+1) + " : ");
            list[i] = Integer.parseInt(scanner.nextLine());
        }
        int[] sortList = InsertSort.InsertSort(list);

        for (int number : sortList){
            System.out.print(number + " ");
        }
    }
}
