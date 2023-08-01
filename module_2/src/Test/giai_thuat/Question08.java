package Test.giai_thuat;

import java.util.*;

public class Question08 {
    //Tìm số lần xuất hiện mảng con trong mảng cha
    //Điều kiện child là con của parent (các phần tử trong mảng child xuất hiện ít nhất 1 lần trong mảng parent)
    public static void main(String[] args) {
        System.out.println(checkParent(new int[]{1,4,5,2,1}, new int[]{1,2,3}));
        System.out.println(checkParent(new int[]{1,4,5,2,3}, new int[]{1,2,3}));
        System.out.println(checkParent(new int[]{1,4,5,2,3,2,3,1}, new int[]{1,2,3}));
        System.out.println(checkParent(new int[]{1,4,5,2,3,2,3,8}, new int[]{1,2,3}));
        System.out.println(checkParent(new int[]{1,2,3}, new int[]{1,1,1}));

    }
    public static int checkParent(int[] parentList, int[] childList){
        Map<Integer, Integer> parentMap = convert(parentList);
        Map<Integer, Integer> childMap = convert(childList);
        Set<Integer> time = new TreeSet<>();
        for (Integer key : childMap.keySet()) {
            if (parentMap.containsKey(key)) {
                time.add(parentMap.get(key) / childMap.get(key));
            } else {
                time.add(0);
            }
        }
        for (Integer integer : time){
            return integer;
        }
        return 0;
    }
    public static Map<Integer, Integer> convert(int[] list){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.length; i++){
            if (map.containsKey(list[i])){
                map.put(list[i], map.get(list[i]) + 1);
            } else {
                map.put(list[i], 1);
            }
        }
        return map;
    }
}
