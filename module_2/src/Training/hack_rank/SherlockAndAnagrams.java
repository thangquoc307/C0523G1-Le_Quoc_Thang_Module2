package Training.hack_rank;
import java.util.*;

public class SherlockAndAnagrams {
    public static void main(String[] args) {
        System.out.println(sherlockAndAnagrams("abba"));
        System.out.println(sherlockAndAnagrams("abcd"));
        System.out.println(sherlockAndAnagrams("ifailuhkqq"));
        System.out.println(sherlockAndAnagrams("kkkk"));
        System.out.println(sherlockAndAnagrams("cdcd"));
    }
    public static int sherlockAndAnagrams(String s) {
        // Write your code here
        List<String> list = new ArrayList<>();
        for (int i = 1; i < s.length(); i++){
            for (int j = 0; j < s.length() - i + 1; j++){
                list.add(standardString(s.substring(j, j + i)));
            }
        }
        Map<String, Integer> map = new HashMap<>();
        for (String str : list){
            if (map.containsKey(str)){
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        int count = 0;
        for (String string : map.keySet()){
            count += countTime(map.get(string));
        }
        return count;
    }
    public static String standardString(String string){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < string.length(); i++){
            list.add("" + string.charAt(i));
        }
        Collections.sort(list);
        String result = "";
        for (String str : list){
            result += str;
        }
        return result;
    }
    public static int countTime(int number){
        int count = 0;
        for (int i = 1; i < number; i++){
            count += i;
        }
        return count;
    }
}
