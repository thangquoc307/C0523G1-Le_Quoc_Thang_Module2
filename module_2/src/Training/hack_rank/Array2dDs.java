package Training.hack_rank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array2dDs {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(new Integer[]{1,1,1,0,0,0}));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(new Integer[]{0,1,0,0,0,0}));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(new Integer[]{1,1,1,0,0,0}));
        List<Integer> list4 = new ArrayList<>(Arrays.asList(new Integer[]{0,0,2,4,4,0}));
        List<Integer> list5 = new ArrayList<>(Arrays.asList(new Integer[]{0,0,0,2,0,0}));
        List<Integer> list6 = new ArrayList<>(Arrays.asList(new Integer[]{0,0,1,2,4,0}));
        List<List<Integer>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);
        list.add(list5);
        list.add(list6);
        System.out.println(hourglassSum(list));
    }
    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                int sum = 0;
                sum += arr.get(i).get(j);
                sum += arr.get(i).get(j + 1);
                sum += arr.get(i).get(j + 2);
                sum += arr.get(i + 1).get(j + 1);
                sum += arr.get(i + 2).get(j);
                sum += arr.get(i + 2).get(j + 1);
                sum += arr.get(i + 2).get(j + 2);
                result.add(sum);
            }
        }
        Collections.sort(result);
        return result.get(result.size() - 1);
    }
}
