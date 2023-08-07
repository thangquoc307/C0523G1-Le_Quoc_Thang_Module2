package Training.hack_rank;
import java.util.Set;
import java.util.TreeSet;

public class TwoStrings {
    public static void main(String[] args) {

    }
    public static String twoStrings(String s1, String s2) {
        // Write your code here
        Set<Character> set1 = new TreeSet<>();
        Set<Character> set2 = new TreeSet<>();
        for (int i = 0; i < s1.length(); i++){
            set1.add(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++){
            set2.add(s2.charAt(i));
        }

        for (Character character : set1){
            if (set2.contains(character)){
                return "YES";
            }
        }
        return "NO";
    }
}
