package Training.hack_rank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppleAndOrange {
    public static void main(String[] args) {
        List<Integer> apples = new ArrayList<>(Arrays.asList(new Integer[]{-2,2,1}));
        List<Integer> oranges = new ArrayList<>(Arrays.asList(new Integer[]{5,-6}));
        countApplesAndOranges(7,11,5,15,apples,oranges);

    }
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int countApples = 0;
        int countOrange = 0;
        for (Integer integer : apples){
            int position = a + integer;
            if (position <= t && position >= s){
                countApples++;
            }
        }
        System.out.println(countApples);
        for (Integer integer : oranges){
            int position = b + integer;
            if (position <= t && position >= s){
                countOrange++;
            }
        }
        System.out.println(countOrange);
    }
}
