package b3_array_and_method.excercise;

public class Bt3_4MinValueIn2DimensionalArray {
    public static void main(String[] args) {
        int[][] array = {{8,2,5,7}, {6,7,8,9,6,4}, {2,4,5,7,7,9,9,6,4,3}};
        print(array);
        System.out.println("Min in Array is " + min(array));
    }
    public static void print(int[][]arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (j == arr[i].length - 1){
                    System.out.println(" " + arr[i][j]);
                }else {
                    System.out.print(" " + arr[i][j]);
                }
            }
        }
    }
    public static int min(int[][]arr){
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (min > arr[i][j]){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
}
