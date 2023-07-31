package Test.giai_thuat;
import java.util.ArrayList;
import java.util.List;
public class Question2 {
    //Cho hai xâu kí tự, tìm số lượng ký tự chung giữa chúng.
    public static void main(String[] args) {

        System.out.println(commonCharacterCount("aabcc", "adcaa"));
        System.out.println(commonCharacterCount("Abcdef", "Adghjklbc"));
        System.out.println(commonCharacterCount("Abcdef1234", "Uykhldg1"));
        System.out.println(commonCharacterCount("A", "BCd"));
        System.out.println(commonCharacterCount("Abc", "ade"));
    }
    public static Integer commonCharacterCount(String s1, String s2){
        List<Character> s1List = splitString(s1);
        List<Character> s2List = splitString(s2);
        List<Character> commonList = new ArrayList<>();
        for (int i = 0; i < s1List.size(); i++){
            if (s2List.contains(s1List.get(i))){
                commonList.add(s1List.get(i));
                s2List.remove(s1List.get(i));
                continue;
            }
        }
        System.out.println(commonList);
        return commonList.size();
    }
    public static List<Character> splitString(String text){
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < text.length(); i++){
            list.add(text.charAt(i));
        }
        return list;
    }
}
