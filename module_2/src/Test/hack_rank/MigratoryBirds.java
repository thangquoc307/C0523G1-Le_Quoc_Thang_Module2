package Test.hack_rank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(4);
        int num = migratoryBirds(arr);
        System.out.println(num);
    }
    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> mapCount = mapCount(arr);
        int maxNumber = arr.get(0);
        for (Integer key : mapCount.keySet()){
            if (mapCount.get(maxNumber) < mapCount.get(key)){
                maxNumber = key;
            } else if(mapCount.get(maxNumber) < mapCount.get(key) && maxNumber > key){
                maxNumber = key;
            }
        }
        return maxNumber;
    }
    public static Map<Integer, Integer> mapCount(List<Integer> arr){
        Map<Integer, Integer> mapCount = new HashMap<>();
        for (Integer number : arr){
            if (mapCount.containsKey(number)){
                mapCount.put(number, mapCount.get(number) + 1);
            }else {
                mapCount.put(number, 1);
            }
        }
        return mapCount;
    }

}