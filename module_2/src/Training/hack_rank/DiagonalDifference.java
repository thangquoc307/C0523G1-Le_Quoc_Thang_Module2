package Training.hack_rank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(new Integer[] {11,2,4}));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(new Integer[] {4,5,6}));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(new Integer[] {10,8,-12}));
        List<List<Integer>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);
        list.add(list3);
        System.out.println(diagonalDifference(list));
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < arr.size(); i++){
            sum1 += arr.get(i).get(i);
            sum2 += arr.get(i).get(arr.size() - 1 - i);
        }
        return Math.abs(sum1 - sum2);
    }
}
