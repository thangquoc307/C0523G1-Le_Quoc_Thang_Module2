package Training.hack_rank;

import java.util.*;

public class PickingNumber {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(3);
        list1.add(3);
        list1.add(1);
        list2.add(1);
        list2.add(2);
        list2.add(2);
        list2.add(3);
        list2.add(1);
        list2.add(2);
        System.out.println(pickingNumbers(list1));
        System.out.println(pickingNumbers(list2));

    }
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        Map<Integer, Integer> map = putMap(a);
        List<Integer> listKey = new ArrayList<>(map.keySet());
        if (listKey.size() == 1){
            return map.get(listKey.get(0));
        }
        Set<Integer> listCouple = new TreeSet<>();
        for (int i = 0; i < listKey.size() - 1; i++){
            if (listKey.get(i + 1) - listKey.get(i) == 1){
                listCouple.add(map.get(listKey.get(i)) + map.get(listKey.get(i + 1)));
            }
        }
        Set<Integer> listValue = new TreeSet<>(map.values());
        listCouple.addAll(listValue);
        Object[] arr = listCouple.toArray();
        return (int)arr[arr.length - 1];
    }
    public static Map<Integer, Integer> putMap(List<Integer> list){
        Map<Integer, Integer> map = new TreeMap<>();
        for (Integer integer : list){
            if (map.containsKey(integer)){
                map.put(integer, map.get(integer) + 1);
            } else {
                map.put(integer, 1);
            }
        }
        return map;
    }
}
