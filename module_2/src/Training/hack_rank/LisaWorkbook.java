package Training.hack_rank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LisaWorkbook {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{3,8,15,11,14,1,9,2,24,31}));
        System.out.println(workbook(5,3,list));
    }
    public static int workbook(int n, int k, List<Integer> arr) {
        // Write your code here
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++){
            for (int j = 1; j <= arr.get(i); j++){
                list1.add(j);
            }
        }
        int mark = 0;
        int count = 0;
        for (int i = 0; i < list1.size(); i++){
            if (list1.get(i) == 1 || count == k){
                mark++;
                count = 1;
            } else {
                count++;
            }
            list2.add(mark);
        }
        System.out.println(list1);
        System.out.println(list2);
        int time = 0;
        for (int i = 0; i < list1.size(); i++){
            if (list1.get(i) == list2.get(i)){
                time++;
            }
        }
        return time;
    }
}
