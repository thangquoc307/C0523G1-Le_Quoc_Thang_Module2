package Training.hack_rank;

import java.util.*;

public class AcmIcpcTeam {
    public static void main(String[] args) {
        System.out.println(acmTeam(new ArrayList<>(Arrays.asList(new String[]{"10101", "11110", "00010"}))));
        System.out.println(acmTeam(new ArrayList<>(Arrays.asList(new String[]{"10101", "11100", "11010", "00101"}))));
    }
    public static List<Integer> acmTeam(List<String> topic) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        int max = 0;
        int count = 0;
        for (int i = 0; i < topic.size() - 1; i++){
            for (int j = i + 1; j < topic.size(); j++){
                int element = combineTeam(topic.get(i), topic.get(j), max);
                if (max < element){
                    max = element;
                    count = 1;
                } else if (max == element){
                    count++;
                }
            }
        }
        result.add(max);
        result.add(count);
        return result;
    }
    public static int combineTeam(String str1, String str2, int currentMax){
        String[] str1Array = str1.split("");
        String[] str2Array = str2.split("");
        int count = str1Array.length;
        for (int i = 0; i < str1Array.length; i++){
            if (count < currentMax){
                return -1;
            }
            if (str1Array[i].equals("0") && str2Array[i].equals("0")){
                count--;
            }
        }
        return count;
    }
}
