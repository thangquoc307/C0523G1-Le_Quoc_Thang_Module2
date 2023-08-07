package Training.hack_rank;
import java.util.HashMap;
import java.util.Map;

public class Encryption {
    public static void main(String[] args) {
        System.out.println(encryption("if man was meant to stay on the ground god would have given us roots"));
        System.out.println(encryption("have a nice day"));
        System.out.println(encryption("iffactsdontfittotheorychangethefacts"));
    }
    public static String encryption(String s) {
        // Write your code here
        String string = s.replaceAll(" ", "");
        double length = Math.pow(string.length(), 0.5);
        int row = (int)Math.ceil(length);

        String[] stringList = string.split("");
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < stringList.length; i++){
            Integer index = i % (row);
            if (map.containsKey(index)){
                map.put(index, map.get(index) + stringList[i]);
            } else {
                map.put(index, stringList[i]);
            }
        }
        String result = "";
        for (Integer integer : map.keySet()){
            result += (map.get(integer) + " ");
        }
        return result.trim();
    }
}
