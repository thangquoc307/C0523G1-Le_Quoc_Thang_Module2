package Test.hack_rank;

import java.util.ArrayList;
import java.util.List;

public class FindDigits {
    public static void main(String[] args) {
        System.out.println(findDigits(12));
        System.out.println(findDigits(1012));
    }
    public static int findDigits(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < ("" + n).length(); i++){
            list.add(Integer.parseInt("" + ("" + n).charAt(i)));
        }
        int count = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) != 0 && n % list.get(i) == 0){
                count++;
            }
        }
        return count;
    }
}
