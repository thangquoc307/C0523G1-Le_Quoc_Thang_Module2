package Test.hack_rank;

import java.util.ArrayList;
import java.util.List;

public class AngryProfessor {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(-1);
        list1.add(-3);
        list1.add(4);
        list1.add(2);
        System.out.println(angryProfessor(3, list1));

        List<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(-1);
        list2.add(2);
        list2.add(1);
        System.out.println(angryProfessor(2, list1));

    }
    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        for (Integer integer : a){
            if (integer <= 0){
                k--;
            }
        }
        if (k <= 0){
            return "NO";
        } else {
            return "YES";
        }
    }
}
