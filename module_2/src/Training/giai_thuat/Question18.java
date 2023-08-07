package Training.giai_thuat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class Question18 {
    //Cho một mảng số nguyên
    //Hãy viết chương trình tìm ra một mảng mới, sao cho các phần tử trong 2 mảng này chứa đủ các số nguyên liên tiếp của một khoảng nào đó
    public static void main(String[] args) {
        System.out.println(makeArrayConsecutive(new int[] {6, 2, 3, 8}));
        System.out.println(makeArrayConsecutive(new int[] {6, 2, 3, 8, 10}));
        System.out.println(makeArrayConsecutive(new int[] {6, 1, 3, 8, 11}));
        System.out.println(makeArrayConsecutive(new int[] {6, 11}));
        System.out.println(makeArrayConsecutive(new int[] {2, 3, 8}));
    }
    public static List<Integer> makeArrayConsecutive(int[] arr){
        Set<Integer> set = new TreeSet<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        List<Integer> setToList = new ArrayList<>(set);
        for (int i = setToList.get(0); i < setToList.get(setToList.size() - 1); i++){
            if (!set.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}
