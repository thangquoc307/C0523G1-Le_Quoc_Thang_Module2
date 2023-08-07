package Training.hack_rank;

public class BeautifulDaysAtTheMovies {
    public static void main(String[] args) {
        System.out.println(beautifulDays(20, 23, 6));
    }
    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int count = 0;
        for (int l = i; l <= j; l++){
            if (modOfReverse(l) % k == 0){
                count++;
            }
        }
        return count;
    }
    public static int modOfReverse(int number) {

        String str = "";
        for (int i = ("" + number).length() - 1; i >=0; i--){
            str += ("" + number).charAt(i);
        }
        return Math.abs(number - Integer.parseInt(str));
    }
}
