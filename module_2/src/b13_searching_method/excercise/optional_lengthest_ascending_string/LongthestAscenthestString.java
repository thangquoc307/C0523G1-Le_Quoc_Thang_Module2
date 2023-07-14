package b13_searching_method.excercise.optional_lengthest_ascending_string;

import java.util.ArrayList;
import java.util.Arrays;

public class LongthestAscenthestString {
    public static void longestAscendingString(String string){
        System.out.println("Các chuỗi ký tự tăng dần");
        ArrayList <String> list = splitString(string);
        showList(list);
        System.out.println("");

        int ind = 0;
        for (int i = 0; i < list.size(); i++){
            if(list.get(ind).length() < list.get(i).length()){
                ind = i;
            }
        }
        System.out.println("Ký tự dài nhất : " + list.get(ind));
    }
    private static ArrayList<String> splitString(String string){
        ArrayList list = new ArrayList<String>();
        for(int i = 0; i < string.length(); i++){
            String test = "" + string.charAt(i);
            for (int j = i + 1; j < string.length(); j++){
                if(string.charAt(j - 1) > string.charAt(j)){
                    i = j - 1;
                    break;
                }
                test += string.charAt(j);
            }
            list.add(test);
        }
        return list;
    }
    private static void showList(ArrayList<String> list){
        for (String string : list){
            System.out.println(string);
        }
    }
}
