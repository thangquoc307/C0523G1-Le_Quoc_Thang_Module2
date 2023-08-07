package Training.giai_thuat;

import java.util.ArrayList;
import java.util.List;

public class Question20 {
    //Cho một mảng các xâu kí tự, hãy sắp xếp mảng tăng dần theo độ dài của xâu kí tự Nếu hai xâu kí tự có cùng độ dài, thứ tự của chúng giữ nguyên như thứ tự trong mảng ban đầu
    public static void main(String[] args) {
        System.out.println(sortByLength(new String[]{ "abc", "", "aaa", "a", "zz"}));
        System.out.println(sortByLength(new String[]{ "abc", "b", "aaa", "a", "zz"}));
        System.out.println(sortByLength(new String[]{ "", "a", "zz", "abc", "aaa", "123"}));
        System.out.println(sortByLength(new String[]{ "", "a", "aa", "zz", "abc"}));
        System.out.println(sortByLength(new String[]{ "", "a", "abc"}));
    }

    public static List<String> sortByLength(String[] array){
        List<String> list = new ArrayList<>();
        int[] minAndMax = minMaxLength(array);
        int min = minAndMax[0];
        int max = minAndMax[1];
        for (int i = min; i <= max; i++){
            for (int j = 0; j < array.length; j++){
                if (array[j].length() == i){
                    list.add(array[j]);
                }
            }
        }
        return list;
    }
    public static int[] minMaxLength(String[] array){
        int min = array[0].length();
        int max = array[0].length();
        for (int i = 0; i < array.length; i++){
            if (min > array[i].length()){
                min = array[i].length();
            }
            if (max < array[i].length()){
                max = array[i].length();
            }
        }
        return new  int[]{min, max};
    }
}
