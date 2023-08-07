package Training.hack_rank;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheGridSearch {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("7283455864");
        list1.add("6731158619");
        list1.add("8988242643");
        list1.add("3830589324");
        list1.add("2229505813");
        list1.add("5633845374");
        list1.add("6473530293");
        list1.add("7053106601");
        list1.add("0834282956");
        list1.add("4607924137");
        List<String> list2 = new ArrayList<>();
        list2.add("9505");
        list2.add("3845");
        list2.add("3530");
        System.out.println(gridSearch(list1, list2));
    }
    public static String gridSearch(List<String> G, List<String> P) {
        // Write your code here
        String mainString = "";
        for (String string : G){
            mainString += string;
        }
        int length = G.get(0).length() - P.get(0).length();
        String regex = ".*";
        for (int i = 0; i < P.size(); i++){
            regex += P.get(i);
            if (i != P.size() - 1){
                regex += ".{" + length + "}";
            } else {
                regex += ".*";
            }
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mainString);
        Boolean check = matcher.matches();
        if (check){
            return "YES";
        } else {
            return "NO";
        }
    }
}
