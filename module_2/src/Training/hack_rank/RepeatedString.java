package Training.hack_rank;

import java.util.ArrayList;
import java.util.List;

public class RepeatedString {
    public static void main(String[] args) {
        System.out.println(repeatedString("ceebbcb", 817723));

    }
    public static long repeatedString(String s, long n) {
        // Write your code here
        String[] strings = s.split("");
        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < s.length(); i++){
            if (("a").equals(s.charAt(i) + "")){
                index.add(i);
            }
        }
        long fullRepeat = Math.floorDiv(n, s.length());
        long remainder = n % s.length();
        int count = 0;
        for (Integer integer : index){
            if (integer < remainder){
                count++;
            }
        }
        return fullRepeat * index.size() + count;
    }
}
