package Test.giai_thuat;

import java.util.ArrayList;
import java.util.List;

public class Question22 {
    //Một người bạn của bạn muốn thử thách bạn một trò chơi nhỏ. Anh ta đưa cho bạn một con số và muốn bạn tìm hai số nguyên tố có tổng bằng số đã cho.
    public static void main(String[] args) {
        print(findNumber(4));
        print(findNumber(17));
        print(findNumber(24));
        print(findNumber(8));
        print(findNumber(12));
    }
    public static int[] findNumber(int number){
        List<Integer> prime = primeList(number);
        for (int i = 0; i < prime.size() - 1; i++){
            for (int j = i; j < prime.size(); j++){
                if (prime.get(i) + prime.get(j) == number){
                    return new int[] {prime.get(i), prime.get(j)};
                }
            }
        }
        return new int[] {};
    }
    public static List<Integer> primeList(int numberMax){
        List<Integer> prime = new ArrayList<>();
        prime.add(2);
        for (int i = 3; i <= numberMax; i++){
            int count = 0;
            for (int j = 2; j <= i/2; j++){
                if (i % j == 0){
                    count++;
                }
            }
            if (count == 0){
                prime.add(i);
            }
        }
        return prime;
    }
    public static void print(int[] arr){
        if (arr.length == 2){
            System.out.println(arr[0] + " - " + arr[1]);
        } else {
            System.out.println("Không kiếm ra bạn ei");
        }
    }
}
