package Training.giai_thuat;

public class Question21 {
    //Tìm chữ số khác không cuối cùng của n!(giai thừa)
    public static void main(String[] args) {
        System.out.println(lastDigitDiffZero(5));
        System.out.println(lastDigitDiffZero(6));
        System.out.println(lastDigitDiffZero(10));
        System.out.println(lastDigitDiffZero(8));
        System.out.println(lastDigitDiffZero(12));
    }
    public static Character lastDigitDiffZero(int number){
        int numberFactoria = 1;
        for (int i = 1; i <= number; i++){
            numberFactoria *= i;
        }
        String string = "" + numberFactoria;
        for (int i = string.length() - 1; i >= 0; i--){
            if (string.charAt(i) != '0'){
                return string.charAt(i);
            }
        }
        return string.charAt(string.length() - 1);
    }
}
