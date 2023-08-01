package Test.giai_thuat;

public class Question03 {
    //Kiểm tra mảng có “đẹp” hay không
    //Một mảng được gọi là "đẹp" nếu mảng đó chứa một phần tử mà phần tử đó chia mảng làm 2 phần (không rỗng và không chứa phần tử đó) có tổng bằng nhau.
    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3,3};
        int[] array3 = {1,2,3,4};
        int[] array4 = {3,2,4,5,9};
        int[] array5 = {1,2,-1,2};

        System.out.println(check(array1));
        System.out.println(check(array2));
        System.out.println(check(array3));
        System.out.println(check(array4));
        System.out.println(check(array5));

    }
    public static Boolean check(int[] list){
        if (list.length < 3){
            return false;
        } else {
            for (int i = 1; i < list.length - 1; i++){
                int sum1 = 0;
                int sum2 = 0;
                for (int j = 0; j < i; j++){
                    sum1 += list[j];
                }
                for (int j = i + 1; j < list.length; j++){
                    sum2 += list[j];
                }
                if (sum1 == sum2){
                    return true;
                }
            }
            return false;
        }
    }
}
