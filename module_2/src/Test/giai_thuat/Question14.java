package Test.giai_thuat;

import java.util.Set;
import java.util.TreeSet;

public class Question14 {
    //Viết phương thức đếm số ký tự khác nhau ở chuỗi đầu vào.
    public static void main(String[] args) {
        System.out.println(countDifferentWord("cabca"));
        System.out.println(countDifferentWord("cabcde"));
        System.out.println(countDifferentWord("ccccccccccccc"));
        System.out.println(countDifferentWord("12sdvcs"));
        System.out.println(countDifferentWord("ca"));

    }
    public static int countDifferentWord(String string){
        Set<Character> set = new TreeSet<>();
        for (int i = 0; i < string.length(); i++){
            set.add(string.charAt(i));
        }
        return set.size();
    }
}
