package Test.giai_thuat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question6 {
    //Viết hàm truyền vào một chuỗi findChar(string)
    //Hàm trả về 1 mảng chứa các ký tự xuất hiện nhiều hơn 1 lần trong chuỗi. Nếu không có ký tự nào xuất hiện nhiều hơn 1 lần thì trả về mảng rỗng
    public static void main(String[] args) {
        System.out.println(findChar("abcbdcef"));
        System.out.println(findChar("abdcef"));
        System.out.println(findChar("abdcef123d"));
        System.out.println(findChar("abdceffecdba"));
        System.out.println(findChar("a"));
    }
    public static List<Character> findChar(String string){
        Map<Character, Integer> map = new HashMap<>();
        List<Character> result = new ArrayList<>();
        for (int i = 0; i < string.length(); i++){
            char word = string.charAt(i);
            if (map.containsKey(word)){
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        for (Character character : map.keySet()){
            if (map.get(character) > 1){
                result.add(character);
            }
        }
        return result;
    }
}
