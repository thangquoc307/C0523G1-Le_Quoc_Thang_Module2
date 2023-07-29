package Test.hack_rank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class BiggerIsGreater {
    public static void main(String[] args) {
        System.out.println(biggerIsGreater("5678"));
    }
    public static String biggerIsGreater(String w) {
        ArrayList<Character> stringList = new ArrayList<>();
        for (int i = 0; i < w.length(); i++){
            stringList.add(w.charAt(i));
        }
        List<String> listResult = chinhHop(stringList);
        int index = listResult.lastIndexOf(w);

        if (index == listResult.size() - 1){
            return "no answer";
        } else {
            return listResult.get(index + 1);
        }
    }
    public static List<String> chinhHop(List<Character> stringList){
        //Tạo tổ hợp
        int n = stringList.size();
        int factor = (int) Math.pow(n, n);
        List<List<Integer>> indexList = new ArrayList<>();

        for (int i = 0; i < factor; i++) {
            List<Integer> branchList = new ArrayList<>();
            int num = i;
            for (int j = 0; j < n; j++) {
                branchList.add(num % n);
                num = num / n;
            }
            indexList.add(branchList);
        }
        //Tạo chỉnh hợp
        List<List<Integer>> newList = new ArrayList<>();
        for (int i = 0; i < indexList.size(); i++){
            List<Integer> checkList = indexList.get(i);
            if (checkUnique(checkList)){
                newList.add(checkList);
            }
        }
        //Tham chiếu từ Index sang phần tử mảng
        List<String> newStringList = referenceList(newList, stringList);
        Collections.sort(newStringList);

        for (String str : newStringList){
            System.out.println(str);
        }
        return newStringList;
    }

    public static Boolean checkUnique(List<Integer> list){
        List<Integer> checkList = new ArrayList<>();
        for (Integer number : list){
            if (!checkList.contains(number)){
                checkList.add(number);
            }
        }
        return list.size() == checkList.size();
    }
    public static List<String> referenceList(List<List<Integer>> indexList, List<Character> reference){
        //Chuyển index đối chiếu trong list
        List<String> result = new ArrayList<>();
        for (List<Integer> list : indexList){
            String text = "";
            for (int i = 0; i < list.size(); i++){
                int index = list.get(i);
                text += reference.get(index);
            }
            result.add(text);
        }
        return result;
    }
}
