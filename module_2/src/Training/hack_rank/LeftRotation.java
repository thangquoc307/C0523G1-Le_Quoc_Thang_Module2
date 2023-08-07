package Training.hack_rank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotation {
    public static void main(String[] args) {
        System.out.println(rotLeft(new ArrayList<>(Arrays.asList(new Integer[]{1,2,3,4,5})), 0));
        System.out.println(rotLeft(new ArrayList<>(Arrays.asList(new Integer[]{1,2,3,4,5})), 1));
        System.out.println(rotLeft(new ArrayList<>(Arrays.asList(new Integer[]{1,2,3,4,5})), 2));
        System.out.println(rotLeft(new ArrayList<>(Arrays.asList(new Integer[]{1,2,3,4,5})), 3));
        System.out.println(rotLeft(new ArrayList<>(Arrays.asList(new Integer[]{1,2,3,4,5})), 4));
        System.out.println(rotLeft(new ArrayList<>(Arrays.asList(new Integer[]{1,2,3,4,5})), 5));
    }
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        List<Integer> index = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < a.size(); i++){
            int number = (d + i) % a.size();
            if (number < 0){
                number += a.size();
            }
            index.add(number);
        }
        for (Integer ind : index) {
            result.add(a.get(ind));
        }
        return result;
    }
}
