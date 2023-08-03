package Test;

import java.util.*;

public class GiaiThuat1 {
    public static void main(String[] args) {
        anaString("ấdbsbytwbnwn");
    }
    public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = map(dictionary);
        for (String string : query){
            string = anaString(string);
            if (map.containsKey(string)){
                list.add(map.get(string));
            } else {
                list.add(0);
            }
        }
        return list;
    }
    public static Map<String, Integer> map(List<String> dictionary){
        Map<String, Integer> map = new HashMap<>();
        for (String string : dictionary){
            string = anaString(string);
            if (map.containsKey(string)){
                map.put(string, map.get(string) + 1);
            } else {
                map.put(string, 1);
            }
        }
        return map;
    }
    public static String anaString(String str){
        List<Character> charactersList = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            charactersList.add(str.charAt(i));
        }
        Collections.sort(charactersList);
        String newString = "";
        for(Character character : charactersList){
            newString += character;
        }
        return newString;
    }
}
