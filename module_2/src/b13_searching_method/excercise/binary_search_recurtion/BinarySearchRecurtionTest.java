package b13_searching_method.excercise.binary_search_recurtion;

public class BinarySearchRecurtionTest {
    public static void main(String[] args) {
        Integer[] list = {12,20,45,32,46,76,43,22,11,78,54,74,26,89,34};

        System.out.println(SearchRecurtion.binarySearch(list, 54));
        System.out.println("");
        System.out.println(SearchRecurtion.binarySearch(list, 0));
        System.out.println("");
        System.out.println(SearchRecurtion.binarySearch(list, 34));
    }
}
