package Training.hack_rank;

import java.util.ArrayList;
import java.util.List;

public class JumpingOnTheClouds2 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(0);
        list1.add(0);
        list1.add(1);
        list1.add(0);
        list1.add(0);
        list1.add(1);
        list1.add(0);
        list2.add(0);
        list2.add(0);
        list2.add(0);
        list2.add(0);
        list2.add(1);
        list2.add(0);
        System.out.println(jumpingOnClouds(list1));
        System.out.println(jumpingOnClouds(list2));
    }
    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int step = 0;
        int position = 0;
        while (position < c.size()){
            if (position + 2 >= c.size() - 1){
                step++;
                break;
            } else if (c.get(position + 2) == 1){
                position += 1;
            } else {
                position += 2;
            }
            step++;
        }
        return step;
    }
}
