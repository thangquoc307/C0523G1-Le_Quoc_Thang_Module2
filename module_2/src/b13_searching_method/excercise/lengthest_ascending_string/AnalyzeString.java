package b13_searching_method.excercise.lengthest_ascending_string;

import java.util.ArrayList;
public abstract class AnalyzeString {
    private static String analyzeString(String string){
        ArrayList <Character> list = new ArrayList<>();
        list.add(string.charAt(0));
        int maxChar = string.charAt(0);
        for (int i = 1; i < string.length(); i++){
            if (maxChar <= string.charAt(i)){
                list.add(string.charAt(i));
                maxChar = string.charAt(i);
            }
        }
        String maxLengthestString = "";
        for (Character keyWord : list){
            maxLengthestString += keyWord.toString();
        }
        return maxLengthestString;
    }
    public static void lengthestAcsendingString(String string){
        ArrayList<String> listString = new ArrayList<>();
        ArrayList<Integer> splitPosition = new ArrayList<>();
        splitPosition.add(0);
        for(int i = 1; i < string.length(); i++){
            if(string.charAt(i) < string.charAt(i - 1)){
                splitPosition.add(i);
            }
        }
        for (Integer integer : splitPosition){
            listString.add(analyzeString(string.substring(integer)));
        }

        String valueLengthest = "";
        int lengthest = -1;
        for (int i = 0; i < listString.size(); i++){
            if (lengthest <= listString.get(i).length()){
                valueLengthest = listString.get(i);
                lengthest = listString.get(i).length();
            }
        }
        System.out.println("Lengthest String : " + valueLengthest);
    }
}
