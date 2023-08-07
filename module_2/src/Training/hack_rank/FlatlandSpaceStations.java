package Training.hack_rank;

import java.util.*;

public class FlatlandSpaceStations {
    public static void main(String[] args) {
        System.out.println(flatlandSpaceStations(10, new  int[] {0,3,7}));
    }
    static int flatlandSpaceStations(int n, int[] c) {
        if (c.length == n){
            return 0;
        }else {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < c.length; i++){
                list.add(c[i]);
            }
            Collections.sort(list);
            List<Integer> distance = new ArrayList<>();
            distance.add(list.get(0) - 0);
            distance.add(n - 1 - list.get(list.size() - 1));

            for (int i = 0; i < list.size() - 1; i++){
                distance.add((list.get(i + 1) - list.get(i)) / 2);
            }
            Collections.sort(distance);
            return distance.get(distance.size() - 1);
        }
    }
}
