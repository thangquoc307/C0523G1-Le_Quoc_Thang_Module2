package Training.hack_rank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ServiceLane {
    public static void main(String[] args) {
        List<List<Integer>> cases = new ArrayList<>();
        cases.add(new ArrayList<>(Arrays.asList(new Integer[]{2,3,1,2,3,2,3,3})));
        cases.add(new ArrayList<>(Arrays.asList(new Integer[]{0,3})));
        cases.add(new ArrayList<>(Arrays.asList(new Integer[]{4,6})));
        cases.add(new ArrayList<>(Arrays.asList(new Integer[]{6,7})));
        cases.add(new ArrayList<>(Arrays.asList(new Integer[]{3,5})));
        cases.add(new ArrayList<>(Arrays.asList(new Integer[]{0,7})));
        System.out.println(serviceLane(8, cases));
    }
    public static List<Integer> serviceLane(int n, List<List<Integer>> cases) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        List<Integer> lane = cases.get(0);
        for (int i = 1; i < cases.size(); i++){
            List<Integer> service = cases.get(i);
            int min = lane.get(service.get(0));
            for (int j = service.get(0); j <= service.get(1); j++){

                if (min > lane.get(j)){
                    min = lane.get(j);
                }
            }
            result.add(min);
        }
        return result;
    }
}
