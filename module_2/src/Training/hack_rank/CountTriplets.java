package Training.hack_rank;

import java.util.*;

public class CountTriplets {
    public static void main(String[] args) {

        System.out.println(countTriplets(new ArrayList<Long>(Arrays.asList(new Long[]{1L,2L,2L,4L})), 2));
        System.out.println(countTriplets(new ArrayList<Long>(Arrays.asList(new Long[]{1L,3L,9L,9L,27L,81L})), 3));
        System.out.println(countTriplets(new ArrayList<Long>(Arrays.asList(new Long[]{1L,5L,5L,25L,1L,25L})), 5));
        System.out.println(countTriplets(new ArrayList<Long>(Arrays.asList(new Long[]{1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L})), 1));
    }
    public static long countTriplets(List<Long> arr, long r) {
        long count = 0;
        Map<Long, Integer> map = new TreeMap<>();
        for (Long number : arr){
            if (map.containsKey(number)){
                map.put(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }
        List<Long> list = new ArrayList<>(map.keySet());
        if (r > 1) {
            for (int i = 0; i < list.size() - 2 && list.get(i) * Math.pow(r, 2) <= list.get(list.size() - 1); i++) {
                long number1 = list.get(i);
                long number2 = number1 * r;
                long number3 = number2 * r;
                if (!map.containsKey(number2) || !map.containsKey(number3)) {
                    continue;
                } else {
                    count += (map.get(number1) * map.get(number2) * map.get(number3));
                }
            }
        } else {
            for (Long number : map.keySet()) {
                long value = map.get(number);
                if (value >= 3){
                    count += chinhHop(value, 3);
                }
            }
        }
        return count;
    }
    public static long chinhHop(long arr, long number){
        long tohop = 1;
        long giaiThua = 1;
        for (long i = arr; i > arr - number; i--){
            tohop *= i;
        }
        for (long i = 1; i <= number; i++){
            giaiThua *= i;
        }
        return tohop / giaiThua;
    }
}
