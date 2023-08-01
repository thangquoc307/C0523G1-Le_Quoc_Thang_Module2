package Test.giai_thuat;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Question19 {
    //Cho một mảng số nguyên
    //Hãy kiểm tra xem tần số xuất hiện của tất cả các số nguyên trong mảng có bằng nhau hay không
    public static void main(String[] args) {
        System.out.println(checkEqualFrequency(new int[] {1, 2, 2, 1}));
        System.out.println(checkEqualFrequency(new int[] {1, 2, 2, 3, 1, 3, 1, 3}));
        System.out.println(checkEqualFrequency(new int[] {1, 2, 2, 3, 1, 3, 1, 3, 0}));
        System.out.println(checkEqualFrequency(new int[] {1, 2, 2, 3, 1, 3, 1, 3, 2}));
        System.out.println(checkEqualFrequency(new int[] {1, 2, 2, 0, 1, 3, 0, 3}));

    }
    public static boolean checkEqualFrequency(int[] arr){
        Map<Integer, Integer> map = addToMap(arr);
        Set<Integer> set = new HashSet<>();
        for (Integer keyMap : map.keySet()){
            set.add(map.get(keyMap));
        }
        return set.size() == 1;
    }
    public static Map<Integer, Integer> addToMap(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        return map;
    }
}
