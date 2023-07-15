package b14_sorting_method.excercise.insert_sort;

public class InsertSort {
    public static int[] InsertSort(int[] sortList) {
        for (int i = 1; i < sortList.length; i++) {
            int insertItem = sortList[i];
            for (int j = i - 1; j >= 0; j--) {
                if (insertItem >= sortList[j]) {
                    sortList[j + 1] = insertItem;
                    break;
                } else {
                    sortList[j + 1] = sortList[j];
                    sortList[j] = insertItem;
                }
            }
        }
        return sortList;
    }
}
