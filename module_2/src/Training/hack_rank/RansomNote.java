package Training.hack_rank;

import java.util.*;

public class RansomNote {
    public static void main(String[] args) {

        List<String> magazine = new ArrayList<>(Arrays.asList(new String[]{"give", "me", "one", "grand", "today", "night"}));
        List<String> note = new ArrayList<>(Arrays.asList(new String[]{"give", "me", "grand", "Today"}));
        checkMagazine(magazine, note);
    }
    public static void checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here
        Map<String, Integer> magazineMap = updateMap(magazine);
        Map<String, Integer> noteMap = updateMap(note);

        for (String noteMapKey : noteMap.keySet()){
            if (!magazineMap.containsKey(noteMapKey) || noteMap.get(noteMapKey) > magazineMap.get(noteMapKey)){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
    public static Map<String, Integer> updateMap(List<String> list){
        Map<String, Integer> map = new HashMap<>();
        for (String string : list){
            if (map.containsKey(string)){
                map.put(string, map.get(string) + 1);
            } else {
                map.put(string, 1);
            }
        }
        return map;
    }
}
