package Training.hack_rank;
import java.util.*;

public class FindString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aab");
        list.add("aac");
        List<Integer> index = new ArrayList<>();
        index.add(3);
        index.add(3);
        index.add(8);
        index.add(9);
        index.add(23);
        System.out.println(findStrings(list, index));
    }
    public static List<String> findStrings(List<String> w, List<Integer> queries) {
        Set<String> list = new TreeSet<>();
        List<String> result = new ArrayList<>();
        for (String string : w){
            list.addAll(analyzeString(string));
        }
        List<String> newList = new ArrayList<>(list);
        for (int i = 0; i < queries.size(); i++){
            if(newList.size() < queries.get(i)){
                result.add("INVALID");
            }else {
                result.add(newList.get(queries.get(i) - 1));
            }
        }
        return result;
    }
    public static Set<String> analyzeString(String string){
        Set<String> list = new HashSet<>();
        for (int i = 1; i <= string.length(); i++){
            for (int j = 0; j <= string.length() - i; j++) {
                list.add(string.substring(j, j + i));
            }
        }
        return list;
    }
}
