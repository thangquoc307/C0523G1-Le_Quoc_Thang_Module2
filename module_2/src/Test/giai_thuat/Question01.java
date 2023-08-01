package Test.giai_thuat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class Question01 {
    //Cho một mảng số nguyên Hãy kiểm tra xem tần số xuất hiện của tất cả các số nguyên trong mảng có bằng nhau hay không
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {1,2,2,3,1,3,1,3};
        int[] arr3 = {4,3,2,1,4,2,3,1,1};
        int[] arr4 = {4,3,2,1,4,3,2,1};
        int[] arr5 = {100};

        System.out.println(checkEqualFrequency(arr1));
        System.out.println(checkEqualFrequency(arr2));
        System.out.println(checkEqualFrequency(arr3));
        System.out.println(checkEqualFrequency(arr4));
        System.out.println(checkEqualFrequency(arr5));
    }
    public static Boolean checkEqualFrequency(int[] array){
        Map<Integer, Integer> mapInterger = new HashMap<>();
        for (Integer integer : array){
            if (mapInterger.containsKey(integer)){
                mapInterger.put(integer, mapInterger.get(integer) + 1);
            } else {
                mapInterger.put(integer, 1);
            }
        }
        if (mapInterger.keySet().size() < 2){
            return false;
        } else {
            Set<Integer> uniqueList = new HashSet<>();
            for (Integer integer : mapInterger.keySet()){
                uniqueList.add(mapInterger.get(integer));
            }
            if (uniqueList.size() == 1){
                return true;
            } else {
                return false;
            }
        }
    }
}
