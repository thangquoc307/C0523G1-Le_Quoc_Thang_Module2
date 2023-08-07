package Training.hack_rank;

import java.util.*;

public class CounTripletsDraft {
    public static void main(String[] args) {
        System.out.println(countTriplets(new ArrayList<Long>(Arrays.asList(new Long[]{1L,2L,2L,4L})), 2));
        System.out.println(countTriplets(new ArrayList<Long>(Arrays.asList(new Long[]{1L,3L,9L,9L,27L,81L})), 3));
        System.out.println(countTriplets(new ArrayList<Long>(Arrays.asList(new Long[]{1L,5L,5L,25L,1L,25L})), 5));
        System.out.println(countTriplets(new ArrayList<Long>(Arrays.asList(new Long[]{1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L})), 1));
    }
    public static long countTriplets(List<Long> arr, long r) {
        long count = 0;

        for (int i = 0; i < arr.size() - 2; i++){
            for (int j = i + 1; j < arr.size() - 1; j++){
                for (int k = j + 1; k < arr.size(); k++){
                    if (arr.get(i) * r == arr.get(j) && arr.get(j) * r == arr.get(k)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
