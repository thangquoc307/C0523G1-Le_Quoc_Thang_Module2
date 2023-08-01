package Test.giai_thuat;
import java.util.*;
public class Question17 {
    //Cho hai xâu ký tự, hãy kiểm tra xem có tồn tại phương án đổi chỗ các kí tự ở trong xâu thứ nhất để trở thành xâu thứ hai được hay không?
    public static void main(String[] args) {
        System.out.println(charactersRearrangement("abcd", "cbad"));
        System.out.println(charactersRearrangement("ab", "bc"));
        System.out.println(charactersRearrangement("abcc", "bcd"));
        System.out.println(charactersRearrangement("abcc", "bcac"));
        System.out.println(charactersRearrangement("Ab123", "23ba1"));
    }
    public static Boolean charactersRearrangement(String str1, String str2){
        str1 = sortString(str1);
        str2 = sortString(str2);
        return str1.equals(str2);
    }
    public static String sortString(String str){
        String result = "";
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++){
            list.add(str.charAt(i));
        }
        Collections.sort(list);
        for (Character character : list){
            result += character;
        }
        return result;
    }
}
