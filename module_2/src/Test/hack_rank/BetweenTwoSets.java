package Test.hack_rank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BetweenTwoSets {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(2);
        a.add(4);
        b.add(16);
        b.add(32);
        b.add(96);
        System.out.println(getTotalX(a, b));
    }
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int count = 0;
        Collections.sort(a);
        Collections.sort(b);
        for (int i = a.get(a.size() - 1); i <= b.get(0); i++){
            if (checkSmallList(a, i) && checkLargeList(b, i)){
                count++;
            }
        }
        return count;
    }
    public static Boolean check(int divide, int mod){
        return divide % mod == 0;
    }
    public static Boolean checkSmallList(List<Integer> list, int number){
        for (Integer integer : list){
            if (!check(number, integer)){
                return false;
            }
        }
        return true;
    }
    public static Boolean checkLargeList(List<Integer> list, int number){
        for (Integer integer : list){
            if (!check(integer, number)){
                return false;
            }
        }
        return true;
    }
}
