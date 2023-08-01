package Test.giai_thuat;

public class Question09 {
    //Người ta định nghĩa số vòng là một số tự nhiên mà mà chữ số đầu trùng với chữ số cuối của nó. Ví dụ 303, 101, 8, 88 là những số vòng.
    public static void main(String[] args) {
        System.out.println(checkCirlenum(9, 13));
        System.out.println(checkCirlenum(10, 100));
        System.out.println(checkCirlenum(10, 30));
        System.out.println(checkCirlenum(5, 25));
        System.out.println(checkCirlenum(10, 20));

    }
    public static int checkCirlenum(int l, int r){
        int min = r;
        int max = l;
        if (l < r){
            min = l;
            max = r;
        }
        int count = 0;
        for (int i = min; i <= max; i++){
            if (check(i)){
                count++;
            }
        }
        return count;
    }
    public static Boolean check(int number){
        String numberString = "" + number;
        return numberString.charAt(0) == numberString.charAt(numberString.length() - 1);
    }
}
