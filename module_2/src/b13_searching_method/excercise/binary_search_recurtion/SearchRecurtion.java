package b13_searching_method.excercise.binary_search_recurtion;
public class SearchRecurtion {
        public static int binarySearch(int[] arr, int target) {
            return binarySearchRecursive(arr, target, 0, arr.length - 1);
        }

        private static int binarySearchRecursive(int[] arr, int target, int left, int right) {
            if (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    return binarySearchRecursive(arr, target, mid + 1, right);
                } else {
                    return binarySearchRecursive(arr, target, left, mid - 1);
                }
            }

            return -1;
        }

        public static void main(String[] args) {
            int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
            int target = 7;
            int index = binarySearch(arr, target);

            if (index != -1) {
                System.out.println("Target " + target + " found at index: " + index);
            } else {
                System.out.println("Target " + target + " not found in the array.");
            }
        }
}
