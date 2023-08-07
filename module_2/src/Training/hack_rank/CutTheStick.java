package Training.hack_rank;

import java.util.*;

public class CutTheStick {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(5);
        list1.add(4);
        list1.add(4);
        list1.add(2);
        list1.add(2);
        list1.add(8);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(3);
        list2.add(3);
        list2.add(2);
        list2.add(1);

        System.out.println(cutTheSticks(list1));
        System.out.println(cutTheSticks(list2));
    }
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> map = new TreeMap<>();
        for (Integer number : arr){
            if (map.containsKey(number)){
                map.put(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }
        List<Integer> listTime = new ArrayList<>();
        List<Integer> listAdd = new ArrayList<>();
        for (Integer key : map.keySet()){
            listTime.add(map.get(key));
        }
        Collections.reverse(listTime);
        int sum = 0;
        for (Integer number : listTime){
            sum += number;
            listAdd.add(sum);
        }
        Collections.reverse(listAdd);
        return listAdd;
    }
}
