package Training.hack_rank;

import java.util.*;

public class MinimumDistance {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(7);
        System.out.println(minimumDistances(list));
    }
    public static int minimumDistances(List<Integer> a) {
        // Write your code here
        Set<Integer> setList = new HashSet<>(a);
        Set<Integer> result = new TreeSet<>();
        if (setList.size() == a.size()){
            return -1;
        } else {
            for (Integer integer : setList){
                if (checkOneTime(integer, a)) {
                    int distance = listDistance(integer, a);
                    result.add(distance);
                }
            }
        }
        List<Integer> resultList = new ArrayList<>(result);
        return resultList.get(0);
    }
    public static int listDistance(int number, List<Integer> a){
        List<Integer> listIndex = new ArrayList<>();
        Set<Integer> setDistance = new TreeSet<>();
        for (int i = 0; i < a.size(); i++){
            if (number == a.get(i)){
                listIndex.add(i);
            }
        }
        for (int i = 0; i < listIndex.size() - 1; i++){
            setDistance.add(listIndex.get(i + 1) - listIndex.get(i));
        }
        List<Integer> result = new ArrayList<>(setDistance);
        return result.get(0);
    }
    public static boolean checkOneTime(int number, List<Integer> a){
        int count = 0;
        for (Integer integer : a){
            if (integer == number){
                count++;
            }
        }
        return count > 1;
    }
}
