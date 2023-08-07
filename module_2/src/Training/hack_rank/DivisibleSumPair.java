package Training.hack_rank;

import java.util.List;

public class DivisibleSumPair {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

        int count = 0;
        for (int i = 0; i < ar.size() - 1; i++){
            for (int j = i + 1; j < ar.size(); j++){
                if ((ar.get(i) + ar.get(j))%k == 0){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
