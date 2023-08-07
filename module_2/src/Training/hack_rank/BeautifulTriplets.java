package Training.hack_rank;

import java.util.ArrayList;
import java.util.List;

public class BeautifulTriplets {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(10);
        System.out.println(beautifulTriplets(3, list));
    }
    public static int beautifulTriplets(int d, List<Integer> arr) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size() - 2; i++){
            int number1 = arr.get(i);
            for (int j = i + 1; arr.get(j) <= arr.get(i) + d && j < arr.size() - 1; j++){
                int number2 = arr.get(j);
                for (int k = j + 1; arr.get(j) <= arr.get(j) + d && k < arr.size(); k++){
                    int number3 = arr.get(k);
                    if (number1 + d == number2 && number2 + d == number3){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
