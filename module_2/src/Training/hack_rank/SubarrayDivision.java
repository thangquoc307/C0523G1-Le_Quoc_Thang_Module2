package Training.hack_rank;
import java.util.ArrayList;
import java.util.List;

public class SubarrayDivision {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(4);
        int count = birthday(s, 4, 1);
        System.out.println(count);
    }
    public static int birthday(List<Integer> s, int d, int m) {
        int length = s.size();
        int count = 0;
        for (int i = 0; i < (length - m + 1); i++){
            int sum = 0;
            for (int j = 0; j < m; j++){
                sum += s.get(i + j);
            }
            if (sum == d){
                count++;
            }
        }
        return count;
    }
}
