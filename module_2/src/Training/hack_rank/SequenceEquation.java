package Training.hack_rank;

import java.util.ArrayList;
import java.util.List;

public class SequenceEquation {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        System.out.println(permutationEquation(list));
    }
    public static List<Integer> permutationEquation(List<Integer> p) {
        // Write your code here
        List<Integer> newList = new ArrayList<>();
        for (int i = 1; i <= p.size(); i++){
            int indexI = p.indexOf(i) + 1;
            int indexII = p.indexOf(indexI) + 1;
            newList.add(indexII);
        }
        return newList;
    }
}