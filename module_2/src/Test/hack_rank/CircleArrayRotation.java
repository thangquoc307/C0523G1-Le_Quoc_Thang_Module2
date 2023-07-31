package Test.hack_rank;

import java.util.ArrayList;
import java.util.List;

public class CircleArrayRotation {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> queries = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        queries.add(0);
        queries.add(1);
        queries.add(2);
        System.out.println(circularArrayRotation(a, 2, queries));


    }
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        k = -k;
        List<Integer> indexList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = k; i < a.size() + k; i++){
            int index = i % (a.size());
            if (index < 0){
                index += a.size();
            }
            indexList.add(index);
        }
        for (Integer integer : queries){
            int index = indexList.get(integer);
            result.add(a.get(index));
        }
        return result;
    }
}
