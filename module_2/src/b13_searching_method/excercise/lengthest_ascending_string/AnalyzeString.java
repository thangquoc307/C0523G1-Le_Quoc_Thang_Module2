package b13_searching_method.excercise.lengthest_ascending_string;

import java.util.ArrayList;
public abstract class AnalyzeString {
    public static void lengthestAcsendingString(String string){
        ArrayList <Character> list = new ArrayList<>();
        list.add(string.charAt(0));
        for (int i = 1; i < string.length(); i++){
            if (string.charAt(i - 1) <= string.charAt(i)){
                list.add(string.charAt(i));
            }
        }
        String maxLengthestString = "";
        for (Character keyWord : list){
            maxLengthestString += keyWord.toString();
        }
        System.out.println("Lengthest Ascending String : " + maxLengthestString);
    }
}
