package Training.giai_thuat;

import java.util.HashSet;
import java.util.Set;

public class Question23 {
    //Cho một mảng số nguyên. Hãy kiểm tra xem nó có tạo thành một cấp số cộng hay không?
    public static void main(String[] args) {

        System.out.println(isArithmeticProgression(new int[] {1,4,7}));
        System.out.println(isArithmeticProgression(new int[] {2,4,7}));
        System.out.println(isArithmeticProgression(new int[] {1,5,9,13}));
        System.out.println(isArithmeticProgression(new int[] {0,4,8,11}));
        System.out.println(isArithmeticProgression(new int[] {1,4,7,10}));
    }
    public static Boolean isArithmeticProgression(int[] arr){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length - 1; i++){
            set.add(arr[i + 1] - arr[i]);
        }
        return set.size() == 1;
    }
}
