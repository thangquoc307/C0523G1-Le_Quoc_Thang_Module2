package b13_searching_method.excercise.binary_search_recurtion;
import java.util.Arrays;
public class SearchRecurtion {
    private static void print(Integer[] printList){
        for (Integer number : printList){
            System.out.print(number + " ");
        }
        System.out.println("");
    }
    public static String binarySearch(Integer[] list, int numberSearch){
        System.out.println("Chuỗi hiện có :");
        print(list);
        Arrays.sort(list);
        System.out.println("Chuỗi đã sắp xếp :");
        print(list);

        int head = 0;
        int tail = list.length - 1;

        while (head <= tail){
            int mid = (head + tail) / 2;
            if (numberSearch > list[mid]){
                head = mid + 1;
            }else if (numberSearch < list[mid]) {
                tail = mid - 1;
            }else{
                return "Số bạn cần ở vị trí : " + mid;
            }
        }
        return "Kiếm không ra số bạn muốn";
    }
}
