package b14_sorting_method.excercise;

import sun.management.snmp.jvmmib.EnumJvmThreadContentionMonitoring;

public class InsertSortStep {
    public static void main(String[] args) {

        int[] list = {66, 34, 26, 98, 10, 64, 38, 96, 35};
        list = InsertSort(list);
        System.out.println("");
        System.out.println("Kết quả sau khi Sort");
        print(list);
    }
    public static int[] InsertSort(int[] sortList) {
        for (int i = 1; i < sortList.length; i++){
            int insertItem = sortList[i];
            for (int j = i - 1; j >= 0; j--){
                if (insertItem >= sortList[j]){
                    sortList[j + 1] = insertItem;
                    break;
                }else {
                    sortList[j + 1] = sortList[j];
                    sortList[j] = insertItem;
                }
            }

            System.out.println("Lần chạy cho list index : " + i + " cho số " + insertItem);
            print(sortList);
            System.out.println("");
            System.out.println("");

        }
        return sortList;
    }
    public static void print(int[] printList){
        for(int number : printList){
            System.out.print(number + " ");
        }
    }
}

