package Training.hack_rank;

import java.util.*;

public class MinimumSwaps {
    public static void main(String[] args) {

        System.out.println(minimumSwaps(new int[]{7,1,3,2,4,5,6}));
        System.out.println(minimumSwaps(new int[]{4,3,1,2}));
    }
    static int minimumSwaps(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (Integer number : arr){
            list.add(number);
        }
        int step = 0;
        for (int i = 0; i < arr.length - 1; i++){
            if (list.get(i) != (i + 1)){
                int index = list.lastIndexOf(i + 1);
                list.set(index, list.get(i));
                step++;
            }
        }
        return step;
    }
}
