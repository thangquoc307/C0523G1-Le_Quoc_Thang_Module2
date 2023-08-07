package Training.hack_rank;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TheHurdleRace {
    public static void main(String[] args) {
        List<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(6);
        height.add(3);
        height.add(5);
        height.add(2);
        System.out.println(hurdleRace(4, height));
    }
    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        Set<Integer> heightSet = new TreeSet<>(height);
        Object[] arr = heightSet.toArray();
        int add = (int)arr[arr.length - 1] - k;
        if (add < 0){
            add = 0;
        }
        return add;
    }
}
