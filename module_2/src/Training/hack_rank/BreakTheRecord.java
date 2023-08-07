package Training.hack_rank;
import java.util.ArrayList;
import java.util.List;
public class BreakTheRecord {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(20);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(25);
        list.add(1);

        System.out.println(breakingRecords(list));

    }
    public static List<Integer> breakingRecords(List<Integer> scores){
        List<Integer> recordHighLow = new ArrayList<>();
        int countHigh = 0;
        int countLow = 0;
        int high = scores.get(0);
        int low = scores.get(0);
        for (int i = 1; i < scores.size(); i++){
            if (high < scores.get(i)){
                countHigh++;
                high = scores.get(i);
            }
            if (low > scores.get(i)){
                countLow++;
                low = scores.get(i);
            }
        }
        recordHighLow.add(countHigh);
        recordHighLow.add(countLow);
        return recordHighLow;
    }
}
