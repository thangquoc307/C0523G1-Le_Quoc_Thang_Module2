package Training.hack_rank;

public class SherlockAndSquares {
    public static void main(String[] args) {
        System.out.println(squares(3,9));
        System.out.println(squares(17,24));

    }
    public static int squares(int a, int b) {
        // Write your code here
        int i = 1;
        int count = 0;
        while (true){
            double pow = Math.pow(i, 2);
            if (pow >= a && pow <= b){
                count++;
            } else if (pow > b) {
                break;
            }
            i++;
        }
        return count;
    }
}
