package b11_stack_queue.excercise.keyword_frequency;

import java.util.HashMap;
import java.util.Map;
public class Keyword {
    private String str;
    private Map<Character, Integer> listKey = new HashMap<>();

    public Keyword(String str) {
        this.str = str;
        for (int i = 0; i < str.length(); i++){
            if (!listKey.containsKey(str.charAt(i))){
                listKey.put(str.charAt(i), 1);
            }else {
                listKey.put(str.charAt(i), listKey.get(str.charAt(i)) + 1);
            }
        }
    }
    public String getStr() {
        return str;
    }
    public void setStr(String str) {
        this.str = str;
    }
    public void countWord(){

        for (Character key : listKey.keySet()){
            int value = listKey.get(key);
            System.out.println("Ký tự : " + key + " Xuất hiện " + value + " lần");
        }
    }
}
