package b3_array_and_method.excercise;

public class Bt3_3MergeArray {
    public static void main(String[] args) {
        int[] array1 = {1,3,4,5,6,7,8,8,4,3};
        int[] array2 = {6,7,9,9,0,7,5,9,4,6,7,8};
        print("Mảng 1 : ", array1);
        print("Mảng 2 : ", array2);
        print("Mảng gộp : ", merge(array1, array2));

    }
    public static void print(String text, int[] arr){
        System.out.println(text);
        for (int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println("");
    }
    public static int[] merge(int[] arr1, int[] arr2){
        int[] mergeArray = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++){
            mergeArray[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++){
            mergeArray[arr1.length + i] = arr2[i];
        }
        return mergeArray;
    }
}
